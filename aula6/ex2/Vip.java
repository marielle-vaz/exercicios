package edu.br.marielle.aula6.ex2;

public class Vip extends Ingresso{
	/*
	private double valorAdicional = 50;
	
	public double valorInregssoVip(){
		return (getValor() + valorAdicional);
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}*/
	
	public float ValorAdicional;
	   
    public float getValorAdicional(){
    return this.ValorAdicional;
    }
    public void setValorAdicional(float valorAdicional){
        this.ValorAdicional = valorAdicional;
    }
    public float valorIngressoVip(float valoringresso){
         this.ValorIngresso = valoringresso;
        return this.ValorIngresso + (this.ValorAdicional* this.ValorIngresso);       
    }

}
