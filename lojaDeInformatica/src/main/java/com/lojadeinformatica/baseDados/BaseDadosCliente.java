package com.lojadeinformatica.baseDados;

import com.lojadeinformatica.modelCliente.Cliente;

public class BaseDadosCliente {

	private Cliente[] listaClientes;

	public BaseDadosCliente() {
		listaClientes= new Cliente[2];
		
		listaClientes[0]= new Cliente("Leticia", "123");
		listaClientes[1]= new Cliente("Aline", "456");			
		
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
