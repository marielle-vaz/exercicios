package edu.br.marielle.atividade_frequencia;

import java.text.NumberFormat;

public class Administrador extends Empregado{

	private float ajudaDeCusto;
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase,
			float imposto, float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public float calcularSalario() {
		return (getSalarioBase() - (getSalarioBase()*getImposto()/100) + ajudaDeCusto);
	}
	
	@Override
	public String toString() {
		return " ------ Administrador ------ \n Nome: " + getNome() + "\n Endere�o: " + getEndereco() + "\n Telefone: " + getTelefone() 
		+"\n C�digo Setor: " + getCodigoSetor() + "\n Sal�rio Base: " + NumberFormat.getCurrencyInstance().format(getSalarioBase()) 
		+ "\n Imposto: " + getImposto() +"%\n Ajuda de Custo: " + NumberFormat.getCurrencyInstance().format(ajudaDeCusto) 
		+ "\n Novo Sal�rio: " + NumberFormat.getCurrencyInstance().format(calcularSalario())+ "\n";
	}

}
