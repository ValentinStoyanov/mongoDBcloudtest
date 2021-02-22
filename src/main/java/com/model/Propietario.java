package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Propietario")
public class Propietario {


	private String dni;
	private String nombreFiscal;
	private String nombreComercial;
	private String nombrePropietario;
	private String telefono;
	
	public Propietario(String dni, String nombreFiscal, String nombreComercial, String nombrePropietario,
			String telefono) {
		super();
		this.dni = dni;
		this.nombreFiscal = nombreFiscal;
		this.nombreComercial = nombreComercial;
		this.nombrePropietario = nombrePropietario;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreFiscal() {
		return nombreFiscal;
	}

	public void setNombreFiscal(String nombreFiscal) {
		this.nombreFiscal = nombreFiscal;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}