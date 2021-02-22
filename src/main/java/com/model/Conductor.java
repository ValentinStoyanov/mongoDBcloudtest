package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Conductor")
public class Conductor {


	private String dni;
	private String nombre;
	private String apellidos;
	private String permisoConducir;
	
	public Conductor(String dni, String nombre, String apellidos, String permisoConducir) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisoConducir = permisoConducir;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPermisoConducir() {
		return permisoConducir;
	}

	public void setPermisoConducir(String permisoConducir) {
		this.permisoConducir = permisoConducir;
	}
}
