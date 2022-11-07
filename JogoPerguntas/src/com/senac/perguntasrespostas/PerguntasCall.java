package com.senac.perguntasrespostas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



import static com.senac.perguntasrespostas.Perguntas.pontuacaojogador;

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

        String strErrou = "Você errou!\nSeus pontos são: ", strVidas = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "Perguntascuriosidade/Pergunta1Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
            } else {
                // Código para caso o usuário informe a resposta errada
            }

            switch (input) {
                case 1:
                    System.out.println(strErrou + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                case 2:
                    System.out.println(strErrou + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                case 3:
                    System.out.println("Parabens! Você acertou!\nAlternativa (1) Descartes \"Je pense, donc je suis\" é a frase original, "
                            + "escrita em francês, do filósofo René Descartes (1596-1650).\n"
                            + "Ela resume o pensamento e o método de Descartes, para quem tudo tem início na dúvida.");
                    System.out.println("Seus pontos são: " + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                case 4:
                    System.out.println(strErrou + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }


    public static void Pergunta2() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", strVidas = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "Perguntascuriosidade/Pergunta2Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
            } else {
                // Código para caso o usuário informe a resposta errada
            }

            switch (input) {
                case 1:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 2:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 3:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 4:
                    System.out.println("Parabens! Você acertou!\nAlternativa (4) Fossa das Marianas \"A Fossa das Marianas,\" no Oceano Pacífico, é o lugar mais profundo do planeta.\"" +
                            " Sua profundidade atinge os 10 984 metros.");
                    System.out.println("Seus pontos são: " + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }


    public static void Pergunta3() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", strVidas = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "Perguntascuriosidade/Pergunta3Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
            } else {
                // Código para caso o usuário informe a resposta errada
            }

            switch (input) {
                case 1:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 2:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 3:
                    System.out.println("Parabens! Você acertou!\nAlternativa (3) Ultron \"Frase dita no filme A Era de Ultron.\n" +
                            "Neste multiverso, Tony Stark cria Ultron a partir de uma das Jóias do infinito com o propósito de neutralizar ameaças,\n" +
                            "mas o robô acaba deduzindo que para salvar a humanidade é preciso exterminá-la. No percurso, um corpo biomecânico\n" +
                            "criado por Ultron para si é roubado pelos Vingadores, dando origem ao Visão.");
                    System.out.println("Seus pontos são: " + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                case 4:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }

    public static void Pergunta4() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", strVidas = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "Perguntascuriosidade/Pergunta4Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
            } else {
                // Código para caso o usuário informe a resposta errada
            }

            switch (input) {
                case 1:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 2:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 3:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 4:
                    System.out.println("Parabens! Você acertou!\nAlternativa (4) Garoto. \"Garoto pra lá, garoto pra cá, em várias horas de gameplay, Atreus sofre constantemente com as broncas nada sutis\n" +
                            "de seu pai, que é ninguém menos do que o brutal Fantasma de Esparta.");
                    System.out.println("Seus pontos são: " + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }

    public static void Pergunta5() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", strVidas = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "Perguntascuriosidade/Pergunta5Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
            } else {
                // Código para caso o usuário informe a resposta errada
            }

            switch (input) {
                case 1:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 2:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 3:
                    System.out.println("Parabens! Você acertou!\nAlternativa (3) Solstício de verão. \"No solstício de verão o planeta atinge a sua máxima inclinação em relação ao Sol.\n" +
                            "Pela incidência direta do Sol sobre o trópico, nesse dia, o hemisfério fica um maior tempo recebendo luz solar,\n" +
                            "marcando o início do verão e o maior dia do ano.");
                    System.out.println("Seus pontos são: " + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                case 4:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }

    public static void Pergunta6() throws IOException {


        String strErrou = "Você errou!\nSeus pontos são: ", strVidas = "\nTotal de vidas: ";
        int visualizarPontos = 0;
        int pontosAtuais = 0;
        String arquivo = "Perguntascuriosidade/Pergunta6Call.txt";
        Path caminho = Paths.get(arquivo);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
            for (String line : bufferedReader.lines().toList())
                System.out.println(line);

            int input = Base.leiaInput(" > ", 4);

            if (input == 4) {
                pontosAtuais = pontosAtuais + 1;
                pontuacaojogador.setAcertos(pontosAtuais);
                visualizarPontos = pontuacaojogador.getAcertos();
            } else {
                // Código para caso o usuário informe a resposta errada
            }

            switch (input) {
                case 1:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 2:
                    System.out.println("Parabens! Você acertou!\nAlternativa (2) Thomas A. Anderson. \"No mundo humano, Neo na verdade se chama Thomas A. Anderson e trabalha para uma empresa de softwares como programador.\n" +
                            "Ao conhecer Morpheus e ao descobrir toda a realidade da Matrix, ele assume a identidade de Neo.");
                    System.out.println("Seus pontos são: " + visualizarPontos + strVidas); // Falta informar as vidas do usuário após o strVidas
                    break;

                case 3:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                case 4:
                    System.out.println(strErrou + visualizarPontos + strVidas);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }
}

