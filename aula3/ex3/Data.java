package edu.br.marielle.aula3.ex3;

public class Data {
	
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		if(ano > 0) {
			this.ano = ano;
		} else {
			System.out.println("Ano inválido!");
		}
		
		if((mes>0) && (mes<13)) {
			this.mes = mes;
		} else {
			System.out.println("Mês inválido!");
		}
		
		if((dia > 0) && (dia < 32)) {
			this.dia = dia;
		} else {
			System.out.println("Dia inválido!");
		}
	}
	
	public void displayData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
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
