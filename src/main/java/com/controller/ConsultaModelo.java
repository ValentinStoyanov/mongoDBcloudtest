package com.controller;

import com.model.Camion;
import com.model.Carga;
import com.model.Conductor;
import com.model.Coordenada;
import com.model.OrigenDestino;
import com.model.Propietario;
import com.model.Remolque;
import com.model.Viaje;

public class ConsultaModelo {


	
	private  int carga_codigo;
	private int carga_peso;
	private String carga_tipo;
	private String origen;
	private String destino;
	private String marca_remolque;
	
	
	public ConsultaModelo() {
		
	}


	public int getCarga_codigo() {
		return carga_codigo;
	}


	public void setCarga_codigo(int carga_codigo) {
		this.carga_codigo = carga_codigo;
	}


	public int getCarga_peso() {
		return carga_peso;
	}


	public void setCarga_peso(int carga_peso) {
		this.carga_peso = carga_peso;
	}


	public String getCarga_tipo() {
		return carga_tipo;
	}


	public void setCarga_tipo(String carga_tipo) {
		this.carga_tipo = carga_tipo;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getMarca_remolque() {
		return marca_remolque;
	}


	public void setMarca_remolque(String marca_remolque) {
		this.marca_remolque = marca_remolque;
	}
	
	
	

	
	
}
