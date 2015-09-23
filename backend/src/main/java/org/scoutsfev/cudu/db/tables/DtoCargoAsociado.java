/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.scoutsfev.cudu.db.Public;
import org.scoutsfev.cudu.db.tables.records.DtoCargoAsociadoRecord;


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
public class DtoCargoAsociado extends TableImpl<DtoCargoAsociadoRecord> {

	private static final long serialVersionUID = 2043320317;

	/**
	 * The reference instance of <code>public.dto_cargo_asociado</code>
	 */
	public static final DtoCargoAsociado DTO_CARGO_ASOCIADO = new DtoCargoAsociado();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DtoCargoAsociadoRecord> getRecordType() {
		return DtoCargoAsociadoRecord.class;
	}

	/**
	 * The column <code>public.dto_cargo_asociado.asociado_id</code>.
	 */
	public final TableField<DtoCargoAsociadoRecord, Integer> ASOCIADO_ID = createField("asociado_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.dto_cargo_asociado.id</code>.
	 */
	public final TableField<DtoCargoAsociadoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.dto_cargo_asociado.etiqueta</code>.
	 */
	public final TableField<DtoCargoAsociadoRecord, String> ETIQUETA = createField("etiqueta", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>public.dto_cargo_asociado.ambito</code>.
	 */
	public final TableField<DtoCargoAsociadoRecord, String> AMBITO = createField("ambito", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>public.dto_cargo_asociado.unico</code>.
	 */
	public final TableField<DtoCargoAsociadoRecord, Boolean> UNICO = createField("unico", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.dto_cargo_asociado.puntos</code>.
	 */
	public final TableField<DtoCargoAsociadoRecord, Integer> PUNTOS = createField("puntos", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.dto_cargo_asociado</code> table reference
	 */
	public DtoCargoAsociado() {
		this("dto_cargo_asociado", null);
	}

	/**
	 * Create an aliased <code>public.dto_cargo_asociado</code> table reference
	 */
	public DtoCargoAsociado(String alias) {
		this(alias, DTO_CARGO_ASOCIADO);
	}

	private DtoCargoAsociado(String alias, Table<DtoCargoAsociadoRecord> aliased) {
		this(alias, aliased, null);
	}

	private DtoCargoAsociado(String alias, Table<DtoCargoAsociadoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoCargoAsociado as(String alias) {
		return new DtoCargoAsociado(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DtoCargoAsociado rename(String name) {
		return new DtoCargoAsociado(name, null);
	}
}
