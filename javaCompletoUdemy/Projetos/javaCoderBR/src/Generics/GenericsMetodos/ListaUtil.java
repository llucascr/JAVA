package Generics.GenericsMetodos;

import java.util.List;

public class ListaUtil {

    public static Object getUltimoNaoGenerico(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    public static <T> T getUltimoGenerico(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

    public static <A, B, C> C teste(A paramA, B paramB) {
        C teste = null;
        return teste;
    }

}
