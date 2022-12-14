package com.senac.perguntasrespostas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Creditos {
	
	public static Path criarArquivo() throws Exception {
		Path novoDiretorio = Files.createDirectory(Path.of("creditos do jogo"));
		Path novoArquivo = Files.createFile(novoDiretorio.resolve("creditos.txt"));
		return novoArquivo;
		}
	
	public static void escrever(Path novoArquivo) throws Exception {
	Files.writeString(novoArquivo,
			"Creditos do jogo \r\n" +
					"Este jogo foi criado e desenvolvido com a finalidade de trazer conhecimento a você e seus amigos enquanto se divertem respondendo a quizes de diferentes categorias. \r\n" +
					"Acumule pontos no ranking e sabedoria na mente! \r\n" +
					"CURSO: ANALISE E DESENVOLVIMENTO DE SISTEMAS \r\n" +
					"ANO DE CRIACAO: 2022\r\n" +
					"DESENVOLVEDORES\r\n" +
					"LUCAS ALMEIDA NASCIMENTO \r\n" +
					"PAMERA ROZEMBRA \r\n" +
					"RAYANE NOVAES DOS SANTOS \r\n" +
					"VINICIUS SANTANA \r\n" +
					"VINICIUS SOUZA ARAUJO \r\n",
			 			StandardOpenOption.APPEND);
	}
	
	public static String ler(Path novoArquivo) throws Exception {
		
		String conteudo = Files.readString(novoArquivo);
				return conteudo;								
}		       

public static void creditos(Path novoArquivo) throws Exception {
	novoArquivo = Paths.get("creditos do jogo/creditos.txt");
	if(!Files.exists(novoArquivo)) {
		novoArquivo =criarArquivo();
        escrever(novoArquivo);
		String conteudo = ler(novoArquivo);
		System.out.println(conteudo);
	}
	else {
      String conteudo = ler(novoArquivo);
	  System.out.println(conteudo);
		}
	
	System.out.println("Deseja voltar para o menu inicial?");
    System.out.println("[1]Sim [2]Não");
    int input = Base.leiaInput(" > ", 2);
    if (input == 1){
        Base.menu();
    }

}

}