package edu.br.marielle.aula3.ex1;

/*Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve conter quatro variáveis – o número (String), 
a descrição (String), a quantidade comprada de um item (int) e o preço por item (double).
A classe deve ter um construtor e um método get e set para cada variável de instância.
Além disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. 
Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0.
Escreva uma classe de teste chamada FaturaTeste (em outro arquivo) que demonstra as capacidades da classe Fatura.*/

public class Fatura {
	
	private String numero, descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public double getTotalFatura() {
		double total = this.quantidade * this.preco;
		if(total < 0) {
			total = 0;
		}
		if(this.preco < 0){
			total = 0.0;
		}
		return total;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
