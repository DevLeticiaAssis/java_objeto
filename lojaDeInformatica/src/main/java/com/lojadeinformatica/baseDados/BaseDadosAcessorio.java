package com.lojadeinformatica.baseDados;

import com.lojadeinformatica.model.Acessorio;

public class BaseDadosAcessorio {

	private Acessorio[] listaAcessorios;

	public BaseDadosAcessorio() {
		listaAcessorios= new Acessorio[3];
		
		listaAcessorios[0]= new Acessorio("teclado gamer", "mouse de gamer", "fone de gamer");
		listaAcessorios[1]= new Acessorio("teclado multimídia", "mouse de USB", "fone bluetooth");
		listaAcessorios[2]= new Acessorio("teclado com SmartCard", "mouse optico", "fone");
	}

	public Acessorio[] getListaAcessorios() {
		return listaAcessorios;
	}

	public void setListaAcessorios(Acessorio[] listaAcessorios) {
		this.listaAcessorios = listaAcessorios;
	}
	
}
