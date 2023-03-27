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
		return " ------ Vendedor ------ \n Nome: " + getNome() + "\n Endereço: " + getEndereco() + "\n Telefone: " + getTelefone() 
		+"\n Código Setor: " + getCodigoSetor() + "\n Salário Base: " + NumberFormat.getCurrencyInstance().format(getSalarioBase()) 
		+ "\n Imposto: " + getImposto() + "%\n Valor das Vendas: " + NumberFormat.getCurrencyInstance().format(valorVendas)
		+ "\n Comissão: " + comissao + "%\n Novo Salário: " + NumberFormat.getCurrencyInstance().format(calcularSalario()) + "\n";
	}

}
