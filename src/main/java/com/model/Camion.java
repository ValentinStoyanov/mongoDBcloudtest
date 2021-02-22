package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Camion")
public class Camion {
	

	private String numeroBastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	
	public Camion(String numeroBastidor, String matricula, String marca, String modelo, String tipo) {
		super();
		this.numeroBastidor = numeroBastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
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
	

}
