package com.senac.perguntasrespostas;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.StandardOpenOption;


import static com.senac.perguntasrespostas.PerguntasGeek.pontuacaojogador;

public class Pontuacao {

    public static void star() throws IOException {
        escrever();
    }

    public static void escrever() throws IOException {

        int Acertos = pontuacaojogador.getAcertos();
        String nome_usuario = Jogadores.getNickname();

        String texto_nome = nome_usuario + "-" + Acertos;

        // Escrevendo no arquivo
        Path arquivo = Path.of("PontuacaoArquivo/PontuacaoGeek.txt");
        try (OutputStream outputStream = Files.newOutputStream(arquivo, StandardOpenOption.APPEND)) {
            for (int i = 0; i <= 9; i++)
                if (i < 1) {
                    outputStream.write(String.valueOf(texto_nome + "\r\n").getBytes());
                }
        }
        Ordenacao();
    }

    public static void Ordenacao() throws IOException {
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

}
