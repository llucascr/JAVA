package ArraysCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class Aula131_SetHeterogenio {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();


        // .add -> Para adicionar valores no nosso conjunto (set)
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('X'); // char -> Caractere

        System.out.println(conjunto);

        // .size -> Para saber o tamanho do nosso conjunto (set)
        System.out.println(conjunto.size());
        conjunto.add("Teste"); // ERRO não aceita repetição de valores
        conjunto.add('X');
        System.out.println(conjunto.size()); // 5

        // .remove -> Tenta remover o valor do conjunto, se existir remove e retorna TRUE se não existir retorna FALSE
        System.out.println(conjunto.remove("Teste"));
//        System.out.println(conjunto.remove("teste")); // ERRO pois teste com "t" minusculo não existe

        // .contains -> Verifica se o valor contem no conjunto (set), se sim retorna TRUE se nao retorna FALSE
        System.out.println(conjunto.contains('X'));

        Set nums = new HashSet(); // Desse jeito usando o Set também é valido

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        // .addAll -> pega todos os valores do consjunto(nums) passado por valor e adiciona no conjunto(set)
        conjunto.addAll(nums);
        System.out.println(conjunto);

        // .retainAll -> Faz a interceção dos valores que tem em comum entre conjunto(set) e consjunto(nums)
        conjunto.retainAll(nums); // [1]
        System.out.println(conjunto);

        // .clear -> Limpa o conjunto
        conjunto.clear();
        System.out.println(conjunto);

    }
}
