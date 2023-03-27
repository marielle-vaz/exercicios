package edu.br.marielle.atividade_frequencia;

import java.text.NumberFormat;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private float salarioBase, imposto;
	
	public Empregado(){
		super();
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public float calcularSalario() {
		return (salarioBase - (salarioBase*imposto/100));
	}
	
	@Override
	public String toString() {
		return " ------ Empregado ------ \n Nome: " + getNome() + "\n Endereço: " + getEndereco() + "\n Telefone: " + getTelefone() 
		+"\n Código Setor: " + codigoSetor + "\n Salário Base: " + NumberFormat.getCurrencyInstance().format(salarioBase) + "\n Imposto: " + imposto + "%\n Novo Salário: " 
		+ NumberFormat.getCurrencyInstance().format(calcularSalario()) + "\n";
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

}
