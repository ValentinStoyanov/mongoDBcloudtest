package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "coordenadas")
public class Coordenada {

	
	private String id;
	private String latitud;
	private String longitud;
	private String altitud;
	private String tiempo;
	
	public Coordenada(String latitud, String longitud, String altitud, String tiempo) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.altitud = altitud;
		this.tiempo = tiempo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getAltitud() {
		return altitud;
	}

	public void setAltitud(String altitud) {
		this.altitud = altitud;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
}


