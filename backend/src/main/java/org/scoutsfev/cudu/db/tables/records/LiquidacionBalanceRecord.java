/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.scoutsfev.cudu.db.tables.LiquidacionBalance;


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
public class LiquidacionBalanceRecord extends TableRecordImpl<LiquidacionBalanceRecord> implements Record12<String, Short, Integer, Long, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Boolean> {

	private static final long serialVersionUID = 93037220;

	/**
	 * Setter for <code>public.liquidacion_balance.grupo_id</code>.
	 */
	public void setGrupoId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.grupo_id</code>.
	 */
	public String getGrupoId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.ronda_id</code>.
	 */
	public void setRondaId(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.ronda_id</code>.
	 */
	public Short getRondaId() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.liquidacion_id</code>.
	 */
	public void setLiquidacionId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.liquidacion_id</code>.
	 */
	public Integer getLiquidacionId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.activos</code>.
	 */
	public void setActivos(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.activos</code>.
	 */
	public Long getActivos() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.diferencia</code>.
	 */
	public void setDiferencia(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.diferencia</code>.
	 */
	public Long getDiferencia() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.precio_unitario</code>.
	 */
	public void setPrecioUnitario(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.precio_unitario</code>.
	 */
	public BigDecimal getPrecioUnitario() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.subtotal</code>.
	 */
	public void setSubtotal(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.subtotal</code>.
	 */
	public BigDecimal getSubtotal() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.ajuste_manual</code>.
	 */
	public void setAjusteManual(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.ajuste_manual</code>.
	 */
	public BigDecimal getAjusteManual() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.pagado</code>.
	 */
	public void setPagado(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.pagado</code>.
	 */
	public BigDecimal getPagado() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.balance</code>.
	 */
	public void setBalance(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.balance</code>.
	 */
	public BigDecimal getBalance() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.creado_en</code>.
	 */
	public void setCreadoEn(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.creado_en</code>.
	 */
	public Timestamp getCreadoEn() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>public.liquidacion_balance.borrador</code>.
	 */
	public void setBorrador(Boolean value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.liquidacion_balance.borrador</code>.
	 */
	public Boolean getBorrador() {
		return (Boolean) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, Short, Integer, Long, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Boolean> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, Short, Integer, Long, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Boolean> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.GRUPO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.RONDA_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.LIQUIDACION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.ACTIVOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.DIFERENCIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.PRECIO_UNITARIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.SUBTOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.AJUSTE_MANUAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.PAGADO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.BALANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.CREADO_EN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field12() {
		return LiquidacionBalance.LIQUIDACION_BALANCE.BORRADOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getGrupoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getRondaId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getLiquidacionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getActivos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getDiferencia();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getPrecioUnitario();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getSubtotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getAjusteManual();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getPagado();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getBalance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getCreadoEn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value12() {
		return getBorrador();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value1(String value) {
		setGrupoId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value2(Short value) {
		setRondaId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value3(Integer value) {
		setLiquidacionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value4(Long value) {
		setActivos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value5(Long value) {
		setDiferencia(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value6(BigDecimal value) {
		setPrecioUnitario(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value7(BigDecimal value) {
		setSubtotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value8(BigDecimal value) {
		setAjusteManual(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value9(BigDecimal value) {
		setPagado(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value10(BigDecimal value) {
		setBalance(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value11(Timestamp value) {
		setCreadoEn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord value12(Boolean value) {
		setBorrador(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceRecord values(String value1, Short value2, Integer value3, Long value4, Long value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, Timestamp value11, Boolean value12) {
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
	 * Create a detached LiquidacionBalanceRecord
	 */
	public LiquidacionBalanceRecord() {
		super(LiquidacionBalance.LIQUIDACION_BALANCE);
	}

	/**
	 * Create a detached, initialised LiquidacionBalanceRecord
	 */
	public LiquidacionBalanceRecord(String grupoId, Short rondaId, Integer liquidacionId, Long activos, Long diferencia, BigDecimal precioUnitario, BigDecimal subtotal, BigDecimal ajusteManual, BigDecimal pagado, BigDecimal balance, Timestamp creadoEn, Boolean borrador) {
		super(LiquidacionBalance.LIQUIDACION_BALANCE);

		setValue(0, grupoId);
		setValue(1, rondaId);
		setValue(2, liquidacionId);
		setValue(3, activos);
		setValue(4, diferencia);
		setValue(5, precioUnitario);
		setValue(6, subtotal);
		setValue(7, ajusteManual);
		setValue(8, pagado);
		setValue(9, balance);
		setValue(10, creadoEn);
		setValue(11, borrador);
	}
}
