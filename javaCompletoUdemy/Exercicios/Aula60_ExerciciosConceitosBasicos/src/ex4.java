import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();

        System.out.println("Valor ao quadrado: " + Math.pow(valor, 2));
        System.out.println("Valor ao cubo: " + Math.pow(valor, 3));

        entrada.close();
    }
}
