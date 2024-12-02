package TiposPrimitivos;

public class AulaTiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 10000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true; // false
        char caractere = 'I';

        System.out.println("int: " + idade);
        System.out.println("long: " + numeroGrande);
        System.out.println("double: " + salarioDouble);
        System.out.println("float: " + salarioFloat);
        System.out.println("byte: " + idadeByte);
        System.out.println("short: " + idadeShort);
        System.out.println("boolean: " + verdadeiro);
        System.out.println("char: " + caractere);


        // Casting
        float floatNum = 2500.0F; // F

        long longNum = 1L; // L

        System.out.println("Casting double para float: " + floatNum);
        System.out.println("Casting int para long: " + longNum);

        // String
        String nome = "Lucas";
        System.out.println("String: " + nome);


    }
}