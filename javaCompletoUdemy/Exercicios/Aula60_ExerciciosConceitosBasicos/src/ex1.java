import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // (F - 32) * 5/9 = C
        Scanner entrada = new Scanner(System.in);

        System.out.print("fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        final int subfahrenheit = 32;
        final double multDahrenheit = (double) 5 /9;

        double celsius = (fahrenheit - subfahrenheit) * multDahrenheit;

        System.out.print("Fahrenheit: " + fahrenheit);
        System.out.print(" | Celsius: " + celsius);

        entrada.close();

    }
}
