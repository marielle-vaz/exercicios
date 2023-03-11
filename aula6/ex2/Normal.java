package edu.br.marielle.aula6.ex2;

public class Normal extends Ingresso{

	public Normal(double valor) {
		super(valor);
	}
	
	public void imprimirIngresso() {
		System.out.println("Ingresso Normal: " + getValor());
	}

}
