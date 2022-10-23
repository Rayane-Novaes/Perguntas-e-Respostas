import java.util.Scanner;

public class Base {

    static Scanner entrada = new Scanner(System.in);


    // -------------------------- METODOS DE AÇÃO DE JOGABILIDADE ------------------------------
    public static void StarGamer(){
        // Inicializar
        System.out.println("------------ PERGUNTAS E RESPOSTAS -------------");
        System.out.println("Bem vindo, usuários! Prontos para testar os conhecimentos?");
        Continue();
        menu();
    }

    public static void GamerOver(){}
    public static void menu() {
                // METODO MENU: Utilizado para chamar os outros metodos que dão ação para o jogo.
                System.out.println("------------- Menu Principal -----------------");
                System.out.println("[1] Jogar");
                System.out.println("[2] Instruções");
                System.out.println("[3] Créditos");

                System.out.print("O que deseja fazer?");
                int input = leiaInput(" > ", 3);

                switch (input) {
                    case 1:
                        jogar();
                        break;

                    case 2:
                        instrucoes();
                        break;

                    case 3:
                        creditos();
                        break;
                }
    }


    public static void jogar(){
        // Esse metodo cosulta as classes perguntas e pontuação
        Pontuação.Jogador();
        Perguntas.categoria();
        Pontuação.ranking();
    }

    public static void instrucoes(){
        // Esse metodo vai trabalhar com arquivos
    }
    public static void creditos(){
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
