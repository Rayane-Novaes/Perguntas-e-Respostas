package com.senac.perguntasrespostas;

public class Pontuacao {
    public static void rankingCategorias(){
        System.out.println("Escolha a categoria de ranking:");
        System.out.println("[1] Geek");
        System.out.println("[2] Músicas");
        System.out.println("[3] Conhecimentos gerais");

        int input = Base.leiaInput(" > ", 3);
        switch (input){
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;
        }
    }

    public static void Ordenacao(){}
    public static void CriarArquivo(){}
    public static void EscreverArquivo(){}

    public static void LerArquivo(){}

}
