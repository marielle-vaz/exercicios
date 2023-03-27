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
		return " ------ Oper�rio ------ \n Nome: " + getNome() + "\n Endere�o: " + getEndereco() + "\n Telefone: " + getTelefone() 
		+"\n C�digo Setor: " + getCodigoSetor() + "\n Sal�rio Base: " + NumberFormat.getCurrencyInstance().format(getSalarioBase()) 
		+ "\n Imposto: " + getImposto() + "%\n Valor da Produ��o: " + NumberFormat.getCurrencyInstance().format(valorProducao)
		+ "\n Comiss�o: " + comissao + "%\n Novo Sal�rio: " + NumberFormat.getCurrencyInstance().format(calcularSalario()) + "\n";
	}

}
