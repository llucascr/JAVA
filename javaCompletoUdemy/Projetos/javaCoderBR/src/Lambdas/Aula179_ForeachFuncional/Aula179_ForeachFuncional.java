package Lambdas.Aula179_ForeachFuncional;

import java.util.Arrays;
import java.util.List;

public class Aula179_ForeachFuncional {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lucas", "Iris", "Patricia", "Luiz");

        // Forma Tradicional
        System.out.print("Forma Tradicional: ");
        for (String nomes : aprovados) {
            System.out.print(nomes + ", ");
        }

        // Lambda
        System.out.println("\n\nLambda #01...");

        aprovados.forEach((nome) -> {
            System.out.print(nome + ", ");
        });

        // Method Reference
        System.out.println("\n\nMethod Reference...");
        aprovados.forEach(System.out::println);

        // Aula 180 - Foreach Funcional #02 ----------------------------------------------------------------------------
        System.out.println("\n\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\n\nMethod Reference #02...");
        aprovados.forEach(Aula179_ForeachFuncional::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
