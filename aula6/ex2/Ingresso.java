package edu.br.marielle.aula6.ex2;

public class Ingresso {

	double valor;

	public Ingresso() {
		this.valor = 100;
	}

	public Ingresso(double valor) {
		this.valor = valor;
	}

	public void imprimeValor() {
		System.out.println("Valor: " + this.valor);
	}
	
}
