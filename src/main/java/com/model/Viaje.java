package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "viajes")
public class Viaje {

	
	
	public Viaje(String id_conductor, String id_camion, String id_remolque) {
		super();
		this.id_conductor = id_conductor;
		this.id_camion = id_camion;
		this.id_remolque = id_remolque;
	}
	private String id;
	private String id_conductor;
	private String id_camion;
	private String id_remolque;
	public String getId_conductor() {
		return id_conductor;
	}
	public void setId_conductor(String id_conductor) {
		this.id_conductor = id_conductor;
	}
	public String getId_camion() {
		return id_camion;
	}
	public void setId_camion(String id_camion) {
		this.id_camion = id_camion;
	}
	public String getId_remolque() {
		return id_remolque;
	}
	public void setId_remolque(String id_remolque) {
		this.id_remolque = id_remolque;
	}

	
}
