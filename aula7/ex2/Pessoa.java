package edu.br.marielle.aula7.ex2;

public class Pessoa {

	String nome;
	int anoNasc;
	
	public Pessoa(String nome, int anoNasc) {
		super();
		this.nome = nome;
		this.anoNasc = anoNasc;
	}
	
	public String mostraDados() {
		return ("Nome: " + getNome() + "\nAno de Nascimento: " + getAnoNasc());
	}

	public String getNome() {
		return nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}
	
	
}
