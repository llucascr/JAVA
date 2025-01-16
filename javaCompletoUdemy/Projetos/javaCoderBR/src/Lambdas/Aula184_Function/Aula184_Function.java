package Lambdas.Aula184_Function;

import java.util.function.Function;

public class Aula184_Function {
    public static void main(String[] args) {

        // Function<tipo_que_recebe, tipo_que_retorna>
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(34));

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
//        System.out.println(oResultadoE.apply(parOuImpar.apply(2)));
        System.out.println(parOuImpar.andThen(oResultadoE).apply(2));


    }
}
