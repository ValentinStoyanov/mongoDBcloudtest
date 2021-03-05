package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cargas")
public class Carga {

	
	public Carga(String codigo, String tipo, String peso, String id_origen, String id_destino) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.peso = peso;
		this.id_origen = id_origen;
		this.id_destino = id_destino;
	}
	private String id;
	private String codigo;
	private String tipo;
	private String peso;
	private String id_origen;
	private String id_destino;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
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
	public String getId_origen() {
		return id_origen;
	}
	public void setId_origen(String id_origen) {
		this.id_origen = id_origen;
	}
	public String getId_destino() {
		return id_destino;
	}
	public void setId_destino(String id_destino) {
		this.id_destino = id_destino;
	}
	
	
	
}
