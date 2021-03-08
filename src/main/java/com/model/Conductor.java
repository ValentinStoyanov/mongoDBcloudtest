package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="conductores")
public class Conductor {


	
	public Conductor(String dni, String nombre, String apellidos, String permisosconducir) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisosconducir = permisosconducir;
	}
	private String id;
	private String dni;
	private String nombre;
	private String apellidos;
	private String permisosconducir;
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
	public String getPermisosconducir() {
		return permisosconducir;
	}
	public void setPermisos_conducir(String permisosconducir) {
		this.permisosconducir = permisosconducir;
	}
	
	
}
