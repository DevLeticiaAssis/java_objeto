package com.lojadeinformatica.model;

public class Computador extends Tecnologia {
	
	public Computador() {
		super();
	}

	public Computador(String processador, String memoria, String sistema_operacional, String placa_video) {
		super();
		this.processador = processador;
		this.memoria = memoria;
		this.sistema_operacional = sistema_operacional;
		this.placa_video = placa_video;
	}
	
	private String processador;
	private String memoria;
	private String sistema_operacional;
	private String placa_video;
	
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getSistema_operacional() {
		return sistema_operacional;
	}
	public void setSistema_operacional(String sistema_operacional) {
		this.sistema_operacional = sistema_operacional;
	}
	public String getPlaca_video() {
		return placa_video;
	}
	public void setPlaca_video(String placa_video) {
		this.placa_video = placa_video;
	}
	
}
