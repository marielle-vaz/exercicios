package edu.br.marielle.aula4.ex5;

/*Escreva dois construtores para uma classe Ponto2D: um sem argumentos que considere que o ponto está na origem, ou seja, 
 com coordenadas (0; 0), e um que receba dois argumentos do tipo double e que os use para inicializar os campos da classe*/

public class Ponto2D {

	private double x, y;

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ponto2D() {
		this.x = 0;
		this.y = 0;
	}

	@Override
	public String toString() {
		return "(" + x + " ; " + y + ")";
	}
	
}
