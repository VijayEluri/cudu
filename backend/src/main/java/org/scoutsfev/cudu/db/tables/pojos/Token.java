/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Token implements Serializable {

	private static final long serialVersionUID = -181757401;

	private final String    token;
	private final Timestamp creado;
	private final Long      duracionEnSegundos;
	private final String    email;

	public Token(Token value) {
		this.token = value.token;
		this.creado = value.creado;
		this.duracionEnSegundos = value.duracionEnSegundos;
		this.email = value.email;
	}

	public Token(
		String    token,
		Timestamp creado,
		Long      duracionEnSegundos,
		String    email
	) {
		this.token = token;
		this.creado = creado;
		this.duracionEnSegundos = duracionEnSegundos;
		this.email = email;
	}

	public String getToken() {
		return this.token;
	}

	public Timestamp getCreado() {
		return this.creado;
	}

	public Long getDuracionEnSegundos() {
		return this.duracionEnSegundos;
	}

	public String getEmail() {
		return this.email;
	}
}
