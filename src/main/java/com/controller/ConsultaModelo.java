package com.controller;

public class ConsultaModelo {

	public ConsultaModelo(int codigo, String marca, String matricula) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.matricula = matricula;
	}
	private int codigo;
	private String marca;
	private String matricula;
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
