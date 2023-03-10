package edu.br.marielle.aula1.ex2;

/*Crie uma classe Aluno com os atributos: nome, genero e idade
Crie uma classe de testes, contendo o método main, crie dois objetos da classe Aluno e exiba no console o nome de cada um deles
Crie um método estático que gere a idade do aluno de forma aleatória, no intervalo de 20 a 60 anos
Crie um método estático que formate o nome do aluno, colocando o nome em letras maiúsculas*/

public class Aluno {
    String nome, genero;
    int idade;

    public static String formatarNome(String n){
        return n.toUpperCase();
    }

    public static int geradorIdade(int min, int max){
        int i = (int)(Math.random() * (max-min) + min);
        return i;
    }

}
