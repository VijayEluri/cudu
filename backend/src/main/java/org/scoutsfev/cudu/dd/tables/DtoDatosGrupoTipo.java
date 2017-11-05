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
import org.scoutsfev.cudu.dd.tables.records.DtoDatosGrupoTipoRecord;


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
public class DtoDatosGrupoTipo extends TableImpl<DtoDatosGrupoTipoRecord> {

	private static final long serialVersionUID = 254049424;

	/**
	 * The reference instance of <code>public.dto_datos_grupo_tipo</code>
	 */
	public static final DtoDatosGrupoTipo DTO_DATOS_GRUPO_TIPO = new DtoDatosGrupoTipo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DtoDatosGrupoTipoRecord> getRecordType() {
		return DtoDatosGrupoTipoRecord.class;
	}

	/**
	 * The column <code>public.dto_datos_grupo_tipo.grupo_id</code>.
	 */
	public final TableField<DtoDatosGrupoTipoRecord, String> GRUPO_ID = createField("grupo_id", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>public.dto_datos_grupo_tipo.joven</code>.
	 */
	public final TableField<DtoDatosGrupoTipoRecord, Long> JOVEN = createField("joven", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_grupo_tipo.kraal</code>.
	 */
	public final TableField<DtoDatosGrupoTipoRecord, Long> KRAAL = createField("kraal", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.dto_datos_grupo_tipo.comite</code>.
	 */
	public final TableField<DtoDatosGrupoTipoRecord, Long> COMITE = createField("comite", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.dto_datos_grupo_tipo</code> table reference
	 */
	public DtoDatosGrupoTipo() {
		this("dto_datos_grupo_tipo", null);
	}

	/**
	 * Create an aliased <code>public.dto_datos_grupo_tipo</code> table reference
	 */
	public DtoDatosGrupoTipo(String alias) {
		this(alias, DTO_DATOS_GRUPO_TIPO);
	}

	private DtoDatosGrupoTipo(String alias, Table<DtoDatosGrupoTipoRecord> aliased) {
		this(alias, aliased, null);
	}

	private DtoDatosGrupoTipo(String alias, Table<DtoDatosGrupoTipoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosGrupoTipo as(String alias) {
		return new DtoDatosGrupoTipo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DtoDatosGrupoTipo rename(String name) {
		return new DtoDatosGrupoTipo(name, null);
	}
}