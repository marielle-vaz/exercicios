package edu.br.marielle.aula5.ex1;

/*
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9*/

public class Array1 {

	private int[][] matriz = new int[3][10];
	
	public Array1() {
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				matriz[linha][coluna] = coluna;
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
		
	}
	
}

