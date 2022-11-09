package com.senac.perguntasrespostas;

import java.io.IOException;



import java.util.Scanner;

/**
 * CLASSE BASE TEM TODOS OS METÓDOS BÁSICOS PARA QUE O NOSSO JOGO FUNCIONE, POR EXEMPLO:
 * JOGAR - COMEÇA O JOGO E MOSTRA AS PERGUNTAS PARA O USUÁRIO.
 */


public class Base {

    public static void main(String[] args) throws Exception {
        StarGamer();
    }

    static Scanner entrada = new Scanner(System.in);


    //-------------------------------- METODOS AUXILIARES ------------------------------
    public static void StarGamer() throws Exception {
        // INICIALIZAÇÃO ----------------------------------------------------
        System.out.println("------------ PERGUNTAS E RESPOSTAS -------------");
        menu();
    }

    public static void GamerOver() throws Exception {
        // Adicionar o total de pontos que o usuario fez e o ranking que ele ficou
        String nome_usuario = Jogadores.getNickname();
        System.out.println( "Infelizmente você perdeu! " + " " + nome_usuario + " " + "Deseja ver sua pontuacao?");
        System.out.println("[1] SIM e [2] NÃO");
        int input = leiaInput(" > ", 2);
        if (input == 1 || input == 01){
            Pontuacao.star();
        } else {
            menu();
        }
    }

    public static void menu() throws Exception {
                // METODO MENU: Utilizado para chamar os outros metodos que dÃ£o aÃ§Ã£o para o jogo.
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
                break;

            case 2:
                instrucoes();
                break;

            case 3:
            	//o null significa que os argumentos do método creditos() são referentes a outros métodos, não a essa classe base.java
            	Creditos.creditos(null);
                break;

            case 4:
                Pontuacao.star();
                break;
        }
    }
    /***
     * @jogar - Método altera o atributo NickName do objeto NovoJogador de acordo com a entrada informada
     * pelo usuário.
     * Feito a alteração no objeto, exibir para os usuários a categoria.
     * @throws IOException
     */
    public static void jogar() throws IOException {
        System.out.println("Informe seu nickname: ");
        String NickName = entrada.next();
        Jogadores novoJogador = new Jogadores();
        novoJogador.setNickname(novoJogador.toString(NickName)); // ATRIBUIDO O NOME DO JOGADOR
        categoria();
        Pontuacao.star();
    }

    public static void instrucoes(){
        // Esse metodo vai trabalhar com arquivos
    }


    /***
     * METODO LEIAINPUT: Tratamento de erro para evitar que usuarios digite a informações erradas.
     * OPS: Apenas para valores tipo INT!
     * @param prompt
     * @param numEscolhas
     * @return
     */
    public static int leiaInput(String prompt, int numEscolhas) {

        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(entrada.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Por favor insira um nÃºmero vÃ¡lido");
            }
        } while (input < 1 || input > numEscolhas);
        return input;
    }

    public static void categoria() throws IOException {
        String nome_usuario = Jogadores.getNickname();
        System.out.println("Bem vindo!" + nome_usuario);
        System.out.println("Escolha a categoria antes de iniciar:");
        System.out.println("[1] Geek");
        System.out.println("[2] Músicas");
        System.out.println("[3] Conhecimentos gerais");
        System.out.print("O que deseja fazer?");

        int input = Base.leiaInput(" > ", 3);

        switch (input) {
            case 1:
                PerguntasGeek.Pergunta1();

            case 2:
                PerguntasMusica.Pergunta1Musica();

            case 3:
                PerguntasCall.Pergunta1();
        }
    }
    
}
