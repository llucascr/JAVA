package List.Aula03_OrdenacaoList.tarefa03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{

    List<Integer> integerList = new ArrayList<>();

    /**
     * Adiciona um número à lista.
     * @param numero
     */
    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    /**
     * rdena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
     * @return
     */
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    /**
     * Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
     * @return
     */
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
//        Collections.sort(numerosAscendente, Collections.reverseOrder());
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }
}
