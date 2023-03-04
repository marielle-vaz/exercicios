package edu.br.marielle.aula4.ex3;

public class LampadaTeste {

	public static void main(String[] args) {
		Lampada l1 = new Lampada();
	
		System.out.println(l1.toString());
		
		Lampada lamp_w1 = new Lampada(300);
		Lampada lamp_w2 = new Lampada();
		
		System.out.println(lamp_w1.toString());
		System.out.println(lamp_w2.toString());
		
	}

}
