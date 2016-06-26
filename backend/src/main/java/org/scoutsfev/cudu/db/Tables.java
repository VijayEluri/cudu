/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db;


import javax.annotation.Generated;

import org.scoutsfev.cudu.db.tables.Actividad;
import org.scoutsfev.cudu.db.tables.AsistenteActividad;
import org.scoutsfev.cudu.db.tables.Asociado;
import org.scoutsfev.cudu.db.tables.Cargo;
import org.scoutsfev.cudu.db.tables.CargoAsociado;
import org.scoutsfev.cudu.db.tables.Curso;
import org.scoutsfev.cudu.db.tables.CursoFormador;
import org.scoutsfev.cudu.db.tables.CursoParticipante;
import org.scoutsfev.cudu.db.tables.DtoActividadDetalle;
import org.scoutsfev.cudu.db.tables.DtoCargoAsociado;
import org.scoutsfev.cudu.db.tables.DtoDatosGrupoRama;
import org.scoutsfev.cudu.db.tables.DtoDatosGrupoTipo;
import org.scoutsfev.cudu.db.tables.DtoDatosPeriodoTipo;
import org.scoutsfev.cudu.db.tables.DtoDatosRamaTipo;
import org.scoutsfev.cudu.db.tables.DtoEstadoInscripcion;
import org.scoutsfev.cudu.db.tables.DtoMiembrosCurso;
import org.scoutsfev.cudu.db.tables.DtoMiembrosEscuela;
import org.scoutsfev.cudu.db.tables.Ficha;
import org.scoutsfev.cudu.db.tables.Grupo;
import org.scoutsfev.cudu.db.tables.Impresion;
import org.scoutsfev.cudu.db.tables.InformacionPago;
import org.scoutsfev.cudu.db.tables.Liquidacion;
import org.scoutsfev.cudu.db.tables.LiquidacionAsociado;
import org.scoutsfev.cudu.db.tables.LiquidacionBalance;
import org.scoutsfev.cudu.db.tables.LiquidacionBalanceResumen;
import org.scoutsfev.cudu.db.tables.LiquidacionCalculo;
import org.scoutsfev.cudu.db.tables.LiquidacionGrupos;
import org.scoutsfev.cudu.db.tables.Ronda;
import org.scoutsfev.cudu.db.tables.SchemaVersion;
import org.scoutsfev.cudu.db.tables.Token;
import org.scoutsfev.cudu.db.tables.ValoresFederativos;
import org.scoutsfev.cudu.db.tables.ValoresPorAsociacion;
import org.scoutsfev.cudu.db.tables.ValoresPorLiquidacion;


