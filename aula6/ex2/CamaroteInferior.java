package edu.br.marielle.aula6.ex2;

public class CamaroteInferior extends Vip{

	public CamaroteInferior(double valor) {
		super(valor);
	}

	private String localIngresso = "Frente ao palco";

	
	public String acessaLocal() {
		return this.localIngresso;
	}
	
	public void imprimeLocal() {
		System.out.println("Local: " + this.localIngresso);
	}

	public String getLocalIngresso() {
		return localIngresso;
	}

	public void setLocalIngresso(String localIngresso) {
		this.localIngresso = localIngresso;
	}
	
}
