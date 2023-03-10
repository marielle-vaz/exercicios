package edu.br.marielle.aula3.ex4;

/*Crie uma classe em Java chamada InteiroSet, tendo como atributo um array, de valores booleanos, de 100 posições. 
Tal array representa os inteiros no intervalo de 0 a 99. Por exemplo: o elemento do array a[i] é true se o inteiro i estiver no conjunto. 
O elemento do array a[j] é false se o inteiro não estiver no conjunto.
O construtor, sem argumentos, inicializa o array com um “conjunto vazio” (todos os valores false).
Forneça os seguintes métodos:
- Método uniao: retorna um terceiro conjunto que é a união teórica de dois conjuntos existentes (isto é, aplicação da função lógica OU sobre os conjuntos e retorna o valor lógico true ou false);
- Método interseccao: retorna um terceiro conjunto que é a intersecção teórica de dois conjuntos existentes (isto é, aplicação da função lógica AND sobre os conjuntos e retorna o valor lógico true ou false);
- Método insereElemento: insere um novo elemento inteiro k em um conjunto (configurando a[k] como true);
- Método removeElemento: que exclui o inteiro m (configurando a[m] como false).
- Método converteEmString: retorna uma string contendo um conjunto como uma lista de números separados por espaço. Inclua somente os elementos que estão presentes no conjunto. Utilize – para representar um conjunto vazio;
- Método eIgualA determina se dois conjuntos são iguais;*/

import java.util.Arrays;

public class InteiroSet {
	private boolean[] numeros;

	public InteiroSet() {
		numeros = new boolean[100];
	}

	public InteiroSet uniao(InteiroSet conj1, InteiroSet conj2) {
		InteiroSet resposta = new InteiroSet();
		for(int i = 0; i < 100; i++) {
			resposta.numeros[i] = (conj1.numeros[i] || conj2.numeros[i]);
		}
		return resposta;
	}
	
	public InteiroSet interseccao(InteiroSet conj1, InteiroSet conj2) {
		InteiroSet resposta = new InteiroSet();
		for(int i = 0; i < 100; i++) {
			resposta.numeros[i] = (conj1.numeros[i] && conj2.numeros[i]);
		}
		return resposta;
	}
	
	public void insereElemento(int i) {
		numeros[i] = true;
	}
	
	public void removeElemento(int i) {
		numeros[i] = false;
	}
	
	public String converteEmString() {
		StringBuffer s = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			if(numeros[i]) {
				s.append(i).append(",");
			} else {
				s.append("-").append(",");
			}
		}
		return s.toString();
	}
	
	public static boolean eIgualA(InteiroSet conj1, InteiroSet conj2) {
		return Arrays.equals(conj1.numeros, conj2.numeros);
	}
	
}
