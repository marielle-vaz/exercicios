package edu.br.marielle.aula3.ex4;

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
