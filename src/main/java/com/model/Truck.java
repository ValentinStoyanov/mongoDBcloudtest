package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "trucks")
public class Truck {
	
	

	
	private String id;
	private String chassisnumber;
	private String registrationtag;
	private String brand;
	private String model;
	private String type;

	
	public Truck(String chassisnumber, String registrationtag, String brand, String model, String type) {
		super();
		this.chassisnumber = chassisnumber;
		this.registrationtag = registrationtag;
		this.brand = brand;
		this.model = model;
		this.type = type;
	}


	public String getChassisnumber() {
		return chassisnumber;
	}


	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}


	public String getRegistrationtag() {
		return registrationtag;
	}


	public void setRegistrationtag(String registrationtag) {
		this.registrationtag = registrationtag;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
