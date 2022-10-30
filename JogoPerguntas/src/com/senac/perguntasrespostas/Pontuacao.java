package com.senac.perguntasrespostas;

public class Pontuacao {
    public static void rankingCategorias(){
        System.out.println("Escolha a categoria de ranking:");
        System.out.println("[1] Geek");
        System.out.println("[2] Músicas");
        System.out.println("[3] Conhecimentos gerais");

        int input = Base.leiaInput(" > ", 3);
    }


}
