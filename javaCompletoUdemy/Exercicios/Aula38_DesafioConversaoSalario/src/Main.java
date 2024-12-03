import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeiro Salario: ");
        String valor1 = entrada.nextLine();

        System.out.println("Segundo Salario: ");
        String valor2 = entrada.nextLine();

        System.out.println("Terceiro Salario: ");
        String valor3 = entrada.nextLine();

        // Jeito 1
//        double salario1 = Double.parseDouble(valor1
//                .replace(",", ".")
//                .replace(".", ""));
//        double salario2 = Double.parseDouble(valor2
//                .replace(",", ".")
//                .replace(".", ""));
//        double salario3 = Double.parseDouble(valor3
//                .replace(",", ".")
//                .replace(".", ""));

        // Jeito 2
        double salario1 = Double.parseDouble(valor1
                .replace(",", "."));
        double salario2 = Double.parseDouble(valor2
                .replace(",", "."));
        double salario3 = Double.parseDouble(valor3
                .replace(",", "."));

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.printf("Soma: %.2f \n", soma);
        System.out.printf("Media: %.2f", media);
    }
}