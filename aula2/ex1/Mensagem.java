package edu.br.marielle.aula2.ex1;

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
