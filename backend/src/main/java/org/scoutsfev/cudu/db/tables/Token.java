/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.scoutsfev.cudu.db.Keys;
import org.scoutsfev.cudu.db.Public;
import org.scoutsfev.cudu.db.tables.records.TokenRecord;


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
public class Token extends TableImpl<TokenRecord> {

	private static final long serialVersionUID = 17453905;

	/**
	 * The reference instance of <code>public.token</code>
	 */
	public static final Token TOKEN = new Token();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TokenRecord> getRecordType() {
		return TokenRecord.class;
	}

	/**
	 * The column <code>public.token.token</code>.
	 */
	public final TableField<TokenRecord, String> TOKEN_ = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(26).nullable(false), this, "");

	/**
	 * The column <code>public.token.creado</code>.
	 */
	public final TableField<TokenRecord, Timestamp> CREADO = createField("creado", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.token.duracion_en_segundos</code>.
	 */
	public final TableField<TokenRecord, Long> DURACION_EN_SEGUNDOS = createField("duracion_en_segundos", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.token.email</code>.
	 */
	public final TableField<TokenRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * Create a <code>public.token</code> table reference
	 */
	public Token() {
		this("token", null);
	}

	/**
	 * Create an aliased <code>public.token</code> table reference
	 */
	public Token(String alias) {
		this(alias, TOKEN);
	}

	private Token(String alias, Table<TokenRecord> aliased) {
		this(alias, aliased, null);
	}

	private Token(String alias, Table<TokenRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TokenRecord> getPrimaryKey() {
		return Keys.TOKEN_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TokenRecord>> getKeys() {
		return Arrays.<UniqueKey<TokenRecord>>asList(Keys.TOKEN_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Token as(String alias) {
		return new Token(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Token rename(String name) {
		return new Token(name, null);
	}
}
