package edu.br.marielle.aula3.ex2;

public class Empregado {

	private String nome, sobrenome;
	private double salario_mensal;
	
	public double salarioAnual() {
		double salario_anual = this.salario_mensal * 12;
		salario_anual += (salario_anual * 0.10);
		return salario_anual;
	}
	
	public Empregado(String nome, String sobrenome, double salario_mensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario_mensal = salario_mensal;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario_mensal() {
		return salario_mensal;
	}
	public void setSalario_mensal(double salario_mensal) {
		this.salario_mensal = salario_mensal;
	}
	
	
}
