package edu.br.marielle.aula2.ex1;

/*Crie uma classe Mensagem contendo os atributos data (literal), autor (literal) e texto (literal)
Crie um método configurar, que exiba uma mensagem “Configuração realizada” no console
Crie um método que receba três parâmetros (data, autor e texto) que devem ser copiados para os atributos da classe.
Crie um método enviar que recupere os valores data, autor e texto do objeto e mostre no console uma mensagem que concatene os três valores na forma:
    “Olá <autor>, sua mensagem com o texto <texto> foi enviada em <data>”
Crie uma classe de testes para criar os objetos e chamar os métodos descritos nos itens anteriores */

public class Mensagem {
    String data, autor, texto;

    public void configurar(){
        System.out.println("Configuração realizada!");
    }
    public void copiar(String aut, String txt, String dt){
        this.autor = aut;
        this.texto = txt;
        this.data = dt;
        enviar();
    }

    public void enviar(){
        System.out.println("Olá " + this.autor + ", sua mensagem com o texto \"" + this.texto + "\" foi enviada em " + this.data);
    }
}
