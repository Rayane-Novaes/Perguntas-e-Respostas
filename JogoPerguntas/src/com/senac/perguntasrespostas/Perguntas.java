package com.senac.perguntasrespostas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
                geek();

            case 2:
                musica();
            case 3:
                curiosidade();
        }
        Base.Continue();

    }
    public static void geek() throws IOException {
        // Deve marcar os pontos e enviar para classe Pontuação
        // Pergunta 01 -----------------------------------------------------------------------
        int pontosAtuais = 0;
        String arquivo = "PerguntasGeek/Pergunta1Geek.txt";
        Path caminho = Paths. get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            switch (input){
                case 1:
                    pontosAtuais = pontosAtuais + 1;
                    pontuacaojogador.setAcertos(pontosAtuais);
                    int visualizarPontos = pontuacaojogador.getAcertos();

                    System.out.println("Parabens! Você acertou!");
                    System.out.println("Seus pontos são: " + visualizarPontos);
                    System.out.println("Total de vidas: ");
                    break;

                case 2:
                    System.out.println("Você erro! O lado da força não está com você.");
                    System.out.println("Seus pontos são: ");
                    System.out.println("Total de vidas: ");
                    break;

                case 3:
                    System.out.println("Você erro! O lado da força não está com você.");
                    System.out.println("Seus pontos são: ");
                    System.out.println("Total de vidas: ");
                    break;

                case 4:
                    System.out.println("Você erro! O lado da força não está com você.");
                    System.out.println("Seus pontos são: ");
                    System.out.println("Total de vidas: ");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }

        }
    }



    public static void musica(){
        // Deve marcar os pontos, enviar para classe PerguntasRespostas.Jogadores
        // Dev: Vinicius Santana

    }

    public static void curiosidade(){
        // Deve marcar os pontos e enviar para classe Pontuação
        // Dev: Lucas
    }
}
