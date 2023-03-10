package edu.br.marielle.aula5.ex5;

import java.util.Arrays;

/*Crie uma classe GeradorDeArray que recebe em seu construtor um número inteiro num e inicialize sua propriedade palavras 
(que é um array de Strings) ****com a quantidade de palavras igual a num (cada palavra deve ser a concatenação de “item” e o índice correspondente). 
Torne a propriedade palavras privada e a encapsule.
Crie um método nessa classe que receba como parâmetro um índice inteiro e retorneo valor correspondente dessa posição dentro da propriedade palavras do objeto.
Verifique se o valor do índice é valido (maior que 0 e menor que o tamanho do array). Caso o índice seja inválido, imprima uma mensagem de erro no console.
Crie uma classe de testes e em seu método main, crie 3 instâncias de GeradorDeArray. Para cada instância, percorra as posições da propriedade palavras e exiba o 
conteúdo de cada item no console.*/

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
			System.out.println("ERRO! Índice informado é inválido!");
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
