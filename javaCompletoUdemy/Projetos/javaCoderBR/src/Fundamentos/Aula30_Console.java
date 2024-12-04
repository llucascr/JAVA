package Fundamentos;

import java.util.Scanner;

public class Aula30_Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);

        System.out.printf("Salario: %.1f %n", 1234.5678);

        // -------------------------------------------------------
        // Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite o sua idade: ");
        int idade = entrada.nextInt();

        // nextInt(); -> int
        // nextLine(); -> String
        // nextBoolean(); -> boolean
        // nextDouble(); -> double


        System.out.printf("\n\nNome: %s %s \nIdade: %d", nome, sobrenome, idade);

        // Para o scanner parar de reclamar erro, precisamos fechar ele (entrada.close() para liberar memória)
        entrada.close();

    }
}
