package com.senac.perguntasrespostas;


public class Jogadores {
    private static String nickname;
    private int vidas = 3;
    private int acertos;
    private int erros;

    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String toString(String nickName) {
        return nickName;
    }

    public int toInt(int acertos) {
        return acertos;
    }
}
