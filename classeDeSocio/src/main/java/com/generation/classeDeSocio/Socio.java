package com.generation.classeDeSocio;

public class Socio {
	//atributos
			private String nome;
			private String cpf;
			private String rg;
			private String nascimento;
			private String telefone;
			private String endereco;

	//construtor
			public Socio(String nome, String cpf, String rg, String nascimento, String telefone, String endereco) {

				super();
				this.nome = nome;
				this.cpf = cpf;
				this.rg = rg;
				this.nascimento = nascimento;
				this.telefone = telefone;
				this.endereco = endereco;
			}

	//get e set
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getCpf() {
				return cpf;
			}

			public void setCpf(String cpf) {
				this.cpf = cpf;
			}

			public String getRg() {
				return rg;
			}

			public void setRg(String rg) {
				this.rg = rg;
			}

			public String getNascimento() {
				return nascimento;
			}

			public void setNascimento(String nascimento) {
				this.nascimento = nascimento;
			}

			public String getTelefone() {
				return telefone;
			}

			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}

			public String getEndereco() {
				return endereco;
			}

			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}

	//métodos

			public void cadastrar() {
				System.out.println("Cadastrado!");
			}
			public void confirmarCadastro() {
				System.out.println("Confirmando cadastro!");
			}
			public void validarSocio() {
				System.out.println("Validar sócio!");
			}
			public void alterar() {
				System.out.println("Alterar!");
			}
		
		}
