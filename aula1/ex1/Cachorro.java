package edu.br.marielle.aula1.ex1;

/*Crie uma classe Cachorro que possua um atributo raca
Crie um método emitirSom na classe Cachorro, do tipo static e que não retorne valor
Crie um método correr, sem retorno
Crie uma classe Testes, com um método main e dentro dele, crie uma instância da classe Cachorro e chame seus métodos*/


public class Cachorro {

    String raca;

    public void emitirSom() {
        System.out.println("Auau!");
    }

    public void correr() {
        System.out.println("O cachorro está correndo!");
    }
}
