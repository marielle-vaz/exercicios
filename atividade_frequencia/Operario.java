package edu.br.marielle.atividade_frequencia;

import java.text.NumberFormat;

public class Operario extends Empregado{

	private float valorProducao, comissao;
	
	public Operario() {
		super();
	}
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto,
			float valorProducao, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return (getSalarioBase() - (getSalarioBase()*getImposto()/100) + (valorProducao*comissao/100));
	}
	

	@Override
	public String toString() {
		return " ------ Operário ------ \n Nome: " + getNome() + "\n Endereço: " + getEndereco() + "\n Telefone: " + getTelefone() 
		+"\n Código Setor: " + getCodigoSetor() + "\n Salário Base: " + NumberFormat.getCurrencyInstance().format(getSalarioBase()) 
		+ "\n Imposto: " + getImposto() + "%\n Valor da Produção: " + NumberFormat.getCurrencyInstance().format(valorProducao)
		+ "\n Comissão: " + comissao + "%\n Novo Salário: " + NumberFormat.getCurrencyInstance().format(calcularSalario()) + "\n";
	}

}
