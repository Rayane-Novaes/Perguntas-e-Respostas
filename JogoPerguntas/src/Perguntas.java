
public class Perguntas {

    Jogadores novoJogadores = new Jogadores();
    public static void categoria(Jogadores novoJogadores){
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

        System.out.println("------------------PERGUNTA 01--------------------------");
        System.out.println(" Quantos anos Anakin tinha quando se tornou Darth Vader em Star" +
                            "Wars III: A vingança dos Sith?\n");

        System.out.println("[1] 22 anos");
        System.out.println("[2] 36 anos");
        System.out.println("[3] 42 anos");

    }



    public static void musica(){

    }

    public static void curiosidade(){
        // Deve marcar os pontos e enviar para classe Pontuação
    }
}