/**
 * Convenience access to all tables in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table public.actividad
	 */
	public static final Actividad ACTIVIDAD = org.scoutsfev.cudu.db.tables.Actividad.ACTIVIDAD;

	/**
	 * The table public.asistente_actividad
	 */
	public static final AsistenteActividad ASISTENTE_ACTIVIDAD = org.scoutsfev.cudu.db.tables.AsistenteActividad.ASISTENTE_ACTIVIDAD;

	/**
	 * The table public.asociado
	 */
	public static final Asociado ASOCIADO = org.scoutsfev.cudu.db.tables.Asociado.ASOCIADO;

	/**
	 * The table public.cargo
	 */
	public static final Cargo CARGO = org.scoutsfev.cudu.db.tables.Cargo.CARGO;

	/**
	 * The table public.cargo_asociado
	 */
	public static final CargoAsociado CARGO_ASOCIADO = org.scoutsfev.cudu.db.tables.CargoAsociado.CARGO_ASOCIADO;

	/**
	 * The table public.curso
	 */
	public static final Curso CURSO = org.scoutsfev.cudu.db.tables.Curso.CURSO;

	/**
	 * The table public.curso_formador
	 */
	public static final CursoFormador CURSO_FORMADOR = org.scoutsfev.cudu.db.tables.CursoFormador.CURSO_FORMADOR;

	/**
	 * The table public.curso_participante
	 */
	public static final CursoParticipante CURSO_PARTICIPANTE = org.scoutsfev.cudu.db.tables.CursoParticipante.CURSO_PARTICIPANTE;

	/**
	 * The table public.dto_actividad_detalle
	 */
	public static final DtoActividadDetalle DTO_ACTIVIDAD_DETALLE = org.scoutsfev.cudu.db.tables.DtoActividadDetalle.DTO_ACTIVIDAD_DETALLE;

	/**
	 * The table public.dto_cargo_asociado
	 */
	public static final DtoCargoAsociado DTO_CARGO_ASOCIADO = org.scoutsfev.cudu.db.tables.DtoCargoAsociado.DTO_CARGO_ASOCIADO;

	/**
	 * The table public.dto_datos_grupo_rama
	 */
	public static final DtoDatosGrupoRama DTO_DATOS_GRUPO_RAMA = org.scoutsfev.cudu.db.tables.DtoDatosGrupoRama.DTO_DATOS_GRUPO_RAMA;

	/**
	 * The table public.dto_datos_grupo_tipo
	 */
	public static final DtoDatosGrupoTipo DTO_DATOS_GRUPO_TIPO = org.scoutsfev.cudu.db.tables.DtoDatosGrupoTipo.DTO_DATOS_GRUPO_TIPO;

	/**
	 * The table public.dto_datos_periodo_tipo
	 */
	public static final DtoDatosPeriodoTipo DTO_DATOS_PERIODO_TIPO = org.scoutsfev.cudu.db.tables.DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO;

	/**
	 * The table public.dto_datos_rama_tipo
	 */
	public static final DtoDatosRamaTipo DTO_DATOS_RAMA_TIPO = org.scoutsfev.cudu.db.tables.DtoDatosRamaTipo.DTO_DATOS_RAMA_TIPO;

	/**
	 * The table public.dto_estado_inscripcion
	 */
	public static final DtoEstadoInscripcion DTO_ESTADO_INSCRIPCION = org.scoutsfev.cudu.db.tables.DtoEstadoInscripcion.DTO_ESTADO_INSCRIPCION;

	/**
	 * The table public.dto_miembros_curso
	 */
	public static final DtoMiembrosCurso DTO_MIEMBROS_CURSO = org.scoutsfev.cudu.db.tables.DtoMiembrosCurso.DTO_MIEMBROS_CURSO;

	/**
	 * The table public.dto_miembros_escuela
	 */
	public static final DtoMiembrosEscuela DTO_MIEMBROS_ESCUELA = org.scoutsfev.cudu.db.tables.DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA;

	/**
	 * The table public.ficha
	 */
	public static final Ficha FICHA = org.scoutsfev.cudu.db.tables.Ficha.FICHA;

	/**
	 * The table public.grupo
	 */
	public static final Grupo GRUPO = org.scoutsfev.cudu.db.tables.Grupo.GRUPO;

	/**
	 * The table public.impresion
	 */
	public static final Impresion IMPRESION = org.scoutsfev.cudu.db.tables.Impresion.IMPRESION;

	/**
	 * The table public.informacion_pago
	 */
	public static final InformacionPago INFORMACION_PAGO = org.scoutsfev.cudu.db.tables.InformacionPago.INFORMACION_PAGO;

	/**
	 * The table public.liquidacion
	 */
	public static final Liquidacion LIQUIDACION = org.scoutsfev.cudu.db.tables.Liquidacion.LIQUIDACION;

	/**
	 * The table public.liquidacion_asociado
	 */
	public static final LiquidacionAsociado LIQUIDACION_ASOCIADO = org.scoutsfev.cudu.db.tables.LiquidacionAsociado.LIQUIDACION_ASOCIADO;

	/**
	 * The table public.liquidacion_balance
	 */
	public static final LiquidacionBalance LIQUIDACION_BALANCE = org.scoutsfev.cudu.db.tables.LiquidacionBalance.LIQUIDACION_BALANCE;

	/**
	 * The table public.liquidacion_balance_resumen
	 */
	public static final LiquidacionBalanceResumen LIQUIDACION_BALANCE_RESUMEN = org.scoutsfev.cudu.db.tables.LiquidacionBalanceResumen.LIQUIDACION_BALANCE_RESUMEN;

	/**
	 * The table public.liquidacion_calculo
	 */
	public static final LiquidacionCalculo LIQUIDACION_CALCULO = org.scoutsfev.cudu.db.tables.LiquidacionCalculo.LIQUIDACION_CALCULO;

	/**
	 * The table public.liquidacion_grupos
	 */
	public static final LiquidacionGrupos LIQUIDACION_GRUPOS = org.scoutsfev.cudu.db.tables.LiquidacionGrupos.LIQUIDACION_GRUPOS;

	/**
	 * The table public.ronda
	 */
	public static final Ronda RONDA = org.scoutsfev.cudu.db.tables.Ronda.RONDA;

	/**
	 * The table public.schema_version
	 */
	public static final SchemaVersion SCHEMA_VERSION = org.scoutsfev.cudu.db.tables.SchemaVersion.SCHEMA_VERSION;

	/**
	 * The table public.token
	 */
	public static final Token TOKEN = org.scoutsfev.cudu.db.tables.Token.TOKEN;

	/**
	 * The table public.valores_federativos
	 */
	public static final ValoresFederativos VALORES_FEDERATIVOS = org.scoutsfev.cudu.db.tables.ValoresFederativos.VALORES_FEDERATIVOS;

	/**
	 * The table public.valores_por_asociacion
	 */
	public static final ValoresPorAsociacion VALORES_POR_ASOCIACION = org.scoutsfev.cudu.db.tables.ValoresPorAsociacion.VALORES_POR_ASOCIACION;

	/**
	 * The table public.valores_por_liquidacion
	 */
	public static final ValoresPorLiquidacion VALORES_POR_LIQUIDACION = org.scoutsfev.cudu.db.tables.ValoresPorLiquidacion.VALORES_POR_LIQUIDACION;
}
