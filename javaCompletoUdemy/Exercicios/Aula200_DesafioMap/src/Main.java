import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Tranforma em Binario
        Function<Integer, String> binario = n -> Integer.toBinaryString(n);

        // Inverte a String do binario 110 -> 011
        UnaryOperator<String> inverter = (n) -> {
            StringBuffer sb = new StringBuffer(n);
            StringBuffer binarioInvertido = sb.reverse();
            return String.valueOf(binarioInvertido);
        };

        // Traforma binario em numero real
        Function<String, Integer> real = (n) -> Integer.parseInt(n, 2);

        nums.stream()
                .map(binario)
                .map(inverter)
                .map(real)
                .forEach(System.out::println);

    }
}