/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record2;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.scoutsfev.cudu.db.tables.LiquidacionAsociado;


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
public class LiquidacionAsociadoRecord extends UpdatableRecordImpl<LiquidacionAsociadoRecord> implements Record12<Integer, Integer, String, String, String, Timestamp, Timestamp, Boolean, Boolean, Boolean, Boolean, Boolean> {

	private static final long serialVersionUID = 1891788908;

	/**
	 * Setter for <code>public.liquidacion_asociado.liquidacion_id</code>.
	 */
	public void setLiquidacionId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.liquidacion_id</code>.
	 */
	public Integer getLiquidacionId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.asociado_id</code>.
	 */
	public void setAsociadoId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.asociado_id</code>.
	 */
	public Integer getAsociadoId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.tipo</code>.
	 */
	public void setTipo(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.tipo</code>.
	 */
	public String getTipo() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.nombre</code>.
	 */
	public void setNombre(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.nombre</code>.
	 */
	public String getNombre() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.apellidos</code>.
	 */
	public void setApellidos(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.apellidos</code>.
	 */
	public String getApellidos() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.fecha_alta</code>.
	 */
	public void setFechaAlta(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.fecha_alta</code>.
	 */
	public Timestamp getFechaAlta() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.fecha_actualizacion</code>.
	 */
	public void setFechaActualizacion(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.fecha_actualizacion</code>.
	 */
	public Timestamp getFechaActualizacion() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.rama_colonia</code>.
	 */
	public void setRamaColonia(Boolean value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.rama_colonia</code>.
	 */
	public Boolean getRamaColonia() {
		return (Boolean) getValue(7);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.rama_manada</code>.
	 */
	public void setRamaManada(Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.rama_manada</code>.
	 */
	public Boolean getRamaManada() {
		return (Boolean) getValue(8);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.rama_exploradores</code>.
	 */
	public void setRamaExploradores(Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.rama_exploradores</code>.
	 */
	public Boolean getRamaExploradores() {
		return (Boolean) getValue(9);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.rama_expedicion</code>.
	 */
	public void setRamaExpedicion(Boolean value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.rama_expedicion</code>.
	 */
	public Boolean getRamaExpedicion() {
		return (Boolean) getValue(10);
	}

	/**
	 * Setter for <code>public.liquidacion_asociado.rama_ruta</code>.
	 */
	public void setRamaRuta(Boolean value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.liquidacion_asociado.rama_ruta</code>.
	 */
	public Boolean getRamaRuta() {
		return (Boolean) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, Integer, String, String, String, Timestamp, Timestamp, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, Integer, String, String, String, Timestamp, Timestamp, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.LIQUIDACION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.ASOCIADO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.TIPO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.NOMBRE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.APELLIDOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.FECHA_ALTA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.FECHA_ACTUALIZACION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field8() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.RAMA_COLONIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field9() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.RAMA_MANADA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field10() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.RAMA_EXPLORADORES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field11() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.RAMA_EXPEDICION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field12() {
		return LiquidacionAsociado.LIQUIDACION_ASOCIADO.RAMA_RUTA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getLiquidacionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAsociadoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTipo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getNombre();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getApellidos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getFechaAlta();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getFechaActualizacion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value8() {
		return getRamaColonia();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value9() {
		return getRamaManada();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value10() {
		return getRamaExploradores();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value11() {
		return getRamaExpedicion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value12() {
		return getRamaRuta();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value1(Integer value) {
		setLiquidacionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value2(Integer value) {
		setAsociadoId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value3(String value) {
		setTipo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value4(String value) {
		setNombre(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value5(String value) {
		setApellidos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value6(Timestamp value) {
		setFechaAlta(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value7(Timestamp value) {
		setFechaActualizacion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value8(Boolean value) {
		setRamaColonia(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value9(Boolean value) {
		setRamaManada(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value10(Boolean value) {
		setRamaExploradores(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value11(Boolean value) {
		setRamaExpedicion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord value12(Boolean value) {
		setRamaRuta(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionAsociadoRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12) {
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
	 * Create a detached LiquidacionAsociadoRecord
	 */
	public LiquidacionAsociadoRecord() {
		super(LiquidacionAsociado.LIQUIDACION_ASOCIADO);
	}

	/**
	 * Create a detached, initialised LiquidacionAsociadoRecord
	 */
	public LiquidacionAsociadoRecord(Integer liquidacionId, Integer asociadoId, String tipo, String nombre, String apellidos, Timestamp fechaAlta, Timestamp fechaActualizacion, Boolean ramaColonia, Boolean ramaManada, Boolean ramaExploradores, Boolean ramaExpedicion, Boolean ramaRuta) {
		super(LiquidacionAsociado.LIQUIDACION_ASOCIADO);

		setValue(0, liquidacionId);
		setValue(1, asociadoId);
		setValue(2, tipo);
		setValue(3, nombre);
		setValue(4, apellidos);
		setValue(5, fechaAlta);
		setValue(6, fechaActualizacion);
		setValue(7, ramaColonia);
		setValue(8, ramaManada);
		setValue(9, ramaExploradores);
		setValue(10, ramaExpedicion);
		setValue(11, ramaRuta);
	}
}
