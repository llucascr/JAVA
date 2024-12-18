package ArraysCollections.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Aula135_Queue_FIla {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Lucas"); // -> Aqui se a fila estiver cheia ele gera uma exeção(erro)

        // .offer -> Ele adiciona igual .add, mas se a fila estiver cheia ele retorna um FALSE
        fila.offer("Iris");
        fila.offer("Patricia");
        fila.offer("Luiz");
        fila.offer("Ricardo");

        // .peek -> retorna o primeiro elemento da fila, e se ela estiver vazia retorna nulo
        System.out.println(fila.peek());

        // .element -> retorna o primeiro elemento da fila igula o .peek, mas a difereça é que se a fila estiver vazia ele retorna uma exeção(erro)
        System.out.println(fila.element());

        // isEmpty -> Retorna TRUE ou FALSE se a fila está vazia
        System.out.println(fila.isEmpty());

        // .poll -> Retorna o primeiro elemento da fila ja removendo ele, se a fila ficar vazia ele retorna null
        System.out.println("Removeu: " + fila.poll());

        // .revome -> Na fila ele remove igual o .poll, mas quando estiver vazia ele retorna uma exeção(erro);
        System.out.println(fila.remove());

        // .size -> tamanho da fila
        System.out.println(fila.size());

    }
}
