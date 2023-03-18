package edu.br.marielle.aula7.ex1;

public class Peixe extends Animal {

	private String caracteristica;
	
	public Peixe(String nome, String cor, String ambiente, float comprimento, float vel_media, int n_patas, String caracteristica) {
		super(nome, cor, ambiente, comprimento, vel_media, n_patas);
		this.caracteristica = caracteristica;
	}

	public void dadosPeixe() {
		System.out.println(" - Dados do Peixe - ");
		System.out.println("Nome = " + nome + "\nCor = " + cor + "\nAmbiente = " + ambiente
				+ "\nComprimento = " + comprimento + "\nVelocidade média = " + vel_media 
				+ "\nNúmero de patas = " + n_patas + "\nCaracteristica = " + caracteristica );
		
	}
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
