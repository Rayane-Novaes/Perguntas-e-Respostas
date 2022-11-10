package com.senac.perguntasrespostas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



import static com.senac.perguntasrespostas.PerguntasGeek.pontuacaojogador;
public class PerguntasCall {

    public static int pontosAtuais = 0;
    public static int pontosErros = 0;
    public static int vidasAtuais = 3;
    public static int visualizarAcertos = pontuacaojogador.getAcertos();
    public static int VisualizarErros = pontuacaojogador.getAcertos();
    public static int VidasJogador = pontuacaojogador.getVidas();


    // ---------------------------------------------------------------------------
    public static void Pergunta1() throws IOException {
        // Deve marcar os pontos e enviar para classe Pontuação
        // Dev: Lucas
        // Pergunta 01 -----------------------------------------------------------------------

        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        String arquivo = "PerguntasCuriosidades/Pergunta1Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);
        }

        int input = Base.leiaInput(" > ", 4);

        if (input == 3) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            System.out.println("Parabens! Você acertou!\nAlternativa (1) Descartes \"Je pense, donc je suis\" é a frase original, "
                    + "escrita em francês, do filósofo René Descartes (1596-1650).\n"
                    + "Ela resume o pensamento e o método de Descartes, para quem tudo tem início na dúvida.");
            System.out.println("Seus pontos são: " + visualizarAcertos + VidasJogador);

        } else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;


            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            vidasAtuais = pontuacaojogador.getVidas();

            System.out.println("Você errou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }
        if (vidasAtuais == 0) {

        } else {
            Pergunta2();

        }
    }





    public static void Pergunta2() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta2Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa (4) Fossa das Marianas.! A Fossa das Marianas, no Oceano Pacífico, é o lugar mais profundo do planeta. Sua profundidade atinge os 10 984 metros.");
                System.out.println("Seus pontos são: " + visualizarAcertos + vidasAtuais);
            } else {
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);


                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou!");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta3();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Pergunta3() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta3Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 3) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você Acertou!\n (3) Operação Barbarossa (Países do Eixo na Segunda Guerra Mundial.");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
            } else {
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta4();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Pergunta4() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta4Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 1) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa (1) O ato ocorreu na cidade de Montgomery,\n" +
                        "no estado do Alabama, em 1.º de dezembro de 1955. Rosa Parks foi detida, \n" +
                        "mas sua desobediência serviu de exemplo e foi importante para a luta contra a segregação racial nos Estados Unidos.");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
            } else {
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta5();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public static void Pergunta5() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta5Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 3) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa (3) Solstício de verão.! No solstício de verão o planeta atinge a sua máxima inclinação em relação ao Sol.\n" +
                        "Pela incidência direta do Sol sobre o trópico, nesse dia, o hemisfério fica um maior tempo recebendo luz solar,\n" +
                        "marcando o início do verão e o maior dia do ano.");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta6();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Pergunta6() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta6Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 2) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa  (2) Valentina Tereshkova.!  Valentina Tereshkova foi a primeira cosmonauta (equivalente soviético à astronauta) a viajar para o espaço em 16 de junho de 1963..");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta7();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Pergunta7() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta7Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa  (4) Alan Turing! Alan Turing é atribuído o título de pai da informática, que veio a receber em 1975,\n" +
                        " graças aos seus estudos e grande contribuição para a área da Teoria da Computação; Juntos,\n" +
                        " eles podem ser considerados os pais da Ciência da Computação!");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta8();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Pergunta8() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta8Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa  (4) Monte Everest! O Monte Everest tem 8.848 metros de altitude e localiza-se no Nepal,\n" +
                        " um país asiático que faz fronteira com a China e com a Índia.");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta9();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Pergunta9() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta9Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 1) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa  (1) As partes do mundo unidas pelo Olimpismo! A bandeira olímpica é branca e contém cinco anéis, cada um com uma cor diferente.\n" +
                        " Esses anéis são representados nas seguintes posições: na parte de cima -\n" +
                        " da esquerda para a direita - estão os anéis azul, preto e vermelho; na parte de baixo - da esquerda para a direita -\n" +
                        " estão os anéis amarelo e verde.");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais);
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0){
                Base.GamerOver();
            } else{
                Pergunta10();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void Pergunta10() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", VidasJogador = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "PerguntasCuriosidades/Pergunta10Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 1) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
                System.out.println("Parabens! Você acertou!\nAlternativa  (1) Acordo internacional que trata do aquecimento global! O Acordo de Paris é um acordo internacional que foi adotado durante a Conferência das Partes - COP 21, em Paris,\n" +
                        "no ano de 2015.\n" +
                        "Aprovado por 195 países, ele tem como objetivo central minimizar os impactos causados pelo aquecimento global.\n" +
                        "Todos os países envolvidos se comprometeram a reduzir emissões de gases de efeito estufa nas próximas décadas.");
                System.out.println("Seus pontos são: " + visualizarPontos + vidasAtuais); // Falta informar as vidas do usuário após o strVidas"
            } else {
                pontosErros = pontosErros + 1;
                vidasAtuais = vidasAtuais - 1;


                pontuacaojogador.setAcertos(pontosAtuais);
                pontuacaojogador.setVidas(vidasAtuais);
                pontuacaojogador.setErros(pontosErros);

                visualizarAcertos = pontuacaojogador.getAcertos();
                VisualizarErros = pontuacaojogador.getErros();
                vidasAtuais = pontuacaojogador.getVidas();

                System.out.println("Você errou");
                System.out.println("Seus pontos são: " + visualizarAcertos);
                System.out.println("Total de erros: " + VisualizarErros);
                System.out.println("Total de vidas: " + VidasJogador);
            }
            if (vidasAtuais == 0 ){
                Base.GamerOver();
            } else {
                System.out.println("Parabens! Você venceu! Sua pontuação: ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


