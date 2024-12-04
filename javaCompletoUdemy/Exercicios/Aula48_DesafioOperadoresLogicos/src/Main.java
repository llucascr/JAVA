public class Main {
    public static void main(String[] args) {
        // Trabalho na Terça (V ou F)
        // Trabalho da Quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        System.out.println("Comprou TV 50 = " + comprouTV50);

        boolean comprouTv32 = trabalho1 ^ trabalho2;
        System.out.println("Comprou TV 32 = " + comprouTv32);

        boolean comprouSorvete = trabalho1 || trabalho2;
        System.out.println("Comprou Sorvete = " + comprouSorvete);

        System.out.println("Mais saudavel? = " + !comprouSorvete);
    }
}