package com.senac.perguntasrespostas;

public class Jogadores {
    private static String nickname;
    private static int Acertos;
    private int vidas = 3;

    private static int acertos;
    private int erros;


    public static String getNickname() {
        return nickname;
    }


    public void setNickname(String nickname) {
        Jogadores.nickname = nickname;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }


    public static int getAcertos() {
        return acertos;
    }
    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {

        return this.erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }



}
