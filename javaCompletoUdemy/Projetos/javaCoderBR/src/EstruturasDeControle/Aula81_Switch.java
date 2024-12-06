package EstruturasDeControle;

import java.util.Scanner;

public class Aula81_Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 0:
                conceito = "F";
                break;
            case 1:
            case 2:
                conceito = "E";
                break;
            case 3:
            case 4:
                conceito = "D";
                break;
            case 5:
            case 6:
                conceito = "C";
                break;
            case 7:
            case 8:
                conceito = "B";
                break;
            case 9:
            case 10:
                conceito = "A";
                break;
            default:
                conceito = "NAO INFORMADO";
        }

        System.out.println("Conceito é " + conceito);

        entrada.close();
    }
}
