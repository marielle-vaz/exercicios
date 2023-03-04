package edu.br.marielle.aula3.ex4;

public class InteiroSetTeste {

	public static void main(String[] args) {
		InteiroSet c1 = new InteiroSet();
		InteiroSet c2 = new InteiroSet();
		
		int vetor1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 99};
		int vetor2[] = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 98};
		
		for(int i : vetor1) {
			c1.insereElemento(i);
		}
		
		for(int i : vetor2) {
			c2.insereElemento(i);
		}
		
		System.out.println(" CONJUNTOS:");
		System.out.println(c1.converteEmString());
		System.out.println(c2.converteEmString());
		
		InteiroSet u = new InteiroSet();
		System.out.println(" ");
		System.out.println(" UNIÃO: ");
		System.out.println(u.uniao(c1, c2).converteEmString());
		
		InteiroSet i = new InteiroSet();
		System.out.println(" ");
		System.out.println(" INTERSECÇÃO: ");
		System.out.println(i.interseccao(c1, c2).converteEmString());
		
		System.out.println(" ");
		System.out.println(" IGUAIS: " + InteiroSet.eIgualA(c1, c2));
		
		int posicao = 0;
		c2.removeElemento(posicao);
		System.out.println(c2.converteEmString());
	}

}
