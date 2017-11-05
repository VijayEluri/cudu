/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.dd.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.scoutsfev.cudu.dd.tables.Ficha;


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
public class FichaRecord extends UpdatableRecordImpl<FichaRecord> implements Record6<Integer, String, String, String, Integer, Integer> {

	private static final long serialVersionUID = 1675863315;

	/**
	 * Setter for <code>public.ficha.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.ficha.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.ficha.lenguaje</code>.
	 */
	public void setLenguaje(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.ficha.lenguaje</code>.
	 */
	public String getLenguaje() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.ficha.nombre</code>.
	 */
	public void setNombre(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.ficha.nombre</code>.
	 */
	public String getNombre() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.ficha.plantilla</code>.
	 */
	public void setPlantilla(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.ficha.plantilla</code>.
	 */
	public String getPlantilla() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.ficha.tipo_entidad</code>.
	 */
	public void setTipoEntidad(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.ficha.tipo_entidad</code>.
	 */
	public Integer getTipoEntidad() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.ficha.tipo_ficha</code>.
	 */
	public void setTipoFicha(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.ficha.tipo_ficha</code>.
	 */
	public Integer getTipoFicha() {
		return (Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, Integer, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, Integer, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Ficha.FICHA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Ficha.FICHA.LENGUAJE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Ficha.FICHA.NOMBRE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Ficha.FICHA.PLANTILLA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Ficha.FICHA.TIPO_ENTIDAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Ficha.FICHA.TIPO_FICHA;
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
		return getLenguaje();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getNombre();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPlantilla();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getTipoEntidad();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getTipoFicha();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord value2(String value) {
		setLenguaje(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord value3(String value) {
		setNombre(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord value4(String value) {
		setPlantilla(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord value5(Integer value) {
		setTipoEntidad(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord value6(Integer value) {
		setTipoFicha(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FichaRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FichaRecord
	 */
	public FichaRecord() {
		super(Ficha.FICHA);
	}

	/**
	 * Create a detached, initialised FichaRecord
	 */
	public FichaRecord(Integer id, String lenguaje, String nombre, String plantilla, Integer tipoEntidad, Integer tipoFicha) {
		super(Ficha.FICHA);

		setValue(0, id);
		setValue(1, lenguaje);
		setValue(2, nombre);
		setValue(3, plantilla);
		setValue(4, tipoEntidad);
		setValue(5, tipoFicha);
	}
}