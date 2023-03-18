package edu.br.marielle.aula6.ex2;

public class CamaroteInferior extends Vip {

	String localIngresso = "Frente ao palco";
	
	public void imprimeLocal() {
		System.out.println("Local: " + this.localIngresso);
	}

	public String getLocalIngresso() {
		return localIngresso;
	}
	
}
