package edu.br.marielle.aula5.ex3;

/*
0 0 0 0 0 0
1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3 3
4 4 4 4 4 4
5 5 5 5 5 5 */

public class Array3 {

	private int[][] matriz = new int[6][6];
	
	public Array3() {
		
		for(int linha = 0; linha < 6; linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				matriz[linha][coluna] = linha;
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
		
	}
	
}
