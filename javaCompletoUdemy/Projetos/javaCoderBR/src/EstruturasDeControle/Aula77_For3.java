package EstruturasDeControle;

public class Aula77_For3 {
    public static void main(String[] args) {

        // Usar o i fora do For

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("Linha i = %d  Coluna j = %d\n", i, j );
            }
        }
        // i fora do escopo
        int i = 0;
        System.out.println(i);

    }
}
