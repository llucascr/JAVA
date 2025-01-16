package StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Aula199_Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        // Map que deixa todas as letras em maiusculas
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\n-------------------------------");

//        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\nUsando Composição");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.grito)
                .forEach(print);

//        UnaryOperator<Integer> maisDois = n -> n + 2;
//        List<Integer> nums = Arrays.asList(2, 4, 7, 8, 10, 12);
//        nums.stream().map(maisDois).forEach(System.out::println);




    }
}
