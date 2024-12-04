import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // fahrenheit = (Celsius * 1.8) + 32;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Celsius: ");
        double celsius = entrada.nextDouble();
        final double multCelsius = 1.8;
        final int somaCelsius = 32;

        double fahrenheit = (celsius * multCelsius) + somaCelsius;

        System.out.print("Celsius: " + celsius);
        System.out.print(" | Fahrenheit: " + fahrenheit);

        entrada.close();

    }
}
