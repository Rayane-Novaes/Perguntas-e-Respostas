package com.senac.perguntasrespostas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Regras {
	public static void instrucoes() throws Exception {
		String arquivo = "Regras/Instrucoes.txt";
		Path caminho = Paths.get(arquivo);

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
			for (String line : bufferedReader.lines().toList())
				System.out.println(line);
		}
		System.out.println("Deseja voltar para o menu inicial?");
        System.out.println("[1]Sim [2]Não");
        int input = Base.leiaInput(" > ", 2);
        if (input == 1){
            Base.menu();
        }
		
	}
}
