/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.pojos;


import java.io.Serializable;

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
public class Ronda implements Serializable {

	private static final long serialVersionUID = -1160382738;

	private final Short  id;
	private final String etiqueta;
	private final Object rango;

	public Ronda(Ronda value) {
		this.id = value.id;
		this.etiqueta = value.etiqueta;
		this.rango = value.rango;
	}

	public Ronda(
		Short  id,
		String etiqueta,
		Object rango
	) {
		this.id = id;
		this.etiqueta = etiqueta;
		this.rango = rango;
	}

	public Short getId() {
		return this.id;
	}

	public String getEtiqueta() {
		return this.etiqueta;
	}

	public Object getRango() {
		return this.rango;
	}
}
