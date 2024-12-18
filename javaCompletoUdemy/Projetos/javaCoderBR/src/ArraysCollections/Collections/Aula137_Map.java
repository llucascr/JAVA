package ArraysCollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class Aula137_Map {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // .put -> No caso do Map esse é o metodo de adicionar, para adicionar você precisa passar
        // uma chave e um valor .put(chave, valor);
        usuarios.put(1, "Lucas");
//        usuarios.put(1, "Iris"); // Ela também é usada para subistituir uma valor passando uma chave que ja existe
        usuarios.put(2, "Iris");
        usuarios.put(3, "Patricia");
        usuarios.put(4, "Luiz");

        // .size
        // .isEmpty

        // .ketSet -> Retorna em um conjunto todas as chaves adicionadas no Map
        System.out.println(usuarios.keySet());

        // .values -> Retorna em um conjunto todos os valores adicionados no Map
        System.out.println(usuarios.values());

        // .entrySet -> Retorna as chaves com seus respectivos valores
        System.out.println(usuarios.entrySet());

        // .containsKey -> Retorna TRUE ou FALSE se existe uma chave do valor informado
        System.out.println(usuarios.containsKey(2));

        // .containsValue -> Retorna TRUE ou FALSE se existe um valor igual ao informado
        System.out.println(usuarios.containsValue("Lucas"));

        // .get -> Passando a chave ele retorna o valor
        System.out.println(usuarios.get(2));

        // .keySet -> Podemos usar isso dentro de um foreach para percorrer/imprimir somente as chaves
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        // .values -> Podemos usar isso dentro do foreach para percorrer/imprimir somente os valores
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        // Map.Entry ... .entrySet ->  Podemos usar isso dentro do foreach para percorrer/imprimir as chaves e os valores juntos
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

        // .remove -> Remove o valor usando a chame como parametro
        System.out.println(usuarios.remove(1));
//        System.out.println(usuarios.remove(1, "Lucas")); // Esse remove passamos a chave e o valor que precisam estar correspondentes


    }
}
