/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.dd.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.scoutsfev.cudu.dd.Public;
import org.scoutsfev.cudu.dd.tables.records.DtoDatosPeriodoTipoRecord;


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
public class DtoDatosPeriodoTipo extends TableImpl<DtoDatosPeriodoTipoRecord> {

	private static final long serialVersionUID = -90345710;

	/**
	 * The reference instance of <code>public.dto_datos_periodo_tipo</code>
	 */
	public static final DtoDatosPeriodoTipo DTO_DATOS_PERIODO_TIPO = new DtoDatosPeriodoTipo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DtoDatosPeriodoTipoRecord> getRecordType() {
		return DtoDatosPeriodoTipoRecord.class;
	}

	/**
	 * The column <code>public.dto_datos_periodo_tipo.periodo</code>.
	 */
	public final TableField<DtoDatosPeriodoTipoRecord, Integer> PERIODO = createField("periodo", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.dto_datos_periodo_tipo.jovenes</code>.
	 */
	public final TableField<DtoDatosPeriodoTipoRecord, Long> JOVENES = createField("jovenes", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_periodo_tipo.voluntarios</code>.
	 */
	public final TableField<DtoDatosPeriodoTipoRecord, Long> VOLUNTARIOS = createField("voluntarios", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_periodo_tipo.total</code>.
	 */
	public final TableField<DtoDatosPeriodoTipoRecord, Long> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.dto_datos_periodo_tipo</code> table reference
	 */
	public DtoDatosPeriodoTipo() {
		this("dto_datos_periodo_tipo", null);
	}

	/**
	 * Create an aliased <code>public.dto_datos_periodo_tipo</code> table reference
	 */
	public DtoDatosPeriodoTipo(String alias) {
		this(alias, DTO_DATOS_PERIODO_TIPO);
	}

	private DtoDatosPeriodoTipo(String alias, Table<DtoDatosPeriodoTipoRecord> aliased) {
		this(alias, aliased, null);
	}

	private DtoDatosPeriodoTipo(String alias, Table<DtoDatosPeriodoTipoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosPeriodoTipo as(String alias) {
		return new DtoDatosPeriodoTipo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DtoDatosPeriodoTipo rename(String name) {
		return new DtoDatosPeriodoTipo(name, null);
	}
}