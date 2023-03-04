package edu.br.marielle.aula5.ex4;

/*
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0 */

public class Array4 {

	private int[][] matriz = new int[6][6];
	
	public Array4() {
		
		for(int linha = 0; linha < 6; linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				if(linha%2==0) {
					matriz[linha][coluna] = -1;
					System.out.print(matriz[linha][coluna] + " ");
				} else {
					matriz[linha][coluna] = 0;
					System.out.print(matriz[linha][coluna] + " ");
				}
				
			}
			System.out.println(" ");
		}
		
	}
}
