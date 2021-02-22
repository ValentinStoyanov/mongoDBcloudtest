package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Viaje")
public class Viaje {

	private String idConductor;
	private String idCamion;
	private String idRemolque;

	public Viaje(String idConductor, String idCamion, String idRemolque) {
		super();
		this.idConductor = idConductor;
		this.idCamion = idCamion;
		this.idRemolque = idRemolque;
	}

	public String getIdConductor() {
		return idConductor;
	}

	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}

	public String getIdCamion() {
		return idCamion;
	}

	public void setIdCamion(String idCamion) {
		this.idCamion = idCamion;
	}

	public String getIdRemolque() {
		return idRemolque;
	}

	public void setIdRemolque(String idRemolque) {
		this.idRemolque = idRemolque;
	}
}
