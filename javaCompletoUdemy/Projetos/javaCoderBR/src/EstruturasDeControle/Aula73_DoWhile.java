package EstruturasDeControle;

import java.util.Scanner;

public class Aula73_DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "";

        // Executa pelo menos uma vez antes de verificar a expresao
        do {
            System.out.println("Vocẽ precisa falar as palavras mágicas...");
            System.out.println("Quer sair ?");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("porfavor"));

        entrada.close();
    }
}
