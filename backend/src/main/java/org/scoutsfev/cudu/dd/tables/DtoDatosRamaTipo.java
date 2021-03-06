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
import org.scoutsfev.cudu.dd.tables.records.DtoDatosRamaTipoRecord;


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
public class DtoDatosRamaTipo extends TableImpl<DtoDatosRamaTipoRecord> {

	private static final long serialVersionUID = -1731693722;

	/**
	 * The reference instance of <code>public.dto_datos_rama_tipo</code>
	 */
	public static final DtoDatosRamaTipo DTO_DATOS_RAMA_TIPO = new DtoDatosRamaTipo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DtoDatosRamaTipoRecord> getRecordType() {
		return DtoDatosRamaTipoRecord.class;
	}

	/**
	 * The column <code>public.dto_datos_rama_tipo.es_joven</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Boolean> ES_JOVEN = createField("es_joven", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.dto_datos_rama_tipo.colonia</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Long> COLONIA = createField("colonia", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_rama_tipo.manada</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Long> MANADA = createField("manada", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_rama_tipo.exploradores</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Long> EXPLORADORES = createField("exploradores", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_rama_tipo.expedicion</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Long> EXPEDICION = createField("expedicion", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_rama_tipo.ruta</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Long> RUTA = createField("ruta", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_rama_tipo.total</code>.
	 */
	public final TableField<DtoDatosRamaTipoRecord, Long> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.dto_datos_rama_tipo</code> table reference
	 */
	public DtoDatosRamaTipo() {
		this("dto_datos_rama_tipo", null);
	}

	/**
	 * Create an aliased <code>public.dto_datos_rama_tipo</code> table reference
	 */
	public DtoDatosRamaTipo(String alias) {
		this(alias, DTO_DATOS_RAMA_TIPO);
	}

	private DtoDatosRamaTipo(String alias, Table<DtoDatosRamaTipoRecord> aliased) {
		this(alias, aliased, null);
	}

	private DtoDatosRamaTipo(String alias, Table<DtoDatosRamaTipoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosRamaTipo as(String alias) {
		return new DtoDatosRamaTipo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DtoDatosRamaTipo rename(String name) {
		return new DtoDatosRamaTipo(name, null);
	}
}
