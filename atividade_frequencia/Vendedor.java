package edu.br.marielle.atividade_frequencia;

import java.text.NumberFormat;

public class Vendedor extends Empregado{

	private float valorVendas, comissao;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto,
			float valorVendas, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return (getSalarioBase() - (getSalarioBase()*getImposto()/100) + (valorVendas*comissao/100));
	}
	
	@Override
	public String toString() {
		return " ------ Vendedor ------ \n Nome: " + getNome() + "\n Endere�o: " + getEndereco() + "\n Telefone: " + getTelefone() 
		+"\n C�digo Setor: " + getCodigoSetor() + "\n Sal�rio Base: " + NumberFormat.getCurrencyInstance().format(getSalarioBase()) 
		+ "\n Imposto: " + getImposto() + "%\n Valor das Vendas: " + NumberFormat.getCurrencyInstance().format(valorVendas)
		+ "\n Comiss�o: " + comissao + "%\n Novo Sal�rio: " + NumberFormat.getCurrencyInstance().format(calcularSalario()) + "\n";
	}

}
