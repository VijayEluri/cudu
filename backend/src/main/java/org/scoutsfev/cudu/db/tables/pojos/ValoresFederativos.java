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
public class ValoresFederativos implements Serializable {

	private static final long serialVersionUID = -525346615;

	private final Object  ambito;
	private final Integer especificidad;
	private final Long    joven;
	private final Long    kraal;
	private final Long    comite;
	private final Long    colonia;
	private final Long    manada;
	private final Long    exploradores;
	private final Long    expedicion;
	private final Long    ruta;
	private final Long    total;

	public ValoresFederativos(ValoresFederativos value) {
		this.ambito = value.ambito;
		this.especificidad = value.especificidad;
		this.joven = value.joven;
		this.kraal = value.kraal;
		this.comite = value.comite;
		this.colonia = value.colonia;
		this.manada = value.manada;
		this.exploradores = value.exploradores;
		this.expedicion = value.expedicion;
		this.ruta = value.ruta;
		this.total = value.total;
	}

	public ValoresFederativos(
		Object  ambito,
		Integer especificidad,
		Long    joven,
		Long    kraal,
		Long    comite,
		Long    colonia,
		Long    manada,
		Long    exploradores,
		Long    expedicion,
		Long    ruta,
		Long    total
	) {
		this.ambito = ambito;
		this.especificidad = especificidad;
		this.joven = joven;
		this.kraal = kraal;
		this.comite = comite;
		this.colonia = colonia;
		this.manada = manada;
		this.exploradores = exploradores;
		this.expedicion = expedicion;
		this.ruta = ruta;
		this.total = total;
	}

	public Object getAmbito() {
		return this.ambito;
	}

	public Integer getEspecificidad() {
		return this.especificidad;
	}

	public Long getJoven() {
		return this.joven;
	}

	public Long getKraal() {
		return this.kraal;
	}

	public Long getComite() {
		return this.comite;
	}

	public Long getColonia() {
		return this.colonia;
	}

	public Long getManada() {
		return this.manada;
	}

	public Long getExploradores() {
		return this.exploradores;
	}

	public Long getExpedicion() {
		return this.expedicion;
	}

	public Long getRuta() {
		return this.ruta;
	}

	public Long getTotal() {
		return this.total;
	}
}
