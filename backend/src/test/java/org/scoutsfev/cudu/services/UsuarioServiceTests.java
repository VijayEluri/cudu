package org.scoutsfev.cudu.services;

import org.junit.Before;
import org.junit.Test;
import org.scoutsfev.cudu.domain.Usuario;
import org.scoutsfev.cudu.storage.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class UsuarioServiceTests {

    private UsuarioRepository repository;
    private UsuarioService service;

    @Before
    public void setUp() throws Exception {
        repository = mock(UsuarioRepository.class);
        service = new UsuarioService(repository);
    }

    @Test(expected = UsernameNotFoundException.class)
    public void usuarios_nulos_producen_UsernameNotFoundException() {
        service.loadUserByUsername(null);
    }

    @Test(expected = UsernameNotFoundException.class)
    public void usuarios_vacios_producen_UsernameNotFoundException() {
        service.loadUserByUsername("");
    }

    @Test
    public void si_el_usuario_existe_lo_devuelve() {
        String username = "jack.sparrow";
        Usuario jackSparrow = new Usuario(username, "pirate", "Jack Sparrow", true, new String[] { "KRAAL" });
        when(repository.findOne(username)).thenReturn(jackSparrow);
        UserDetails userDetails = service.loadUserByUsername(username);
        assertEquals(jackSparrow, userDetails);
    }

    @Test
    public void si_el_usuario_no_existe_en_bbdd_lanza_UsernameNotFoundException() {
        when(repository.findOne(anyString())).thenReturn(null);
        buscarUsuarioEsperandoExcepcion("mike", UsernameNotFoundException.class);
        verify(repository, times(1)).findOne(anyString());
    }

    @Test
    public void si_el_usuario_es_nulo_no_se_produce_llamada_a_bbdd() {
        buscarUsuarioEsperandoExcepcion(null, UsernameNotFoundException.class);
        verify(repository, never()).findOne(null);
    }

    @Test
    public void si_el_usuario_es_vacio_no_se_produce_llamada_a_bbdd() {
        buscarUsuarioEsperandoExcepcion("", UsernameNotFoundException.class);
        verify(repository, never()).findOne("");
    }

    private void buscarUsuarioEsperandoExcepcion(String username, Class exceptionClass) {
        try {
            service.loadUserByUsername(username);
        } catch (Exception exception) {
            Assert.isInstanceOf(exceptionClass, exception);
        }
    }
}