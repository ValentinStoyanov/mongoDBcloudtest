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


	
	private  int cargacodigo;
	private int cargapeso;
	private String cargatipo;
	private String origen;
	private String destino;
	private String marcaremolque;
	
	
	public ConsultaModelo() {
		
	}


	public int getCargacodigo() {
		return cargacodigo;
	}


	public void setCargacodigo(int cargacodigo) {
		this.cargacodigo = cargacodigo;
	}


	public int getCargapeso() {
		return cargapeso;
	}


	public void setCargapeso(int cargapeso) {
		this.cargapeso = cargapeso;
	}


	public String getCargatipo() {
		return cargatipo;
	}


	public void setCargatipo(String cargatipo) {
		this.cargatipo = cargatipo;
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


	public String getMarcaremolque() {
		return marcaremolque;
	}


	public void setMarcaremolque(String marcaremolque) {
		this.marcaremolque = marcaremolque;
	}

	
}
