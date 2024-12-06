package EstruturasDeControle;

public class Aula82_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){

            if (i == 5){
                break; // Quebra o fluxo do for saindo dele e executando a proxima linha
            }

            System.out.println(i);
        }

        System.out.println("FIM!");

    }
}
