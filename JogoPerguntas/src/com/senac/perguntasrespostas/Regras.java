package com.senac.perguntasrespostas;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Regras {
public static void instrucoes() throws IOException {
		FileInputStream abrirArquivo = new FileInputStream("Regras/Instruções.txt");
		  InputStreamReader entradaFormatada = new InputStreamReader(abrirArquivo);
		  		  BufferedReader arquivoRegras = new BufferedReader(entradaFormatada);		     
		  String linha;
		  		  while ((linha = arquivoRegras.readLine()) != null) {
		   System.out.println(linha);
		   		  }
		  arquivoRegras.close();
		 }
}