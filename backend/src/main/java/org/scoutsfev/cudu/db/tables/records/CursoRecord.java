/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.scoutsfev.cudu.db.tables.Curso;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CursoRecord extends UpdatableRecordImpl<CursoRecord> implements Record10<Integer, String, Timestamp, Timestamp, Date, Integer, String, String, Boolean, Integer> {

	private static final long serialVersionUID = 1331329410;

	/**
	 * Setter for <code>public.curso.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.curso.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.curso.titulo</code>.
	 */
	public void setTitulo(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.curso.titulo</code>.
	 */
	public String getTitulo() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.curso.fecha_inicio_inscripcion</code>.
	 */
	public void setFechaInicioInscripcion(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.curso.fecha_inicio_inscripcion</code>.
	 */
	public Timestamp getFechaInicioInscripcion() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>public.curso.fecha_fin_inscripcion</code>.
	 */
	public void setFechaFinInscripcion(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.curso.fecha_fin_inscripcion</code>.
	 */
	public Timestamp getFechaFinInscripcion() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.curso.fecha_nacimiento_minima</code>.
	 */
	public void setFechaNacimientoMinima(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.curso.fecha_nacimiento_minima</code>.
	 */
	public Date getFechaNacimientoMinima() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>public.curso.plazas</code>.
	 */
	public void setPlazas(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.curso.plazas</code>.
	 */
	public Integer getPlazas() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.curso.descripcion_fechas</code>.
	 */
	public void setDescripcionFechas(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.curso.descripcion_fechas</code>.
	 */
	public String getDescripcionFechas() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.curso.descripcion_lugar</code>.
	 */
	public void setDescripcionLugar(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.curso.descripcion_lugar</code>.
	 */
	public String getDescripcionLugar() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.curso.visible</code>.
	 */
	public void setVisible(Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.curso.visible</code>.
	 */
	public Boolean getVisible() {
		return (Boolean) getValue(8);
	}

	/**
	 * Setter for <code>public.curso.coordinador_id</code>.
	 */
	public void setCoordinadorId(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.curso.coordinador_id</code>.
	 */
	public Integer getCoordinadorId() {
		return (Integer) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Integer, String, Timestamp, Timestamp, Date, Integer, String, String, Boolean, Integer> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Integer, String, Timestamp, Timestamp, Date, Integer, String, String, Boolean, Integer> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Curso.CURSO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Curso.CURSO.TITULO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Curso.CURSO.FECHA_INICIO_INSCRIPCION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return Curso.CURSO.FECHA_FIN_INSCRIPCION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return Curso.CURSO.FECHA_NACIMIENTO_MINIMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Curso.CURSO.PLAZAS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Curso.CURSO.DESCRIPCION_FECHAS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Curso.CURSO.DESCRIPCION_LUGAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field9() {
		return Curso.CURSO.VISIBLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return Curso.CURSO.COORDINADOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitulo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getFechaInicioInscripcion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getFechaFinInscripcion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getFechaNacimientoMinima();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPlazas();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getDescripcionFechas();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getDescripcionLugar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value9() {
		return getVisible();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getCoordinadorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value2(String value) {
		setTitulo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value3(Timestamp value) {
		setFechaInicioInscripcion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value4(Timestamp value) {
		setFechaFinInscripcion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value5(Date value) {
		setFechaNacimientoMinima(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value6(Integer value) {
		setPlazas(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value7(String value) {
		setDescripcionFechas(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value8(String value) {
		setDescripcionLugar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value9(Boolean value) {
		setVisible(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord value10(Integer value) {
		setCoordinadorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4, Date value5, Integer value6, String value7, String value8, Boolean value9, Integer value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CursoRecord
	 */
	public CursoRecord() {
		super(Curso.CURSO);
	}

	/**
	 * Create a detached, initialised CursoRecord
	 */
	public CursoRecord(Integer id, String titulo, Timestamp fechaInicioInscripcion, Timestamp fechaFinInscripcion, Date fechaNacimientoMinima, Integer plazas, String descripcionFechas, String descripcionLugar, Boolean visible, Integer coordinadorId) {
		super(Curso.CURSO);

		setValue(0, id);
		setValue(1, titulo);
		setValue(2, fechaInicioInscripcion);
		setValue(3, fechaFinInscripcion);
		setValue(4, fechaNacimientoMinima);
		setValue(5, plazas);
		setValue(6, descripcionFechas);
		setValue(7, descripcionLugar);
		setValue(8, visible);
		setValue(9, coordinadorId);
	}
}
