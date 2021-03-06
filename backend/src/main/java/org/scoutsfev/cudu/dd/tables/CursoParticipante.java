/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.dd.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.scoutsfev.cudu.dd.Keys;
import org.scoutsfev.cudu.dd.Public;
import org.scoutsfev.cudu.dd.tables.records.CursoParticipanteRecord;


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
public class CursoParticipante extends TableImpl<CursoParticipanteRecord> {

	private static final long serialVersionUID = -1297825913;

	/**
	 * The reference instance of <code>public.curso_participante</code>
	 */
	public static final CursoParticipante CURSO_PARTICIPANTE = new CursoParticipante();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CursoParticipanteRecord> getRecordType() {
		return CursoParticipanteRecord.class;
	}

	/**
	 * The column <code>public.curso_participante.curso_id</code>.
	 */
	public final TableField<CursoParticipanteRecord, Integer> CURSO_ID = createField("curso_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.curso_participante.asociado_id</code>.
	 */
	public final TableField<CursoParticipanteRecord, Integer> ASOCIADO_ID = createField("asociado_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.curso_participante.secuencia_inscripcion</code>.
	 */
	public final TableField<CursoParticipanteRecord, Integer> SECUENCIA_INSCRIPCION = createField("secuencia_inscripcion", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.curso_participante.fecha_inscripcion</code>.
	 */
	public final TableField<CursoParticipanteRecord, Timestamp> FECHA_INSCRIPCION = createField("fecha_inscripcion", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.curso_participante</code> table reference
	 */
	public CursoParticipante() {
		this("curso_participante", null);
	}

	/**
	 * Create an aliased <code>public.curso_participante</code> table reference
	 */
	public CursoParticipante(String alias) {
		this(alias, CURSO_PARTICIPANTE);
	}

	private CursoParticipante(String alias, Table<CursoParticipanteRecord> aliased) {
		this(alias, aliased, null);
	}

	private CursoParticipante(String alias, Table<CursoParticipanteRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CursoParticipanteRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CURSO_PARTICIPANTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CursoParticipanteRecord> getPrimaryKey() {
		return Keys.PK_CURSO_PARTICIPANTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CursoParticipanteRecord>> getKeys() {
		return Arrays.<UniqueKey<CursoParticipanteRecord>>asList(Keys.PK_CURSO_PARTICIPANTE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CursoParticipanteRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CursoParticipanteRecord, ?>>asList(Keys.CURSO_PARTICIPANTE__FK_CURSO_PARTICIPANTE_CURSO, Keys.CURSO_PARTICIPANTE__FK_CURSO_PARTICIPANTE_PARTICIPANTE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CursoParticipante as(String alias) {
		return new CursoParticipante(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CursoParticipante rename(String name) {
		return new CursoParticipante(name, null);
	}
}
