package StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Aula208_Reduce {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        // 01
        Integer total = nums.stream().reduce(soma).get(); // Soma todos os numeros da List
        System.out.println(total);

        // 02
        Integer totalComInicial = nums.stream().reduce(100, soma);
        System.out.println(totalComInicial);

        // 03
        nums.stream()
                .filter(n -> n > 10)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
