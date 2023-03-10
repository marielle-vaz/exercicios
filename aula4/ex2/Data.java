package edu.br.marielle.aula4.ex2;

/* Escreva um construtor para uma classe Data que receba os valores correspondentes ao dia, mês e ano, 
e inicialize os campos da classe, verificando antes se a data é válida. (dias entre 1 e 31, meses entre 1 e 12 e anos maiores que 0).*/

public class Data {
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano) {
		if((dia >= 1) && (dia <= 31)) {
			this.dia = dia;
		} else {
			System.out.println("Dia inválido!");
		}
		if((mes >= 1) && (mes <= 12)) {
			this.mes = mes;
		} else {
			System.out.println("Mês inválido!");
		}
		if(ano > 0) {
			this.ano = ano;
		} else {
			System.out.println("Ano inválido!");
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
