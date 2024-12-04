package fundamentos;

public class Aula43_OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println("\n------------------------");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println((float) a / b);

        System.out.println("\n" + 8 % 3);

        System.out.println("\n------------------------");
        System.out.println(x + y - a * b);
    }
}
