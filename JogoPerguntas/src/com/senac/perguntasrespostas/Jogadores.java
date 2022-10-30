package com.senac.perguntasrespostas;


public class Jogadores {
    private static String nickname;
    private int vidas = 3;
    private int pontuacao = 0;
    private int acertos;
    private int erros;

    public Jogadores() {
    }

    public static String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        Jogadores.nickname = nickname;
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getAcertos() {
        return this.acertos;
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

    public static void pontuacao() {
    }

    public static void ranking() {
    }

    public String toString(String nickName) {
        return nickName;
    }
}
