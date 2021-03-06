package org.scoutsfev.cudu.web;

import org.hibernate.validator.constraints.Email;
import org.scoutsfev.cudu.domain.*;
import org.scoutsfev.cudu.domain.commands.EditarPermisosUsuario;
import org.scoutsfev.cudu.domain.dto.UsuarioPermisosDto;
import org.scoutsfev.cudu.services.AuthorizationService;
import org.scoutsfev.cudu.services.UsuarioService;
import org.scoutsfev.cudu.storage.AsociadoRepository;
import org.scoutsfev.cudu.storage.UsuarioStorage;
import org.scoutsfev.cudu.web.validacion.CodigoError;
import org.scoutsfev.cudu.web.validacion.ErrorUnico;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.audit.listener.AuditApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

import static org.springframework.http.ResponseEntity.badRequest;
import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    private final AsociadoRepository asociadoRepository;
    private final UsuarioService usuarioService;
    private final ApplicationEventPublisher eventPublisher;
    private final AuthenticationManager authenticationManager;
    private final AuthorizationService authorizationService;
    private final UsuarioStorage usuarioStorage;

    @Autowired
    public UsuarioController(AsociadoRepository asociadoRepository, UsuarioService usuarioService, ApplicationEventPublisher eventPublisher,
                             @Qualifier("authenticationManager") AuthenticationManager authenticationManager, AuthorizationService authorizationService,
                             UsuarioStorage usuarioStorage) {
        this.asociadoRepository = asociadoRepository;
        this.usuarioService = usuarioService;
        this.eventPublisher = eventPublisher;
        this.authenticationManager = authenticationManager;
        this.authorizationService = authorizationService;
        this.usuarioStorage = usuarioStorage;
    }

    @RequestMapping(value = "/autenticar", method = RequestMethod.POST)
    public ResponseEntity<Usuario> login(@RequestBody @Valid Credenciales credenciales, HttpServletRequest request) {
        // TODO Limpiar campos, sql, xss etc
        // TODO @RequestBody null?
        try {
            usuarioService.comprobarCaptcha(credenciales, request);
            Usuario usuario = autenticar(credenciales, request);
            usuarioService.marcarEntrada(usuario.getEmail());
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } catch (BadCredentialsException badCredentialsException) {
            usuarioService.marcarCaptcha(credenciales.getEmail(), true);
            throw badCredentialsException;
        } catch (Exception e) {
            logger.error("Error inesperado al autenticar al usuario ", e);
            throw e;
        }
    }

    @RequestMapping(value = "/reset", method = RequestMethod.POST)
    public ResponseEntity enviarInstruccionesReset(@RequestBody Credenciales credenciales, HttpServletRequest request) throws MessagingException {
        try {
            credenciales.setForzarComprobacion(true);
            usuarioService.comprobarCaptcha(credenciales, request);
            usuarioService.resetPassword(credenciales.getEmail(), true);
        } catch (Exception e) {
            // El método es publico, debemos evitar propagar la excepción o
            // comunicar la existencia de usuarios de alguna forma.
            // Deberíamos evitar hacer logging directo, aunque no estaría
            // mal incrementar un counter para ayudar al monitoring.
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    private Usuario autenticar(Credenciales credenciales, HttpServletRequest request) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(credenciales.getEmail(), credenciales.getPassword());
        authenticationToken.setDetails(new WebAuthenticationDetails(request));
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return (Usuario)authentication.getPrincipal();
    }

    @RequestMapping(value = "/desautenticar", method = RequestMethod.POST)
    public ResponseEntity logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/actual", method = RequestMethod.GET)
    public ResponseEntity<Usuario> obtener(@AuthenticationPrincipal Usuario usuario) {
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @RequestMapping(value = "/activar/{id}", method = RequestMethod.POST)
    public ResponseEntity<ErrorUnico> activarUsuario(@PathVariable("id") Asociado asociado, @RequestBody @Valid @Email String email, @AuthenticationPrincipal Usuario usuario)
            throws MessagingException, UnsupportedEncodingException {
        if (!authorizationService.puedeEditarAsociado(asociado, usuario)) {
            eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "POST /usuario/activar" + asociado.getId()));
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        if (usuario.getId().equals(asociado.getId()))
            return new ResponseEntity<>(CodigoError.HabilitarUsuarioActual.asError(), HttpStatus.BAD_REQUEST);
        if (!asociado.isActivo())
            return new ResponseEntity<>(CodigoError.AsociadoInactivo.asError(), HttpStatus.BAD_REQUEST);
        if (usuarioService.existeActivacionEnCurso(email))
            return new ResponseEntity<>(CodigoError.ActivacionDeUsuarioEnCurso.asError(), HttpStatus.CONFLICT);
        if (asociadoRepository.existeOtroUsuarioConEseEmail(asociado.getId(), email))
            return new ResponseEntity<>(CodigoError.YaExisteUsuarioConEseEmail.asError(), HttpStatus.CONFLICT);

        asociado.setEmail(email);
        if (asociado.getUsuarioCreadoPorId() == null) {
            asociado.setUsuarioCreadoPorId(usuario.getId());
            asociado.setUsuarioCreadoPorNombre(usuario.getNombreCompleto());
        }
        asociadoRepository.save(asociado);
        usuarioService.resetPassword(asociado.getEmail(), false);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    /*
    * Uso:
    * GET /api/usuario/apikey/{id}
    * Envía un correo con el token generado como api key.
    */
    @RequestMapping(value = "/apikey/{id}", method = RequestMethod.GET)
    public ResponseEntity<ErrorUnico> apikeyUsuarioNoActivo(@PathVariable("id") Asociado asociado, @AuthenticationPrincipal Usuario usuario)
            throws MessagingException, UnsupportedEncodingException {
        if (!authorizationService.puedeEditarAsociado(asociado, usuario)) {
            eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "POST /usuario/apikey" + asociado.getId()));
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        if (usuario.getId().equals(asociado.getId()))
            return new ResponseEntity<>(CodigoError.HabilitarUsuarioActual.asError(), HttpStatus.BAD_REQUEST);
        if (!asociado.isActivo())
            return new ResponseEntity<>(CodigoError.AsociadoInactivo.asError(), HttpStatus.BAD_REQUEST);
        if (usuarioService.existeActivacionEnCurso(usuario.getEmail()))
            return new ResponseEntity<>(CodigoError.ActivacionDeUsuarioEnCurso.asError(), HttpStatus.CONFLICT);

        if (asociado.getUsuarioCreadoPorId() == null) {
            asociado.setUsuarioCreadoPorId(usuario.getId());
            asociado.setUsuarioCreadoPorNombre(usuario.getNombreCompleto());
        }
        asociadoRepository.save(asociado);
        usuarioService.nuevaApikey(asociado.getEmail());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/desactivar/{id}", method = RequestMethod.POST)
    public ResponseEntity<ErrorUnico> desactivarUsuario(@PathVariable("id") Asociado asociado, @RequestParam(required = false, defaultValue = "false") boolean desactivarAsociado, @AuthenticationPrincipal Usuario usuario) {
        if (!authorizationService.puedeEditarAsociado(asociado, usuario)) {
            eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "POST /usuario/desactivar" + asociado.getId()));
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        if (usuario.getId().equals(asociado.getId()))
            return new ResponseEntity<>(CodigoError.DeshabilitarUsuarioActual.asError(), HttpStatus.BAD_REQUEST);
        usuarioService.desactivarUsuario(asociado.getId(), desactivarAsociado);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/lenguaje", method = RequestMethod.POST)
    public ResponseEntity cambiarIdioma(@RequestBody String codigo, @AuthenticationPrincipal Usuario usuario) {
        boolean codigoCorrecto = usuarioService.cambiarIdioma(usuario, codigo);
        if (!codigoCorrecto)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public ResponseEntity<List<UsuarioPermisosDto>> obtenerTodos(@AuthenticationPrincipal Usuario usuario) {
        if (authorizationService.esTecnico(usuario)) {
            if (usuario.getAmbitoEdicion() == AmbitoEdicion.Asociacion && usuario.getRestricciones() != null && usuario.getRestricciones().getRestriccionAsociacion() != null)
                return ok(usuarioStorage.obtenerUsuariosDeUnaAsociacion(usuario.getRestricciones().getRestriccionAsociacion()));
            if (usuario.getAmbitoEdicion() == AmbitoEdicion.Federacion)
                return ok(usuarioStorage.obtenerUsuarios());
        }
        eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "GET /usuario/todos"));
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @RequestMapping(value = "/grupo/{grupoId}", method = RequestMethod.GET)
    public ResponseEntity<List<UsuarioPermisosDto>> obtenerUsuariosDeGrupo(@PathVariable("grupoId") String grupoId, @AuthenticationPrincipal Usuario usuario) {
        if (!authorizationService.puedeEditarUsuariosDelGrupo(grupoId, usuario)) {
            eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "GET /usuario/grupo/" + grupoId));
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        return ok(usuarioStorage.obtenerUsuariosDeUnGrupo(grupoId));
    }

    @RequestMapping(value = "/{asociadoId}/permisos", method = RequestMethod.PUT)
    public ResponseEntity editarPermisosUsuario(@RequestBody @Valid EditarPermisosUsuario command, @PathVariable("asociadoId") Integer asociadoId, @AuthenticationPrincipal Usuario usuario) {
        if (!authorizationService.puedeEditarAsociado(asociadoId, usuario)) {
            eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "PUT /usuario/" + asociadoId + "/permisos"));
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        // De momento sólo permitimos ambitos de edición de grupo o personales, el command restringe el resto.
        command.setUsuarioId(asociadoId);
        AmbitoEdicion ambito = command.isAmbitoPersonal() ? AmbitoEdicion.Personal : AmbitoEdicion.Grupo;
        usuarioStorage.establecerPermisos(command, ambito);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/{asociadoId}/email", method = RequestMethod.PUT)
    public ResponseEntity cambiarEmail(@RequestBody @Valid @Email String email, @PathVariable("asociadoId") Integer asociadoId, @AuthenticationPrincipal Usuario usuario) {
        if (!authorizationService.puedeEditarAsociado(asociadoId, usuario)) {
            eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getEmail(), EventosAuditoria.AccesoDenegado, "PUT /usuario/" + asociadoId + "/email"));
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        if (usuarioService.existeOtroUsuario(asociadoId, email))
            return new ResponseEntity(HttpStatus.CONFLICT);

        usuarioStorage.cambiarEmail(asociadoId, email);
        eventPublisher.publishEvent(new AuditApplicationEvent(usuario.getPassword(), EventosAuditoria.CambioEmail, "PUT /usuario/" + asociadoId + "/email"));
        return new ResponseEntity(HttpStatus.OK);
    }
}
