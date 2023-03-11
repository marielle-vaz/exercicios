package edu.br.marielle.aula6.ex1;

import java.text.NumberFormat;

public class Teste {

	public static void main(String[] args) {
		Gerente f1 = new Gerente("Marielle", "1208", 5230.50);
		Assistente f2 = new Assistente("Ana", "1503", 2500.90);
		Vendedor f3 = new Vendedor("Maria", "3108", 1302.05);

		double soma = 0;
		soma = (f1.getSalarioBase() + f2.getSalarioBase() + f3.getSalarioBase());
		
		System.out.println("A soma dos salários é igual a " + NumberFormat.getCurrencyInstance().format(soma));

	}

}
