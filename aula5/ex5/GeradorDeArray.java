package edu.br.marielle.aula5.ex5;

import java.util.Arrays;

/*Crie uma classe GeradorDeArray que recebe em seu construtor um n�mero inteiro num e inicialize sua propriedade palavras 
(que � um array de Strings) ****com a quantidade de palavras igual a num (cada palavra deve ser a concatena��o de �item� e o �ndice correspondente). 
Torne a propriedade palavras privada e a encapsule.
Crie um m�todo nessa classe que receba como par�metro um �ndice inteiro e retorneo valor correspondente dessa posi��o dentro da propriedade palavras do objeto.
Verifique se o valor do �ndice � valido (maior que 0 e menor que o tamanho do array). Caso o �ndice seja inv�lido, imprima uma mensagem de erro no console.
Crie uma classe de testes e em seu m�todo main, crie 3 inst�ncias de GeradorDeArray. Para cada inst�ncia, percorra as posi��es da propriedade palavras e exiba o 
conte�do de cada item no console.*/

public class GeradorDeArray {

	private int num;
	private String[] palavras = new String[num];
	
	public GeradorDeArray(int num) {
		this.num = num;
	}

	public String configuraMensagem(int indice) {
		String retorno = ""; 
		if((indice >= 0) && (indice<this.num)) {
			retorno = palavras[indice];
		} else {
			System.out.println("ERRO! �ndice informado � inv�lido!");
		}
		return retorno;
	}
	
	@Override
	public String toString() {
		return "GeradorDeArray [item=" + num + ", palavras=" + Arrays.toString(palavras) + "]";
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
