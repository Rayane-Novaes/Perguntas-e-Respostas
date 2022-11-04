package com.senac.perguntasrespostas;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.StandardOpenOption;

import static com.senac.perguntasrespostas.Perguntas.pontuacaojogador;
import static java.nio.charset.StandardCharsets.*;

public class Pontuacao {
    public static void rankingCategorias() throws IOException {
        System.out.println("Escolha a categoria de ranking:");
        System.out.println("[1] Geek");
        System.out.println("[2] Músicas");
        System.out.println("[3] Conhecimentos gerais");

        int input = Base.leiaInput(" > ", 3);
        switch (input){
            case 1:
                escreverGeek();
                break;

            case 2:
                break;

            case 3:
                break;
        }
    }


    public static void escreverGeek() throws IOException {

        int Acertos = pontuacaojogador.getAcertos();
        String nome_usuario = Jogadores.getNickname();

        String texto_nome = "PLAY: " + nome_usuario + "\n" + "PONTUACAO: " + Acertos;

        // Escrevendo no arquivo
        Path arquivo = Path.of("PontuacaoArquivo/PontuacaoGeek.txt");
        try (OutputStream outputStream = Files.newOutputStream(arquivo, StandardOpenOption.APPEND)) {
            for (int i=0;i<=9;i++)
                if (i < 1){
                    outputStream.write(String.valueOf(texto_nome + "\r\n").getBytes());
                }
        }
        leitura();
    }

    public static void leitura() throws IOException {
        String arquivo = "PontuacaoArquivo/PontuacaoGeek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);
        }
    }
    public static void OrdenacaoGeek(){
        System.out.println("teste");
    }





}
