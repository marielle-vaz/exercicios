package edu.br.marielle.atividade_frequencia;

public class Pessoa {

	private String nome, endereco, telefone;

	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		endereco = "N�o informado";
		telefone = "N�o informado";
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
