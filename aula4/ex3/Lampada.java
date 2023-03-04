package edu.br.marielle.aula4.ex3;

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
