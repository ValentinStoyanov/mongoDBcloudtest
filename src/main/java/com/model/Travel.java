package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "travels")
public class Travel {


	public Travel(String iddriver, String idtruck, String idtrailer) {
		super();
		this.iddriver = iddriver;
		this.idtruck = idtruck;
		this.idtrailer = idtrailer;
	}
	
	private String id;
	private String iddriver;
	private String idtruck;
	private String idtrailer;
	
	public String getIddriver() {
		return iddriver;
	}
	public void setIddriver(String iddriver) {
		this.iddriver = iddriver;
	}
	public String getIdtruck() {
		return idtruck;
	}
	public void setIdtruck(String idtruck) {
		this.idtruck = idtruck;
	}
	public String getIdtrailer() {
		return idtrailer;
	}
	public void setIdtrailer(String idtrailer) {
		this.idtrailer = idtrailer;
	}
	
	

	
}
