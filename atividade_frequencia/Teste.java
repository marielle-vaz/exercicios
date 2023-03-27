package edu.br.marielle.atividade_frequencia;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa fornecedor = new Fornecedor("Marielle", "Rua 1", "(62) 9 4002-8922", 10525.75f, 5100.10f);
		System.out.println(fornecedor.toString());
		
		Pessoa empregado = new Empregado("Ana", "Rua 2", "(62) 9 1234-5678", 2, 1500.50f,  5.8f);
		System.out.println(empregado.toString());
		
		Pessoa administrador = new Administrador("Maria", "Rua 3", "(62) 9 8765-4321", 3, 1302.13f, 4.6f, 251.10f);
		System.out.println(administrador.toString());
		
		Pessoa operario = new Operario("Pedro", "Rua 4", "(62) 9 4321-1234", 4, 1430.62f, 3.5f, 750.47f, 50f);
		System.out.println(operario.toString());
		
		Pessoa vendedor = new Vendedor("João", "Rua 5", "(62) 9 5678-8765", 5, 1698.81f, 6.1f, 5912.99f, 15f);
		System.out.println(vendedor.toString());
		
	}

}
