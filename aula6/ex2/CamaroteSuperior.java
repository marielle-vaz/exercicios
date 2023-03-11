package edu.br.marielle.aula6.ex2;

public class CamaroteSuperior extends Vip {

	private double valorAdicional = 100;
	
	public CamaroteSuperior(double valor) {
		super(valor);
	}

	@Override
	public double valorInregssoVip() {
		return (super.valorInregssoVip() + this.valorAdicional);
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
