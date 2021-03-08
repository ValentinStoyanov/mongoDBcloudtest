package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "remolques")
public class Remolque {
	
	
	public Remolque(String numerobastidor, String matricula, String marca, String modelo, String tipo,
			String idcarga) {
		super();
		this.numerobastidor = numerobastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.idcarga = idcarga;
	}
	private String id;
	private String numerobastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	private String idcarga;
	public String getNumerobastidor() {
		return numerobastidor;
	}
	public void setNumerobastidor(String numero_bastidor) {
		this.numerobastidor = numero_bastidor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIdcarga() {
		return idcarga;
	}
	public void setIdcarga(String idcarga) {
		this.idcarga = idcarga;
	}
	
	
}
