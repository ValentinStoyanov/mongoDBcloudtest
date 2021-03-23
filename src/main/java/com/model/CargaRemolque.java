package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cargasremolques")
public class CargaRemolque {
	
	
	public CargaRemolque( String numerobastidor, String matricula, String marca, String modelo,
			String tipocarga, int idcarga, int codigo, String tiporemolque, int peso, String idorigen,
			String iddestino) {
		super();
		this.numerobastidor = numerobastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipocarga = tipocarga;
		this.idcarga = idcarga;
		this.codigo = codigo;
		this.tiporemolque = tiporemolque;
		this.peso = peso;
		this.idorigen = idorigen;
		this.iddestino = iddestino;
	}
	private String id;
	private String numerobastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipocarga;
	private int idcarga;
	private int codigo;
	private String tiporemolque;
	private int peso;
	private String idorigen;
	private String iddestino;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumerobastidor() {
		return numerobastidor;
	}
	public void setNumerobastidor(String numerobastidor) {
		this.numerobastidor = numerobastidor;
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
	public String getTipocarga() {
		return tipocarga;
	}
	public void setTipocarga(String tipocarga) {
		this.tipocarga = tipocarga;
	}
	public int getIdcarga() {
		return idcarga;
	}
	public void setIdcarga(int idcarga) {
		this.idcarga = idcarga;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTiporemolque() {
		return tiporemolque;
	}
	public void setTiporemolque(String tiporemolque) {
		this.tiporemolque = tiporemolque;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
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
	

}
