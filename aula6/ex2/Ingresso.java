package edu.br.marielle.aula6.ex2;

public class Ingresso {

	public float ValorIngresso;
	   
	   public float getValorIngresso(){
	   return this.ValorIngresso;
	   }
	   public void setValorIngresso(float valorIngresso){
	   this.ValorIngresso = valorIngresso;
	   }
	    public void imprimeValor(float valor){
	    valor = this.ValorIngresso;
	       System.out.printf("Valor do Igresso:"+ valor);
	    }
	
	/*
	private double valor;
	
	public void imprimeValor() {
		System.out.println("Valor: " + valor);
	}
	
	public Ingresso(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}*/
}
