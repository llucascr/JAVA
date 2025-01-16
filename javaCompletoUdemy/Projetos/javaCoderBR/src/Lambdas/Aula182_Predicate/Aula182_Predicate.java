package Lambdas.Aula182_Predicate;

import java.util.function.Predicate;

public class Aula182_Predicate {
    public static void main(String[] args) {

        // Funcao lambda chamada Predicate que recebe um Produto e retorna true ou false se ele é caro
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 2500;

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
