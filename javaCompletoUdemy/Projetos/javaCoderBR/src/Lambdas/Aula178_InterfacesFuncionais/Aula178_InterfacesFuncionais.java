package Lambdas.Aula178_InterfacesFuncionais;

import java.util.function.BinaryOperator;

public class Aula178_InterfacesFuncionais {
    public static void main(String[] args) {

        // NÃO: int -> Double D
        // double -> Double

        BinaryOperator<Double> calc = (x,y) -> {
            return x + y;
        };
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

    }
}
