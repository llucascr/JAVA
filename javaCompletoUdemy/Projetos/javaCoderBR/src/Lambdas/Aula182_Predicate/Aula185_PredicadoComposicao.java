package Lambdas.Aula182_Predicate;

import java.util.function.Predicate;

public class Aula185_PredicadoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println("Par e Tres digitos: " + isPar.and(isTresDigitos).test(124));
        System.out.println("Par e Tres digitos: " + isPar.and(isTresDigitos).negate().test(124));



    }
}
