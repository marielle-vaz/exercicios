package edu.br.marielle.aula4.ex3;

/*Escreva um construtor para a classe Lampada de forma que instâncias desta só possam ser criadas se um estado inicial for passado para o construtor.
Esse estado pode ser o valor booleano que indica se a lâmpada está acesa (true) ou apagada (false).
Faça com que, caso o estado não seja passado na criação, a lâmpada esteja acesa  ou apagada, randomicamente.
Considere que classe Lampada também inclui o número de watts da lâmpada. Escreva dois construtores para a classe: 
- um que recebe como argumentos o número de watts da lâmpada,
- e outro, sem argumentos, que considera que a lâmpada tenha um valor entre 60 e 200 watts, randomicamente, por padrão.*/

import java.util.Random;

public class Lampada {
	
	private boolean situacao;
	private float watt;
	

	public Lampada() {	
		Random situacao = new Random();
	    this.situacao = situacao.nextBoolean();
	    
	    int max = 200;
		int min = 60;
		
		float watt = (float)(Math.random() * (max-min) + min);
        this.watt = watt;
	}
	
	public Lampada(boolean situacao) {
		this.situacao = situacao;
	}
	
	public Lampada(float watt) {
		this.watt = watt;
	}

	@Override
	public String toString() {
		return "Lampada \n Situacao = " + situacao + "\n Watt = " + watt + "\n";
	}

	public void lampadaLigada() {
		setSituacao(true);
	}
	
	public void lampadaDesligada() {
		setSituacao(false);
	}
	
	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public float getWatt() {
		return watt;
	}

	public void setWatt(float watt) {
		this.watt = watt;
	}
	
}
