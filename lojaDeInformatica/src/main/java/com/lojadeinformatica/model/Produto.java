package com.lojadeinformatica.model;

public class Produto {

	public Produto() {
		super();
	}
	
	public Produto(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	private String nome;
	private float preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
