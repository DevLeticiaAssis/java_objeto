package com.lojadeinformatica.model;

public class Acessorio extends Tecnologia {
	
	public Acessorio() {
		super();
	}
	
	public Acessorio(String tipo_teclado, String tipo_mouse, String tipo_fone) {
		super();
		this.tipo_teclado = tipo_teclado;
		this.tipo_mouse = tipo_mouse;
		this.tipo_fone = tipo_fone;
	}
	
	private String tipo_teclado;
	private String tipo_mouse;
	private String tipo_fone;
	
	public String getTipo_teclado() {
		return tipo_teclado;
	}
	public void setTipo_teclado(String tipo_teclado) {
		this.tipo_teclado = tipo_teclado;
	}
	public String getTipo_mouse() {
		return tipo_mouse;
	}
	public void setTipo_mouse(String tipo_mouse) {
		this.tipo_mouse = tipo_mouse;
	}
	public String getTipo_fone() {
		return tipo_fone;
	}
	public void setTipo_fone(String tipo_fone) {
		this.tipo_fone = tipo_fone;
	}

}
