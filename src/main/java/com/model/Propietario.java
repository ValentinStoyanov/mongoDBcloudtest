package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "propietarios")
public class Propietario {


	public Propietario(String dni, String nombrefiscal, String nombrecomercial, String nombrepropietario,
			String telefono) {
		super();
		this.dni = dni;
		this.nombrefiscal = nombrefiscal;
		this.nombrecomercial = nombrecomercial;
		this.nombrepropietario = nombrepropietario;
		this.telefono = telefono;
	}
	private String id;
	private String dni;
	private String nombrefiscal;
	private String nombrecomercial;
	private String nombrepropietario;
	private String telefono;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombrefiscal() {
		return nombrefiscal;
	}
	public void setNombrefiscal(String nombrefiscal) {
		this.nombrefiscal = nombrefiscal;
	}
	public String getNombrecomercial() {
		return nombrecomercial;
	}
	public void setNombrecomercial(String nombrecomercial) {
		this.nombrecomercial = nombrecomercial;
	}
	public String getNombrepropietario() {
		return nombrepropietario;
	}
	public void setNombrepropietario(String nombrepropietario) {
		this.nombrepropietario = nombrepropietario;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
