/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.scoutsfev.cudu.db.tables.ValoresPorAsociacion;


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
public class ValoresPorAsociacionRecord extends TableRecordImpl<ValoresPorAsociacionRecord> implements Record12<String, Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Integer> {

	private static final long serialVersionUID = 243370224;

	/**
	 * Setter for <code>public.valores_por_asociacion.ambito</code>.
	 */
	public void setAmbito(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.ambito</code>.
	 */
	public String getAmbito() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.especificidad</code>.
	 */
	public void setEspecificidad(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.especificidad</code>.
	 */
	public Integer getEspecificidad() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.joven</code>.
	 */
	public void setJoven(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.joven</code>.
	 */
	public Long getJoven() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.kraal</code>.
	 */
	public void setKraal(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.kraal</code>.
	 */
	public Long getKraal() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.comite</code>.
	 */
	public void setComite(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.comite</code>.
	 */
	public Long getComite() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.colonia</code>.
	 */
	public void setColonia(Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.colonia</code>.
	 */
	public Long getColonia() {
		return (Long) getValue(5);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.manada</code>.
	 */
	public void setManada(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.manada</code>.
	 */
	public Long getManada() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.exploradores</code>.
	 */
	public void setExploradores(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.exploradores</code>.
	 */
	public Long getExploradores() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.expedicion</code>.
	 */
	public void setExpedicion(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.expedicion</code>.
	 */
	public Long getExpedicion() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.ruta</code>.
	 */
	public void setRuta(Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.ruta</code>.
	 */
	public Long getRuta() {
		return (Long) getValue(9);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.total</code>.
	 */
	public void setTotal(Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.total</code>.
	 */
	public Long getTotal() {
		return (Long) getValue(10);
	}

	/**
	 * Setter for <code>public.valores_por_asociacion.asociacionid</code>.
	 */
	public void setAsociacionid(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.valores_por_asociacion.asociacionid</code>.
	 */
	public Integer getAsociacionid() {
		return (Integer) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Integer> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Integer> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.AMBITO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.ESPECIFICIDAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.JOVEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.KRAAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.COMITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field6() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.COLONIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.MANADA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.EXPLORADORES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field9() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.EXPEDICION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field10() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.RUTA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field11() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return ValoresPorAsociacion.VALORES_POR_ASOCIACION.ASOCIACIONID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getAmbito();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getEspecificidad();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getJoven();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getKraal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getComite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value6() {
		return getColonia();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value7() {
		return getManada();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getExploradores();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value9() {
		return getExpedicion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value10() {
		return getRuta();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value11() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getAsociacionid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value1(String value) {
		setAmbito(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value2(Integer value) {
		setEspecificidad(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value3(Long value) {
		setJoven(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value4(Long value) {
		setKraal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value5(Long value) {
		setComite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value6(Long value) {
		setColonia(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value7(Long value) {
		setManada(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value8(Long value) {
		setExploradores(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value9(Long value) {
		setExpedicion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value10(Long value) {
		setRuta(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value11(Long value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord value12(Integer value) {
		setAsociacionid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorAsociacionRecord values(String value1, Integer value2, Long value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11, Integer value12) {
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
	 * Create a detached ValoresPorAsociacionRecord
	 */
	public ValoresPorAsociacionRecord() {
		super(ValoresPorAsociacion.VALORES_POR_ASOCIACION);
	}

	/**
	 * Create a detached, initialised ValoresPorAsociacionRecord
	 */
	public ValoresPorAsociacionRecord(String ambito, Integer especificidad, Long joven, Long kraal, Long comite, Long colonia, Long manada, Long exploradores, Long expedicion, Long ruta, Long total, Integer asociacionid) {
		super(ValoresPorAsociacion.VALORES_POR_ASOCIACION);

		setValue(0, ambito);
		setValue(1, especificidad);
		setValue(2, joven);
		setValue(3, kraal);
		setValue(4, comite);
		setValue(5, colonia);
		setValue(6, manada);
		setValue(7, exploradores);
		setValue(8, expedicion);
		setValue(9, ruta);
		setValue(10, total);
		setValue(11, asociacionid);
	}
}
