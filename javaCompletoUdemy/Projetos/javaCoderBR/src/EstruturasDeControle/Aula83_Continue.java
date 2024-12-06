package EstruturasDeControle;

public class Aula83_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1){
                continue; // interrompe apenas os impares e passa para proxima repeticao imprimindo os pares
            }
            System.out.println(i);
        }
    }
}
