package edu.br.marielle.aula3.ex2;

import java.text.NumberFormat;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Marielle", "Rodrigues Vaz", 100);
		Empregado e2 = new Empregado("Ana Júlia", "Alves Teixeira", 50);
		
		System.out.println(" ------------- Empregado 1 -------------  \nNome completo: " + e1.getNome() + " " + e1.getSobrenome());
		System.out.println("Salário mensal: " + NumberFormat.getCurrencyInstance().format(e1.getSalario_mensal()) + "\n");
		
		System.out.println(" ------------- Empregado 2 -------------  \nNome completo: " + e2.getNome() + " " + e2.getSobrenome());
		System.out.println("Salário mensal: " + NumberFormat.getCurrencyInstance().format(e2.getSalario_mensal()) + "\n");
		
		System.out.println("**************************************** \n");
		
		System.out.println(" ------------- Empregado 1 -------------");
		System.out.println("Salário anual: " + NumberFormat.getCurrencyInstance().format(e1.salarioAnual()) + "\n");
		
		System.out.println(" ------------- Empregado 2 -------------");
		System.out.println("Salário anual: " + NumberFormat.getCurrencyInstance().format(e2.salarioAnual()) + "\n");
		
	}

}
