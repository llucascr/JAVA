package Lambdas.Aula175_PrimeiraFuncaoLambda;

@FunctionalInterface // Interface Functional: Quer dizer que a interface só pode ter um metodo funcional
public interface Calculo {

    double executar(double a, double b);
}
