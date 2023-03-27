package edu.br.marielle.atividade_frequencia;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa {

	private float valorCredito, valorDivida;
	
	public Fornecedor() {
		super();
	}
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float obterSaldo() {
		return (valorCredito - valorDivida);
	}
	
	@Override
	public String toString() {
		return " ------ Fornecedor ------ \n Nome: " + getNome() + "\n Endereço: " + getEndereco() + "\n Telefone: " + getTelefone()
				+ "\n Valor Credito: " + NumberFormat.getCurrencyInstance().format(valorCredito) + "\n Valor Dívida: R$ " 
				+ NumberFormat.getCurrencyInstance().format(valorDivida) + "\n Saldo: " 
				+ NumberFormat.getCurrencyInstance().format(obterSaldo()) + "\n";
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

}
