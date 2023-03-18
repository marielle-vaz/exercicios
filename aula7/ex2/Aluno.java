package edu.br.marielle.aula7.ex2;

public class Aluno extends Pessoa{

	float nota;
	
	public Aluno(String nome, int anoNasc, float nota) {
		super(nome, anoNasc);
		this.nota = nota;
	}
	
	public String mostraDados() {
		return ("Nome: " + getNome() + "\nAno de Nascimento: " + getAnoNasc() + "\nNota: " + getNota());
	}

	public float getNota() {
		return nota;
	}
	

}
