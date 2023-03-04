package edu.br.marielle.aula3.ex1;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura f1 = new Fatura("1", "Teclado", 5, 149.90);
		
		System.out.println(f1.getTotalFatura());
	}

}
