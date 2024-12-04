package Fundamentos;

public class Aula21_AreaCincunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14159;

        double area = pi * raio * raio;

        System.out.println("Raio 1 = " + area);

        raio = 10;
        area = pi * raio * raio;

        System.out.println("Raio 2 = " + area);

    }
}