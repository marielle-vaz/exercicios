package edu.br.marielle.aula6.ex1;

public class Funcionario {

	private String nome, matricula;
	private double salarioBase;
	
	public Funcionario(String nome, String matricula, double salarioBase) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
