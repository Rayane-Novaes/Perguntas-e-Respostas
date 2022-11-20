package com.senac.perguntasrespostas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PerguntasGeek {

    static Jogadores pontuacaojogador = new Jogadores();



    // ---------------------------------------------------------------------------
    public static void Pergunta1() throws IOException {
        // Tratamento para caso o usuário troque de categoria futuramente
        pontuacaojogador.setAcertos(0);
        pontuacaojogador.setErros(0);
        pontuacaojogador.setVidas(3);

        // PERGUNTA 1 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta1Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 1 || input == 01) {
                pontuacaojogador.setAcertos(+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {

                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(+1);


                System.out.println("Você erro! O lado da força não está com você.");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            // Chamado a pergunta 2 para mostrar par usuário
            Pergunta2();
        }
    }
    public static void Pergunta2() throws IOException {
        // Deve marcar os pontos e enviar para classe Pontuação
        // PERGUNTA 2 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta2Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 3 || input == 03) {

                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você erro! Parece que nem com a música favorita você te salvaria do Vecna.");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }

            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                // Chamado a pergunta 3 para mostrar par usuário
                Pergunta3();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void Pergunta3() throws Exception {

        // PERGUNTA 3 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta3Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 2 || input == 02) { // Verifica se a Alternativa está correta
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você erro! Você não tem o jeito ninja.");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                Pergunta4();
            }
        }
    }
    public static void Pergunta4() throws IOException {

        // PERGUNTA 4 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta4Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 1 || input == 01) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);


                System.out.println("Você erro! Você não tem o jeito ninja.");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                Pergunta5();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Pergunta5() throws IOException {

        // PERGUNTA 5 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta5Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 4 || input == 04) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você perdeu! Mas quem dizer que isso é problema meu...");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                Pergunta6();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Pergunta6() throws IOException {

        // PERGUNTA 6 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta6Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 2 || input == 02) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você perdeu! Seu riquinho de merda");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                Pergunta7();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Pergunta7() throws IOException {

        // PERGUNTA 7 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta7Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 2 || input == 02) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você perdeu! Is mi Mário!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                Pergunta8();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Pergunta8() throws IOException {

        // PERGUNTA 8 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta8Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 3 || input == 03) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você perdeu! Seu riquinho de merda");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                Pergunta9();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Pergunta9() throws IOException {

        // PERGUNTA 9 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta9Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 4 || input == 04) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você perdeu! Seu riquinho de merda");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                // Chamado a pergunta 3 para mostrar par usuário
                Pergunta10();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Pergunta10() throws IOException {

        // PERGUNTA 10 ----------------------------------------------------------------------------
        String arquivo = "PerguntasGeek/Pergunta10Geek.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);


            if (input == 3 || input == 03) {
                pontuacaojogador.setAcertos(pontuacaojogador.getAcertos()+1);

                System.out.println("Parabens! Você acertou!");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());

            } else {
                // MODIFICADO OBJETO ------------------------------------------
                pontuacaojogador.setVidas(pontuacaojogador.getVidas()-1);
                pontuacaojogador.setErros(pontuacaojogador.getErros()+1);

                System.out.println("Você perdeu! Seu riquinho de merda");
                System.out.println("Seus pontos são: " + pontuacaojogador.getAcertos());
                System.out.println("Total de erros: " + pontuacaojogador.getErros());
                System.out.println("Total de vidas: " + pontuacaojogador.getVidas());
            }
            if (pontuacaojogador.getVidas() == 0 ){
                Base.GamerOver();
            } else {
                System.out.println( "Voce ganhou! " + " " + Jogadores.getNickname() + " " + "Deseja abrir o menu?");
                System.out.println("[1] SIM e [2] NAO");
                int entrada = Base.leiaInput(" > ", 2);

                if (entrada == 1 || entrada == 01){
                    Base.menu();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
