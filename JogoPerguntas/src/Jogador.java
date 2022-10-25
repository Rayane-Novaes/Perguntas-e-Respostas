
public class Jogador {

    // Atributos do objeto Jogador
    private String nickname;
    private int vidas;
    private int pontuacao;
    private int acertos;
    private int erros;


    // Getters e setters dos atribuitos ----------------------------------------------------------
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public static void pontuacao(){
        // Realiza os calculos de para a pontuação do jogador
    }
    public static void ranking(){
        // verificar a pontuação de acordo com o valor armazenado na variavel em Perguntas.Categoria
    }

    public String toString(String nickName) {
        return nickName;
    }
}
