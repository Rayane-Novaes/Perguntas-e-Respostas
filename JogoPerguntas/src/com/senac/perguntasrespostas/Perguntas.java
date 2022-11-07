package com.senac.perguntasrespostas;


import java.io.IOException;

public class Perguntas {
    static Jogadores pontuacaojogador = new Jogadores();
    public static void categoria() throws IOException {
        String nome_usuario = Jogadores.getNickname();
        System.out.println("Bem vindo!" + nome_usuario);
        System.out.println("Escolha a categoria antes de iniciar:");
        System.out.println("[1] Geek");
        System.out.println("[2] Músicas");
        System.out.println("[3] Conhecimentos gerais");
        System.out.print("O que deseja fazer?");

        int input = Base.leiaInput(" > ", 3);

        switch (input){
            case 1:
                PerguntasGeek.Pergunta1();

            case 2:
                musica();

            case 3:
                PerguntasCall.Pergunta1();
        }
    }

    public static void musica(){
        // Deve marcar os pontos, enviar para classe PerguntasRespostas.Jogadores
        // Dev: Vinicius Santana

    }

}
