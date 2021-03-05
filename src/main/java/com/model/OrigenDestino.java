package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "origendestinos")
public class OrigenDestino {
	
	
	public OrigenDestino(String id_propietario, String direccion, String ciudad, String provincia,
			String id_coordenadas) {
		super();
		this.id_propietario = id_propietario;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.id_coordenadas = id_coordenadas;
	}
	private String id;
	private String id_propietario;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String id_coordenadas;
	public String getId_propietario() {
		return id_propietario;
	}
	public void setId_propietario(String id_propietario) {
		this.id_propietario = id_propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getId_coordenadas() {
		return id_coordenadas;
	}
	public void setId_coordenadas(String id_coordenadas) {
		this.id_coordenadas = id_coordenadas;
	}
	
	
}
