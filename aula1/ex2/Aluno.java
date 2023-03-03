package edu.br.marielle.aula1.ex2;

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
