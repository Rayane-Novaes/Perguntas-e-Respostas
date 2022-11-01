package com.senac.perguntasrespostas;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Base {

    static Scanner entrada = new Scanner(System.in);


    // -------------------------- METODOS DE AÇÃO DE JOGABILIDADE ------------------------------
    public static void StarGamer() throws Exception {
        // INICIALIZAÇÃO ----------------------------------------------------
        System.out.println("------------ PERGUNTAS E RESPOSTAS -------------");
        menu();
    }

    public static void GamerOver(){
        // Adicionar o total de pontos que o usuário fez e o ranking que ele ficou
        String nome_usuario = Jogadores.getNickname();
        System.out.println(nome_usuario + "infelizmente você perdeu! Deseja continua?");
        System.out.println("[1] SIM e [2] Não");
    }

    public static void menu() throws Exception {
                // METODO MENU: Utilizado para chamar os outros metodos que dão ação para o jogo.
                System.out.println("------------- Menu Principal -----------------");
                System.out.println("[1] Jogar");
                System.out.println("[2] Instruções");
                System.out.println("[3] Créditos");
                System.out.println("[4] Pontuação");


                System.out.print("O que deseja fazer?");
                int input = leiaInput(" > ", 4);

        switch (input) {
            case 1:
 jogar();
            case 2:
 instrucoes();
            case 3: 
Path novoArquivo=Creditos.criarArquivo();            	
Creditos.escrever(novoArquivo);
String conteudo=Creditos.ler(novoArquivo);
System.out.println(conteudo);

            case 4:
 Pontuacao.rankingCategorias();
        }
    }


    public static void jogar() throws IOException {
        // Esse metodo consulta as classes perguntas e jogador
        System.out.println("Informe seu nickname: ");
        String NickName = entrada.next();
        Jogadores novoJogador = new Jogadores();
        novoJogador.setNickname(novoJogador.toString(NickName)); // ATRIBUIDO O NOME DO JOGADOR
        Perguntas.categoria();
        Pontuacao.rankingCategorias();
    }

    public static void instrucoes(){
        // Esse metodo vai trabalhar com arquivos
    }



    //------------------------- METODOS AUXILIARES ------------------------------
    public static void Continue(){
        // Utilizei o metodo continue quando terminarem uma ação. Por exemplo:
        // Usuário deseja ir para próxima pergunta, ENTÃO DIGITE QUALQUER COISA PRA CONTINUA.

        System.out.println("\nDigite alguma coisa para continua.");
        entrada.next();
    }
    public static int leiaInput(String prompt, int numEscolhas) {
        // METODO LEIAINPUT: Tratamento de erro para evitar que usuário digite a informação errada.
        // OPS: Apenas para valores tipo INT!

        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(entrada.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Por favor insira um número válido");
            }
        } while (input < 1 || input > numEscolhas);
        return input;
    }


}
