package edu.br.marielle.aula1.ex2;

public class Testes {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Marielle";
        aluno1.genero = "F";

        aluno2.nome = "Ana";
        aluno2.genero = "F";

        System.out.println("Nome do 1º aluno: " + aluno1.nome + "\n" + "Nome do 2º aluno: " + aluno2.nome);

        System.out.println("----------------------------------");

        aluno1.idade = Aluno.geradorIdade(20, 61);
        aluno2.idade = Aluno.geradorIdade(20, 61);
        System.out.println("Idade do 1º aluno: " + aluno1.idade + "\n" + "Idade do 2º aluno: " + aluno2.idade);

        System.out.println("----------------------------------");

        aluno1.nome = Aluno.formatarNome(aluno1.nome);
        aluno2.nome = Aluno.formatarNome(aluno2.nome);

        System.out.println("Nome maiúsculo do 1º aluno: " + aluno1.nome + "\n" + "Nome maiúsculo do 2º aluno: " + aluno2.nome);
    }
}
