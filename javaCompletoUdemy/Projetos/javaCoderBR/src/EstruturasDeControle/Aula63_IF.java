package EstruturasDeControle;

import java.util.Scanner;

public class Aula63_IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a Media: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 6.0){
            System.out.println("Aprovado");
        }

        if(media < 7 && media >= 4.5){
            System.out.println("Recuperação");
        }

        if(media < 4.5 && media >= 0){
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
