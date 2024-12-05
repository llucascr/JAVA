package EstruturasDeControle;

import java.util.Scanner;

public class Aula67_IF_ELSEIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota invalida!");
        }else if (nota >= 6.0) {
            System.out.println("APROVADO!");
        } else if (nota > 4.5 && nota < 6.0) {
            System.out.println("RECUPERACAO!");
        }else {
            System.out.println("REPROVADO!");
        }

        entrada.close();
    }
}
