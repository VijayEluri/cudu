/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.scoutsfev.cudu.db.tables.ValoresPorLiquidacion;


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
public class ValoresPorLiquidacionRecord extends TableRecordImpl<ValoresPorLiquidacionRecord> implements Record12<String, Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Integer> {

	private static final long serialVersionUID = 431926940;

	/**
	 * Setter for <code>public.valores_por_liquidacion.ambito</code>.
	 */
	public void setAmbito(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.ambito</code>.
	 */
	public String getAmbito() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.especificidad</code>.
	 */
	public void setEspecificidad(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.especificidad</code>.
	 */
	public Integer getEspecificidad() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.joven</code>.
	 */
	public void setJoven(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.joven</code>.
	 */
	public Long getJoven() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.kraal</code>.
	 */
	public void setKraal(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.kraal</code>.
	 */
	public Long getKraal() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.comite</code>.
	 */
	public void setComite(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.comite</code>.
	 */
	public Long getComite() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.colonia</code>.
	 */
	public void setColonia(Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.colonia</code>.
	 */
	public Long getColonia() {
		return (Long) getValue(5);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.manada</code>.
	 */
	public void setManada(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.manada</code>.
	 */
	public Long getManada() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.exploradores</code>.
	 */
	public void setExploradores(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.exploradores</code>.
	 */
	public Long getExploradores() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.expedicion</code>.
	 */
	public void setExpedicion(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.expedicion</code>.
	 */
	public Long getExpedicion() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.ruta</code>.
	 */
	public void setRuta(Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.ruta</code>.
	 */
	public Long getRuta() {
		return (Long) getValue(9);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.total</code>.
	 */
	public void setTotal(Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.total</code>.
	 */
	public Long getTotal() {
		return (Long) getValue(10);
	}

	/**
	 * Setter for <code>public.valores_por_liquidacion.liquidacion_id</code>.
	 */
	public void setLiquidacionId(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.valores_por_liquidacion.liquidacion_id</code>.
	 */
	public Integer getLiquidacionId() {
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
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.AMBITO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.ESPECIFICIDAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.JOVEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.KRAAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.COMITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field6() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.COLONIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.MANADA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.EXPLORADORES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field9() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.EXPEDICION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field10() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.RUTA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field11() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return ValoresPorLiquidacion.VALORES_POR_LIQUIDACION.LIQUIDACION_ID;
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
		return getLiquidacionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value1(String value) {
		setAmbito(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value2(Integer value) {
		setEspecificidad(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value3(Long value) {
		setJoven(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value4(Long value) {
		setKraal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value5(Long value) {
		setComite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value6(Long value) {
		setColonia(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value7(Long value) {
		setManada(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value8(Long value) {
		setExploradores(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value9(Long value) {
		setExpedicion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value10(Long value) {
		setRuta(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value11(Long value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord value12(Integer value) {
		setLiquidacionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ValoresPorLiquidacionRecord values(String value1, Integer value2, Long value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11, Integer value12) {
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
	 * Create a detached ValoresPorLiquidacionRecord
	 */
	public ValoresPorLiquidacionRecord() {
		super(ValoresPorLiquidacion.VALORES_POR_LIQUIDACION);
	}

	/**
	 * Create a detached, initialised ValoresPorLiquidacionRecord
	 */
	public ValoresPorLiquidacionRecord(String ambito, Integer especificidad, Long joven, Long kraal, Long comite, Long colonia, Long manada, Long exploradores, Long expedicion, Long ruta, Long total, Integer liquidacionId) {
		super(ValoresPorLiquidacion.VALORES_POR_LIQUIDACION);

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
		setValue(11, liquidacionId);
	}
}
