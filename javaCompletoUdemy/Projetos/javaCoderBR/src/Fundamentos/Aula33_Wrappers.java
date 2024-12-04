package Fundamentos;

public class Aula33_Wrappers {
    public static void main(String[] args) {

        //byte
        Byte b = 100;

        // short
        Short s = 1000;

        // int
        Integer i = 10000;
        Integer o = Integer.parseInt("1000"); // Transforma a String em um Integer


        // long
        Long l = 1000000L;

        System.out.println(b.byteValue()); // valor que esta dentro do byte

        System.out.println(s.toString());

        // booelan
        Boolean bo = Boolean.parseBoolean("true");

        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        // char
        Character c = '#';
        System.out.println(c.charValue());

        // float
        Float f = 123.10F;
        System.out.println(f);

        // double
        Double d = 1234.5678;
        System.out.println(d);

    }
}
