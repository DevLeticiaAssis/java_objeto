package com.lojadeinformatica.baseDados;

import com.lojadeinformatica.model.Computador;
import com.lojadeinformatica.model.Tecnologia;

public class BaseDadosComputador {
	
	private Computador[] listaComputadores;

	public BaseDadosComputador() {
		listaComputadores= new Computador[3];
		
		listaComputadores[0]= new Computador("processador 1", "memória 1", "sistema operacional 1", "placa de vídeo 1");
		listaComputadores[1]= new Computador("processador 2", "memória 2", "sistema operacional 2", "placa de vídeo 2");
		listaComputadores[2]= new Computador("processador 3", "memória 3", "sistema operacional 3", "placa de vídeo 3");
	}

	public Computador[] getListaComputadores() {
		return listaComputadores;
	}

	public void setListaComputadores(Computador[] listaComputadores) {
		this.listaComputadores = listaComputadores;
	}


}
