package com.senac.perguntasrespostas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.senac.perguntasrespostas.Perguntas.pontuacaojogador;

public class PerguntasMusica {
    public static int pontosAtuais = 0;
    public static int pontosErros = 0;
    public static int vidasAtuais = 3;
    public static int visualizarAcertos = pontuacaojogador.getAcertos();
    public static int VisualizarErros = pontuacaojogador.getAcertos();
    public static int VidasJogador = pontuacaojogador.getVidas();


public static void Pergunta1Musica() throws IOException{
    
    String arquivo = "PerguntasMusica/Pergunta1Musica.txt"; 
    Path caminho = Paths.get(arquivo); 

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))){
        for (String line : bufferedReader.lines().toList())
        System.out.println(line);

        int input = Base.leiaInput(">", 4);

        if (input == 1 || input == 01   ){
            pontosAtuais = pontosAtuais + 1; 
            pontuacaojogador.setAcertos(pontosAtuais); 
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();
            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);
        }else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você errou, a resposta certa é a [1] Rap");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
            
        }
         Pergunta2Musica();
    } 
}   
public static void Pergunta2Musica() throws IOException{

    String arquivo = "PerguntasMusica/Pergunta2Musica.txt";
    Path caminho = Paths.get(arquivo);

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4 );
        
        if (input == 2 || input == 02 ){
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas(); 

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);

        } else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();


            System.out.println("Você errou! A resposta correta é [2] 7 ");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }
        
        if (vidasAtuais == 0){
            Base.GamerOver();
        }else{
            Pergunta3Musica();
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
  
}
public static void Pergunta3Musica() throws Exception{

    String arquivo = "PerguntasMusica/Pergunta3Musica.txt"; 
    Path caminho = Paths.get(arquivo); 

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);


        if (input == 2 || input == 02) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);

        } else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();
            
            System.out.println("Você errou! A resposta correta é a [2] Thriller - Michael Jackson.");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }
        if (vidasAtuais== 0 ){
            Base.GamerOver();
        } else {
            Pergunta4Musica();
        }
    }

}
public static void Pergunta4Musica() throws IOException {

    String arquivo = "PerguntasMusica/Pergunta4Musica.txt"; 
     Path caminho = Paths.get(arquivo); 

     try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);


        if (input == 3 || input == 03) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);

        } else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            
            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

          
            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você errou! A resposta correta é a [3] 4 .");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }
        if (vidasAtuais == 0 ){
            Base.GamerOver();
        } else {
            Pergunta5Musica();
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public static void Pergunta5Musica() throws IOException {

    String arquivo = "PerguntasMusica/Pergunta5Musica.txt";
    Path caminho = Paths.get(arquivo);

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);

        if (input == 3 || input == 03 ){
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);

        }else {
            pontosErros = pontosAtuais + 1; 
            vidasAtuais = vidasAtuais - 1; 

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você errou ! A resposta correta é [3] Dangerously in Love");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }
        if (vidasAtuais == 0){
            Base.GamerOver(); 
        }else {
            Pergunta6Musica(); 
        }

    } catch (Exception e) {
        throw new RuntimeException (e); 
    }    
}
public static void Pergunta6Musica() throws IOException {
   
    String arquivo = "PerguntasMusica/Pergunta6Musica.txt"; 
    Path caminho = Paths.get(arquivo); 
    
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);

        if (input == 1 || input == 01 ){
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);

        } else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            
            System.out.println("Você errou! A resposta correta é [1] Madona");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
            
        }
        if (vidasAtuais == 0 ){
            Base.GamerOver();
        } else {
            Pergunta7Musica();
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public static void Pergunta7Musica() throws IOException{

    String arquivo = "PerguntasMusica/Pergunta7Musica.txt"; 
    Path caminho = Paths.get(arquivo);
    
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);

        if (input == 4 || input == 04) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);
        }else{
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você errou! A resposta correta é [4] Outkast ");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);

        }    
        if (vidasAtuais == 0){
            Base.GamerOver();
        }else {
            Pergunta8Musica(); 
        }
    }catch (Exception e){
        throw new RuntimeException(e); 
    }   
    // teste 
}
public static void Pergunta8Musica() throws IOException{

    String arquivo = "PerguntasMusica/Pergunta8Musica.txt"; 
    Path caminho = Paths.get(arquivo); 

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);


        if (input == 3 || input == 03) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos =  pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);
        
        }else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você errou! A resposta correta é [3] Jason Mraz ");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);

        }
        if (vidasAtuais == 0){
            Base.GamerOver(); 
        }else {
            Pergunta9Musica (); 
        }

    }catch (Exception e) {
        throw new RuntimeException(e);
    }


}   
// teste 2
public static void Pergunta9Musica() throws IOException{

    String arquivo = "PerguntasMusica/Pergunta9Musica.txt"; 
    Path caminho = Paths.get(arquivo); 

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);

        if (input == 3 || input == 03) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);
        }else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você errou! A resposta correta é a [3] Tupac Amaru Shakur.");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }    
        if (vidasAtuais == 0){
        Base.GamerOver();
    } else {
        Pergunta10Musica();
    }
    } catch (Exception e) {
    throw new RuntimeException(e);
    }
  }
public static void Pergunta10Musica() throws IOException{

    String arquivo = "PerguntasMusica/Pergunta10Musica.txt"; 
    Path caminho = Paths.get(arquivo);      

    
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
        for (String line : bufferedReader.lines().toList())
            System.out.println(line);

        int input = Base.leiaInput(" > ", 4);

        if (input == 2 || input == 02) {
            pontosAtuais = pontosAtuais + 1;
            pontuacaojogador.setAcertos(pontosAtuais);
            visualizarAcertos = pontuacaojogador.getAcertos();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Parabens! Você acertou!");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de vidas: " + VidasJogador);

        }else {
            pontosErros = pontosErros + 1;
            vidasAtuais = vidasAtuais - 1;

            pontuacaojogador.setAcertos(pontosAtuais);
            pontuacaojogador.setVidas(vidasAtuais);
            pontuacaojogador.setErros(pontosErros);

            visualizarAcertos = pontuacaojogador.getAcertos();
            VisualizarErros = pontuacaojogador.getErros();
            VidasJogador = pontuacaojogador.getVidas();

            System.out.println("Você perdeu! Seu riquinho de merda");
            System.out.println("Seus pontos são: " + visualizarAcertos);
            System.out.println("Total de erros: " + VisualizarErros);
            System.out.println("Total de vidas: " + VidasJogador);
        }
        if (vidasAtuais == 0 ){
            Base.GamerOver();
        }else  {
            System.out.println("Parabens! Você venceu! Sua pontuação: ");
            Pontuacao.leitura();
            
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}


}
    
  

