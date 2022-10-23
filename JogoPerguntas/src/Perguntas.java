public class Perguntas {
    public static void categoria(){
        System.out.println("Escolha a categoria antes de iniciar:");
        System.out.println("[1] Geek");
        System.out.println("[2] Músicas");
        System.out.println("[3] Conhecimentos gerais");
        System.out.print("O que deseja fazer?");
        int input = Base.leiaInput(" > ", 3);
        switch (input){
            case 1:
                geek();

            case 2:
                musica();
            case 3:
                curiosidade();
        }
        Base.Continue();

    }
    public static void geek(){
        // Deve marcar os pontos e enviar para classe Pontuação
    }
    public static void musica(){
        // Deve marcar os pontos e enviar para classe Pontuação
    }
    public static void curiosidade(){
        // Deve marcar os pontos e enviar para classe Pontuação
    }
}
