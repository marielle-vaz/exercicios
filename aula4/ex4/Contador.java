package edu.br.marielle.aula4.ex4;

/*Escreva dois construtores para uma classe Contador, um que n�o receba argumentos 
 e considere que o contador come�a a contar a partir do zero, e outro que aceita um valor inicial para contagem.*/

public class Contador {

	int n = 10;
	
	public Contador() {
		for(int i = 0; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public Contador(int x) {
		for(int i = x; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
	
}
