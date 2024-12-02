package Arrays;

public class AulaArrays {
    public static void main(String[] args) {
//      type References = podem ser inicializados como null
//        int[] idades = new int[3];
//        idades[0] = 21;
//        idades[1] = 15;
//        idades[2] = 11;
//
//        System.out.println(idades[0]);

        // -----------------------------------------------------------
        // Type References - Inicialização
        // byte, short, int, long, float, doble = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null

//        String[] idades = new String[3];
//        System.out.println(idades[0]); // null
//        System.out.println(idades[1]); // null
//        System.out.println(idades[2]); // null

        // -----------------------------------------------------------
        // Os tamanhos dos Arrays não podem aumentar dinamicamente, precisamos compilar o programa novamente
//        String[] nomes = new String[4];
//        nomes[0] = "Lucas";
//        nomes[1] = "Iris";
//        nomes[2] = "Patricia";
          // nomes[3] = "Luiz"; // null
//
//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[i]);
//        }

        // -----------------------------------------------------------
        // Exemplo anterior
        int[] numeros = new int[3];

        // Novo Exemplo
        int[] numeros2 = {1, 2, 3, 4, 5};

        // Exemplo Mesma Bosta
        int[] numero3 = new int[]{5, 4, 3, 2, 1};

        // Foreach
        for(int i : numeros2){
            System.out.println(i);
        }

    }
}
