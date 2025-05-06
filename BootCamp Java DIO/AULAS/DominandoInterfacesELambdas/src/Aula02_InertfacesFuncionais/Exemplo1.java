package Aula02_InertfacesFuncionais;

import java.util.List;
import java.util.function.Function;

public class Exemplo1 {

    public static void main(String[] args) {
        List<User> users = List.of( // List.of() -> retorna uma coleção imutavel de itens
                new User("Iris", 19),
                new User("Lucas", 19),
                new User("Patricia", 49),
                new User("Luiz", 51)
        );

//        printStringValue(user -> user.name(),users);

        // ou usando lambda reference
        printStringValue(User::name, users);

        printStringValue(user -> String.valueOf(user.age()), users);

        printStringValue(Record::toString, users); // user -> user.toString()
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}
