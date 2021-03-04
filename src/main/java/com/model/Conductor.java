package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Conductor")
public class Conductor {


	
	private String id;
	private String dni;
	private String nombre;
	private String apellidos;
	private String permisosConducir;
	
	public Conductor(String dni, String nombre, String apellidos, String permisosConducir) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisosConducir = permisosConducir;
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
		return permisosConducir;
	}

	public void setPermisoConducir(String permisoConducir) {
		this.permisosConducir = permisoConducir;
	}
}
