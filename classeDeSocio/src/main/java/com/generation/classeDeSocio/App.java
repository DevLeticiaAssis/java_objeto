package com.generation.classeDeSocio;

public class App {

	public static void main(String[] args) {

		Socio cliente1 = new Socio("Thiago", "123.456.789-01", "123.456.78-x", "01/01/1992", "99999-9999",
				"Rua Tal de Tal, 01");

		Socio cliente2 = new Socio("Marcos", "456.789.123-02", "456.781.23-y", "02/02/1993", "99999-9999",
				"Rua Tal de Tal, 02");

		Socio cliente3 = new Socio("Vitor", "789.123.456-03", "781.234.56-z", "03/03/1994", "99999-9999",
				"Rua Tal de Tal, 03");

		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("RG: " + cliente1.getRg());
		System.out.println("Data de Nascimento: " + cliente1.getNascimento());
		System.out.println("Telefone: " + cliente1.getTelefone());
		System.out.println("Endereço: " + cliente1.getEndereco() + "\n");
		
		System.out.println("Status do Cliente: ");
		cliente1.cadastrar();
		cliente1.alterar();
		cliente1.confirmarCadastro();
		cliente1.validarSocio();

		System.out.println("\nNome: " + cliente2.getNome());
		System.out.println("CPF: " + cliente2.getCpf());
		System.out.println("RG: " + cliente2.getRg());
		System.out.println("Data de Nascimento: " + cliente2.getNascimento());
		System.out.println("Telefone: " + cliente2.getTelefone());
		System.out.println("Endereço: " + cliente2.getEndereco() + "\n");
		
		System.out.println("Status do Cliente: ");
		cliente2.cadastrar();
		cliente2.alterar();
		cliente2.confirmarCadastro();
		cliente2.validarSocio();
		
		System.out.println("\nNome: " + cliente3.getNome());
		System.out.println("CPF: " + cliente3.getCpf());
		System.out.println("RG: " + cliente3.getRg());
		System.out.println("Data de Nascimento: " + cliente3.getNascimento());
		System.out.println("Telefone: " + cliente3.getTelefone());
		System.out.println("Endereço: " + cliente3.getEndereco() + "\n");
		
		System.out.println("Status do Cliente: ");
		cliente3.cadastrar();
		cliente3.alterar();
		cliente3.confirmarCadastro();
		cliente3.validarSocio();
	}
}