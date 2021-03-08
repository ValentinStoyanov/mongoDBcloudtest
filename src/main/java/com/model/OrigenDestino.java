package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "origendestinos")
public class OrigenDestino {
	
	

	private String id;
	private String idpropietario;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String idcoordenadas;
	
	public String getIdpropietario() {
		return idpropietario;
	}
	public void setIdpropietario(String idpropietario) {
		this.idpropietario = idpropietario;
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
	public String getIdcoordenadas() {
		return idcoordenadas;
	}
	public void setIdcoordenadas(String idcoordenadas) {
		this.idcoordenadas = idcoordenadas;
	}
	
}
