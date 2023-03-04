package edu.br.marielle.aula2.ex1;

public class Testes {
    public static void main(String[] args) {

        Mensagem msg = new Mensagem();
        msg.autor  = "Marielle";
        msg.data  = "10/02/2023";
        msg.texto  = "Hoje é sexta!";

        msg.configurar();
        msg.copiar(msg.autor, msg.texto, msg.data);

    }
}
