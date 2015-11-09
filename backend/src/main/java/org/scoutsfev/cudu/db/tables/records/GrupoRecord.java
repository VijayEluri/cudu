/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.scoutsfev.cudu.db.tables.Grupo;


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
public class GrupoRecord extends UpdatableRecordImpl<GrupoRecord> implements Record12<String, String, Integer, String, Date, String, String, String, String, String, Integer, String> {

	private static final long serialVersionUID = 1711105387;

	/**
	 * Setter for <code>public.grupo.id</code>.
	 */
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.grupo.id</code>.
	 */
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.grupo.nombre</code>.
	 */
	public void setNombre(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.grupo.nombre</code>.
	 */
	public String getNombre() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.grupo.codigo_postal</code>.
	 */
	public void setCodigoPostal(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.grupo.codigo_postal</code>.
	 */
	public Integer getCodigoPostal() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.grupo.municipio</code>.
	 */
	public void setMunicipio(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.grupo.municipio</code>.
	 */
	public String getMunicipio() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.grupo.aniversario</code>.
	 */
	public void setAniversario(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.grupo.aniversario</code>.
	 */
	public Date getAniversario() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>public.grupo.telefono1</code>.
	 */
	public void setTelefono1(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.grupo.telefono1</code>.
	 */
	public String getTelefono1() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>public.grupo.telefono2</code>.
	 */
	public void setTelefono2(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.grupo.telefono2</code>.
	 */
	public String getTelefono2() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.grupo.email</code>.
	 */
	public void setEmail(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.grupo.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.grupo.web</code>.
	 */
	public void setWeb(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.grupo.web</code>.
	 */
	public String getWeb() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>public.grupo.entidad_patrocinadora</code>.
	 */
	public void setEntidadPatrocinadora(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.grupo.entidad_patrocinadora</code>.
	 */
	public String getEntidadPatrocinadora() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>public.grupo.asociacion</code>.
	 */
	public void setAsociacion(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.grupo.asociacion</code>.
	 */
	public Integer getAsociacion() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>public.grupo.direccion</code>.
	 */
	public void setDireccion(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.grupo.direccion</code>.
	 */
	public String getDireccion() {
		return (String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, Integer, String, Date, String, String, String, String, String, Integer, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, Integer, String, Date, String, String, String, String, String, Integer, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Grupo.GRUPO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Grupo.GRUPO.NOMBRE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Grupo.GRUPO.CODIGO_POSTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Grupo.GRUPO.MUNICIPIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return Grupo.GRUPO.ANIVERSARIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Grupo.GRUPO.TELEFONO1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Grupo.GRUPO.TELEFONO2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Grupo.GRUPO.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Grupo.GRUPO.WEB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return Grupo.GRUPO.ENTIDAD_PATROCINADORA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return Grupo.GRUPO.ASOCIACION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return Grupo.GRUPO.DIRECCION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getNombre();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCodigoPostal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getMunicipio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getAniversario();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getTelefono1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTelefono2();
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
	public String value9() {
		return getWeb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getEntidadPatrocinadora();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getAsociacion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getDireccion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value2(String value) {
		setNombre(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value3(Integer value) {
		setCodigoPostal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value4(String value) {
		setMunicipio(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value5(Date value) {
		setAniversario(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value6(String value) {
		setTelefono1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value7(String value) {
		setTelefono2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value8(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value9(String value) {
		setWeb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value10(String value) {
		setEntidadPatrocinadora(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value11(Integer value) {
		setAsociacion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord value12(String value) {
		setDireccion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GrupoRecord values(String value1, String value2, Integer value3, String value4, Date value5, String value6, String value7, String value8, String value9, String value10, Integer value11, String value12) {
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
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GrupoRecord
	 */
	public GrupoRecord() {
		super(Grupo.GRUPO);
	}

	/**
	 * Create a detached, initialised GrupoRecord
	 */
	public GrupoRecord(String id, String nombre, Integer codigoPostal, String municipio, Date aniversario, String telefono1, String telefono2, String email, String web, String entidadPatrocinadora, Integer asociacion, String direccion) {
		super(Grupo.GRUPO);

		setValue(0, id);
		setValue(1, nombre);
		setValue(2, codigoPostal);
		setValue(3, municipio);
		setValue(4, aniversario);
		setValue(5, telefono1);
		setValue(6, telefono2);
		setValue(7, email);
		setValue(8, web);
		setValue(9, entidadPatrocinadora);
		setValue(10, asociacion);
		setValue(11, direccion);
	}
}