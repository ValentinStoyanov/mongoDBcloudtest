package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="conductores")
public class Conductor {


	
	public Conductor(String dni, String nombre, String apellidos, String permisos_conducir) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisos_conducir = permisos_conducir;
	}
	private String id;
	private String dni;
	private String nombre;
	private String apellidos;
	private String permisos_conducir;
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
	public String getPermisos_conducir() {
		return permisos_conducir;
	}
	public void setPermisos_conducir(String permisos_conducir) {
		this.permisos_conducir = permisos_conducir;
	}
	
	
}
