/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.scoutsfev.cudu.db.tables.DtoMiembrosEscuela;


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
public class DtoMiembrosEscuelaRecord extends TableRecordImpl<DtoMiembrosEscuelaRecord> implements Record9<Integer, Integer, String, String, String, Boolean, String, String, Date> {

	private static final long serialVersionUID = 1286883321;

	/**
	 * Setter for <code>public.dto_miembros_escuela.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.cargo_id</code>.
	 */
	public void setCargoId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.cargo_id</code>.
	 */
	public Integer getCargoId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.nombre_completo</code>.
	 */
	public void setNombreCompleto(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.nombre_completo</code>.
	 */
	public String getNombreCompleto() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.nombre_grupo</code>.
	 */
	public void setNombreGrupo(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.nombre_grupo</code>.
	 */
	public String getNombreGrupo() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.etiqueta</code>.
	 */
	public void setEtiqueta(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.etiqueta</code>.
	 */
	public String getEtiqueta() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.mesa_pedagogica</code>.
	 */
	public void setMesaPedagogica(Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.mesa_pedagogica</code>.
	 */
	public Boolean getMesaPedagogica() {
		return (Boolean) getValue(5);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.telefono</code>.
	 */
	public void setTelefono(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.telefono</code>.
	 */
	public String getTelefono() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.email</code>.
	 */
	public void setEmail(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.dto_miembros_escuela.fecha_nacimiento</code>.
	 */
	public void setFechaNacimiento(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.dto_miembros_escuela.fecha_nacimiento</code>.
	 */
	public Date getFechaNacimiento() {
		return (Date) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, String, String, String, Boolean, String, String, Date> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, String, String, String, Boolean, String, String, Date> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.CARGO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.NOMBRE_COMPLETO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.NOMBRE_GRUPO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.ETIQUETA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.MESA_PEDAGOGICA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.TELEFONO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA.FECHA_NACIMIENTO;
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
	public Integer value2() {
		return getCargoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getNombreCompleto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getNombreGrupo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getEtiqueta();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
		return getMesaPedagogica();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTelefono();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getFechaNacimiento();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value2(Integer value) {
		setCargoId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value3(String value) {
		setNombreCompleto(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value4(String value) {
		setNombreGrupo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value5(String value) {
		setEtiqueta(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value6(Boolean value) {
		setMesaPedagogica(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value7(String value) {
		setTelefono(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value8(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord value9(Date value) {
		setFechaNacimiento(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoMiembrosEscuelaRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Boolean value6, String value7, String value8, Date value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DtoMiembrosEscuelaRecord
	 */
	public DtoMiembrosEscuelaRecord() {
		super(DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA);
	}

	/**
	 * Create a detached, initialised DtoMiembrosEscuelaRecord
	 */
	public DtoMiembrosEscuelaRecord(Integer id, Integer cargoId, String nombreCompleto, String nombreGrupo, String etiqueta, Boolean mesaPedagogica, String telefono, String email, Date fechaNacimiento) {
		super(DtoMiembrosEscuela.DTO_MIEMBROS_ESCUELA);

		setValue(0, id);
		setValue(1, cargoId);
		setValue(2, nombreCompleto);
		setValue(3, nombreGrupo);
		setValue(4, etiqueta);
		setValue(5, mesaPedagogica);
		setValue(6, telefono);
		setValue(7, email);
		setValue(8, fechaNacimiento);
	}
}