package Lambdas.Aula175_PrimeiraFuncaoLambda;

public class Somar implements Calculo{

    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
