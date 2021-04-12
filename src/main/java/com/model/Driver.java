package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="drivers")
public class Driver {


	public Driver(String dni, String name, String surname, String driverlicense) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.driverlicense = driverlicense;
	}
	private String id;
	private String dni;
	private String name;
	private String surname;
	private String driverlicense;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDriverlicense() {
		return driverlicense;
	}
	public void setDriverlicense(String driverlicense) {
		this.driverlicense = driverlicense;
	}
	
	
}
