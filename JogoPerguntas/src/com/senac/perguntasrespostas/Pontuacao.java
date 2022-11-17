package com.senac.perguntasrespostas;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


import static com.senac.perguntasrespostas.PerguntasGeek.pontuacaojogador;

public class Pontuacao {

    public static void star() throws IOException {
        escrever();
        CriacaoArrayList();
    }
    public static void CriacaoArrayList() throws IOException {
        //Caminho do Arquivo Salvo:
        String arquivo = "PontuacaoArquivo/PontuacaoGeek.txt";
        Path caminho = Paths.get(arquivo);

        //Criando ArrayList de Jogadores:
        List <Jogadores> jogadores = new ArrayList<>();

        //Criando ArrayList das informações do Arquivo:
        List<String> linhasArquivo = Files.readAllLines(caminho);

        int contador = 0;

        for(int i = 0; i<= linhasArquivo.size()-1; i++){


            //Criando um Array para quebrar a informação da linha do arquivo em duas, usando o
            //metodo split(Ele olha onde tem ponto e virgula e quebra em dois)
            String[] linhaValores = linhasArquivo.get(i).split(";");

            //Instanciando objeto jogador na memória
            Jogadores jogadorAtual = new Jogadores();

            //Atribuindo os dados do arquivo ao objeto jogador:
            jogadorAtual.setNickname(linhaValores[0]);
            jogadorAtual.setAcertos(Integer.parseInt(linhaValores[1]));

            //Adicionando objeto jogador no arraylist de jogadores:
            jogadores.add(jogadorAtual);


            contador++;

        }
        BubleSort(jogadores);
    }

    public static void BubleSort(List <Jogadores> jogadores) throws IOException {

        String nome_aux;
        int pontos_aux;

        boolean controle = true;

        for (int i = 0; i < jogadores.size();i++){

            for (int j = 0; j < (jogadores.size() - 1);j++){
                if(jogadores.get(j).getAcertos() < jogadores.get(j + 1).getAcertos()){

                    nome_aux =  jogadores.get(j).getNickname();
                    pontos_aux = jogadores.get(j).getAcertos();

                    jogadores.get(j).setNickname(jogadores.get(j+1).getNickname());
                    jogadores.get(j).setAcertos(jogadores.get(j+1).getAcertos());

                    jogadores.get(j+1).setNickname(nome_aux);
                    jogadores.get(j+1).setAcertos(pontos_aux);
                    controle = false;

                }
            }
            if(controle == true){
                break;
            }
        }


        for (int i = 0; i < jogadores.size();i++){
            System.out.println("Posição: "+ (i+1)+"°"+ "Jogador: "+ Jogadores.getNickname()+" || Pontuação: "+ jogadores.get(i).getAcertos());
        }
    }



    public static void escrever() throws IOException {

        int Acertos = pontuacaojogador.getAcertos();
        String nome_usuario = Jogadores.getNickname();

        String texto_nome = nome_usuario + ";" + Acertos;

        // Escrevendo no arquivo
        Path arquivo = Path.of("PontuacaoArquivo/PontuacaoGeek.txt");
        try (OutputStream outputStream = Files.newOutputStream(arquivo, StandardOpenOption.APPEND)) {
            for (int i = 0; i <= 9; i++)
                if (i < 1) {
                    outputStream.write(String.valueOf(texto_nome + "\r\n").getBytes());
                }
        }
    }




//    public static void leitura() throws IOException {
//        String arquivo = "PontuacaoArquivo/PontuacaoGeek.txt";
//        Path caminho = Paths.get(arquivo);
//
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
//            for (String line : bufferedReader.lines().toList())
//                System.out.println(line);
//        }
//    }

}
