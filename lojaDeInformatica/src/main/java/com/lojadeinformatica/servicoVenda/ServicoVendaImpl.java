package com.lojadeinformatica.servicoVenda;

import com.lojadeinformatica.model.Tecnologia;
import com.lojadeinformatica.modelCliente.Cliente;

public class ServicoVendaImpl {
	
	public String venda(Tecnologia produto, Cliente cliente) {
		String mensagem= "Cliente: "+cliente.getNome()+" comprando tecnologia "+produto.getNome()+" marca: "+produto.getMarca()+" modelo: "+produto.getModelo();
		return mensagem;
	}

	public String cancelarVenda(Tecnologia produto, Cliente cliente) {
		String mensagem="Cliente: "+cliente.getNome()+" cancelando a compra de uma tecnologia tipo"+produto.getNome()+" tecnologia: marca "+produto.getMarca();
		return mensagem;
	}

}
