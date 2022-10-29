import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Perguntas {

    public static int pontuacao = 0;
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
        String arquivo = "PerguntasGeek/Pergunta1Geek.txt";
        Path caminho = Paths. get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            switch (input){
                case 1:
                    pontuacao = 1;

                case 2:
                    pontuacao = pontuacao - 1;
                case 3:
                    pontuacao = pontuacao - 1;
                case 4:
                    pontuacao = pontuacao -1;
            }

        }
    }



    public static void musica(){

    }

    public static void curiosidade(){
        // Deve marcar os pontos e enviar para classe Pontuação
    }
}
