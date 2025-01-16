package Lambdas.Aula175_PrimeiraFuncaoLambda;

public class Aula175_PrimeiraFuncaoLambda {
    public static void main(String[] args) {

//        Calculo soma = new Somar();
//        Calculo mult = new Multiplicar();
//
//        System.out.println(soma.executar(2, 2));
//        System.out.println(mult.executar(3, 2));

        // --------------------------------------------
//        Calculo calculo = new Somar();
//        System.out.println(calculo.executar(2,3));
//
//        calculo = new Multiplicar();
//        System.out.println(calculo.executar(2,3));

        // --------------------------------------------
        // Funcoes Lambdas
        Calculo soma = (x, y) -> {
          return x + y;
        };
        System.out.println(soma.executar(2,3));

        Calculo mult = (x, y) -> x * y;
        System.out.println(mult.executar(2,3));

    }
}
