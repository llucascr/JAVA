package StreamAPI.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Aula197_CriandoStram {
    public static void main(String[] args) {

        // Referencia de metodo
        Consumer<String> print = System.out::print;

        // Stream
        // #01
        Stream<String> langs = Stream.of("Java ", "Kotlin ", "C++\n");
        langs.forEach(print);

        // #02
        String[] maisLangs = {"Python ", "Angular ", "Cobol ", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        // #03
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        // #04
        List<String> outrasLangs = Arrays.asList("\nC# ", "PHP ", "JS\n");
        outrasLangs.stream().forEach(print);

        // -------------
//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0, n -> n + 1).forEach(System.out::println);
    }
}
