package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "viajes")
public class Viaje {


	private String id;
	private String idconductor;
	private String idcamion;
	private String idremolque;
	

	
	public Viaje(String idconductor, String idcamion, String idremolque) {
		super();
		this.idconductor = idconductor;
		this.idcamion = idcamion;
		this.idremolque = idremolque;
	}
	
	public Viaje() {
		
	}
	
	
	public String getIdconductor() {
		return idconductor;
	}
	public void setIdconductor(String idconductor) {
		this.idconductor = idconductor;
	}
	public String getIdcamion() {
		return idcamion;
	}
	public void setIdcamion(String idcamion) {
		this.idcamion = idcamion;
	}
	public String getIdremolque() {
		return idremolque;
	}
	public void setIdremolque(String idremolque) {
		this.idremolque = idremolque;
	}

	

	
}
