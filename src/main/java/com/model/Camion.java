package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "camiones")
public class Camion {
	
	
	private String id;
	private String numerobastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	
	public Camion(String numerobastidor, String matricula, String marca, String modelo, String tipo) {
		super();
		this.numerobastidor = numerobastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
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



	public String getNumerobastidor() {
		return numerobastidor;
	}



	public void setNumero_bastidor(String numerobastidor) {
		this.numerobastidor = numerobastidor;
	}
	

}
