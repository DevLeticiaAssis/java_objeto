package com.lojadeinformatica.model;

public class Tecnologia extends Produto {

	public Tecnologia() {
		super();
	}
	
	public Tecnologia(String marca, String modelo, String ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	private String marca;
	private String modelo;
	private String ano;
	
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
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
}

