package com.senac.perguntasrespostas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Regras {
	public static void instrucoes() throws Exception {
		FileInputStream abrirArquivo = new FileInputStream("Regras/Instrucoes.txt");
		  InputStreamReader entradaFormatada = new InputStreamReader(abrirArquivo);
		  		  BufferedReader arquivoRegras = new BufferedReader(entradaFormatada);		     
		  String linha;
		  		  while ((linha = arquivoRegras.readLine()) != null) {
		   System.out.println(linha);
		   		  } // do laco
		  arquivoRegras.close();

				System.out.println("Deseja voltar para o menu inicial?");
        System.out.println("[1]Sim [2]Não");
        int input = Base.leiaInput(" > ", 2);
        if (input == 1){
            Base.menu();
        } //do if
		
	} //da funcao
}
