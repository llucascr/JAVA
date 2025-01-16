package Lambdas.Aula186_Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Aula186_Supplier {
    public static void main(String[] args) {

        Supplier<List<String>> umLista =
                () -> Arrays.asList("Lucas", "Iris", "Patricia", "Luiz");

        System.out.println(umLista.get());

    }
}
