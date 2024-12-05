package EstruturasDeControle;

import java.util.Scanner;

public class Aula72_WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        // Enquanto eu não digitar o valor sair ele não vai terminar o While
        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("Digite o valor: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
