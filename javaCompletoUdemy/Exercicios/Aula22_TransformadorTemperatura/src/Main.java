public class Main {
    public static void main(String[] args) {
        // (F - 32) * 5/9 = C
        final int subfahrenheit = 32;
        final double multDahrenheit = (double) 5 /9; // 5.0 / 9.0
        double fahrenheit = 86; // Mudar de acordo com a temperaruta

        double celsius = (fahrenheit - subfahrenheit) * multDahrenheit;
        System.out.print("Fahrenheit: " + fahrenheit);
        System.out.print(" | Celsius: " + celsius);

    }
}