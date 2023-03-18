package edu.br.marielle.aula6.ex2;

public class Teste {

	public static void main(String[] args) {
		
		Ingresso ingresso = new Ingresso();
		Normal normal = new Normal();
		Vip vip = new Vip();
		CamaroteInferior cInfeior = new CamaroteInferior();
		CamaroteSuperior cSuperior = new CamaroteSuperior();
		
		normal.imprimeValor();
		System.out.println("\n Vip ");
		vip.imprimeValor();
		System.out.println("\n Camarote Inferior ");
		cInfeior.imprimeValor();
		System.out.println(cInfeior.getLocalIngresso());
		System.out.println("\n Camarote Superior ");
		cSuperior.imprimeValor();

	}

}
