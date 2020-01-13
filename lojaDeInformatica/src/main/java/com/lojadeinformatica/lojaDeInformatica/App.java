package com.lojadeinformatica.lojaDeInformatica;

import com.lojadeinformatica.baseDados.BaseDadosAcessorio;
import com.lojadeinformatica.baseDados.BaseDadosCliente;
import com.lojadeinformatica.baseDados.BaseDadosComputador;
import com.lojadeinformatica.servicoVenda.ServicoVendaImpl;

public class App 
{
	public static void main( String[] args )
    {
      BaseDadosAcessorio baseListaCarros= new BaseDadosAcessorio();
      BaseDadosComputador baseListaMotos= new BaseDadosComputador();
      BaseDadosCliente baseListaClientes= new BaseDadosCliente();
      
      ServicoVendaImpl servicoVendaImpl= new ServicoVendaImpl();
      
      System.out.println(servicoVendaImpl.venda(baseListaCarros.getListaAcessorios()[0], baseListaClientes.getListaClientes()[0]));
      System.out.println(servicoVendaImpl.venda(baseListaMotos.getListaComputadores()[1], baseListaClientes.getListaClientes()[1]));
      
    
    }
}
