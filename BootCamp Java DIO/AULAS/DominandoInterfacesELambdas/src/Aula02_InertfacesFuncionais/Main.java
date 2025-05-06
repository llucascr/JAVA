package Aula02_InertfacesFuncionais;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // new ArrayList<> ---------------------------------------------------------------------------------------------

//        List<Aula02_InertfacesFuncionais.User> usersTest = new ArrayList<>(new Aula02_InertfacesFuncionais.User("Lucas", 19));
// ERRO por que estou tentando instanciar uma Classe Aula02_InertfacesFuncionais.User no construtor do ArrayList<>()
        // CERTO
//        usersTest.add(new Aula02_InertfacesFuncionais.User("Lucas", 19));

        // Consumer ----------------------------------------------------------------------------------------------------

        /*
        Em Java, um Consumer<T> é uma interface funcional da biblioteca java.util.function que representa uma operação
        que recebe um argumento do tipo T e não retorna nada (ou seja, retorna void).

        ✅ O que isso significa?
        Ela é usada quando você quer executar alguma ação com um objeto, sem se preocupar em obter um resultado de volta. Muito
        usada com métodos como forEach, que apenas iteram sobre elementos e executam algo para cada um.

        ✅ Consumer<T> é uma interface funcional do Java usada para representar uma operação que
            recebe um valor e não retorna nada.

        🧠 Em termos simples:
        -> Ele consome um valor (por isso o nome Consumer).
        -> Faz alguma ação com esse valor (ex: imprimir, salvar, enviar etc.).
        -> Não retorna nada (void).

         = Consumer<T> é usado quando você quer executar uma ação com um objeto, sem esperar um retorno.
         */

        List<User> users = List.of( // List.of() -> retorna uma coleção imutavel de itens
                new User("Iris", 19),
                new User("Lucas", 19),
                new User("Patricia", 49),
                new User("Luiz", 51)
        );

        Consumer<User> consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        };
//        users.forEach(consumer);

        // Lambda ------------------------------------------------------------------------------------------------------
//        users.forEach(user -> System.out.println(user));

        // ou usando lambda reference
        users.forEach(System.out::println); // Forma mais usada

    }

}