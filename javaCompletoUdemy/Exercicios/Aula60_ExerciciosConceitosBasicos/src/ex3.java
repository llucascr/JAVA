import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // Peso(kg) / Math.pow(Altura(m), 2);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso(kg): ");
        double peso = entrada.nextDouble();

        System.out.print("\nAltura(m): ");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("IMC: %.2f", imc);

        entrada.close();

    }
}
