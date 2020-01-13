package com.lojadeinformatica.servicoVenda;

import com.lojadeinformatica.model.Tecnologia;
import com.lojadeinformatica.modelCliente.Cliente;

public interface IServicoVenda {
	
	String venda(Tecnologia produto, Cliente cliente);	
	String cancelarVenda(Tecnologia produto,Cliente cliente);

}
