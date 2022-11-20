package com.senac.perguntasrespostas;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Regras {
	public static void instrucoes() throws IOException {
		String arquivo = "Regras/Instrucoes.txt";
		Path caminho = Paths.get(arquivo);

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(caminho)))) {
			for (String line : bufferedReader.lines().toList())
				System.out.println(line);
		}
	}
}