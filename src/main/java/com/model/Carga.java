package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cargas")
public class Carga {

	

	public Carga(int codigo, String tipo, String peso, String idorigen, String iddestino) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.peso = peso;
		this.idorigen = idorigen;
		this.iddestino = iddestino;
	}
	private String id;
	private int codigo;
	private String tipo;
	private String peso;
	private String idorigen;
	private String iddestino;
	

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(String idorigen) {
		this.idorigen = idorigen;
	}
	public String getIddestino() {
		return iddestino;
	}
	public void setIddestino(String iddestino) {
		this.iddestino = iddestino;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
