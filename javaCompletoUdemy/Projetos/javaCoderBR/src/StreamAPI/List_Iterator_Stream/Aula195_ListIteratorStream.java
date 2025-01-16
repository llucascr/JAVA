package StreamAPI.List_Iterator_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Aula195_ListIteratorStream {
    public static void main(String[] args) {

        //List
        List<String> aprovados = Arrays.asList("Lucas", "Iris", "Patricia", "Luiz");

//        for (int i = 0; i < aprovados.size(); i++) {
//            System.out.println(aprovados.get(i));
//        }

        System.out.println("Usando o foreach...");
        for (String nomes : aprovados) {
            System.out.println(nomes);
        }

        System.out.println("\n\nUsando Iterator...");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n\nUsando Stream...");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);

    }
}
