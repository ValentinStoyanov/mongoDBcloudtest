package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "camiones")
public class Camion {
	
	
	private String id;
	private String numero_bastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	
	public Camion(String numero_bastidor, String matricula, String marca, String modelo, String tipo) {
		super();
		this.numero_bastidor = numero_bastidor;
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



	public String getNumero_bastidor() {
		return numero_bastidor;
	}



	public void setNumero_bastidor(String numero_bastidor) {
		this.numero_bastidor = numero_bastidor;
	}
	

}
