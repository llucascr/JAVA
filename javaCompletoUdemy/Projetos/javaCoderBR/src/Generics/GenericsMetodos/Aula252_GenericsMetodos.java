package Generics.GenericsMetodos;

import java.util.Arrays;
import java.util.List;

public class Aula252_GenericsMetodos {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Js", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        // Pega o ultimo indice
        String ultimaLinguagem = (String) ListaUtil.getUltimoNaoGenerico(langs);
        System.out.println(ultimaLinguagem);

        Integer ulitmoNumero = ListaUtil.getUltimoGenerico(nums);
        System.out.println(ulitmoNumero);

    }
}
