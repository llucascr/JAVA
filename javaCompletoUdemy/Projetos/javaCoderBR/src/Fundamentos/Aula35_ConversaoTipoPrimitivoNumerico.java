package Fundamentos;

public class Aula35_ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // 1.0  implicita
        System.out.println(a);

        // (cast)
        float b = (float) 1.12345; // explicita (cast)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c; // explicita (cast)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // explicita (cast)
        System.out.println(f);
    }
}
