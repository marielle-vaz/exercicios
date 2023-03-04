package edu.br.marielle.aula5.ex5;

public class GeradorDeArray {

	private int num;
	private String[] palavras = new String[num];
	
	public GeradorDeArray(int num) {
		this.num = num;
		palavras[num];
	}

	public String configuraMensagem(int indice) {
		
		if((indice >= 0) && (indice<this.num)) {
			
		}
		return palavras[indice];
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String[] getPalavras() {
		return palavras;
	}
	
	public void setPalavras(String[] palavras) {
		this.palavras = palavras;
	}
	
}
