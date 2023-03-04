package edu.br.marielle.aula5.ex2;

/*
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81 */

public class Array2 {
	private int[][] matriz = new int[5][10];
	
	public Array2() {
		
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				matriz[linha][coluna] = coluna*coluna;
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
		
	}
}
