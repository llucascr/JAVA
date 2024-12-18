package ArraysCollections.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Aula136_Stack_Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Harry Potter");

        // .push -> Faz a mesma função de adicionar mas se a pilha estiver cheia ou outra restrição ele retorna uma exeção(erro)
        livros.push("Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("Hobbit");

        System.out.println("Pilha:");
        for (String livro : livros) {
            System.out.println(livro);
        }
        System.out.println("\n");

        // .peek -> Mesma função que da fila (retorna o primeiro elemento) mas na pilha o primeiro elemento ultimo adicionado
        System.out.println(livros.peek());
        // .element

        // .pool -> Retorna o ulitmo elemento adicionado e retira ele da pilha
        System.out.println("Removido: " + livros.poll());
        // .remove

        // .pop() -> Retorna o ultimo elemento adicionado e retira da pilha, mas se ela estiver vazia retorna uma exeção(erro)sout
        System.out.println(livros.pop());

//        livros.size();
//        livros.clear();
//        livros.contains()
//        livros.isEmpty();


    }
}
