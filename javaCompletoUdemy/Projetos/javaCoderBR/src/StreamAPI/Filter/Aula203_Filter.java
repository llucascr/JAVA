package StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Aula203_Filter {
    public static void main(String[] args) {

        Aluno a1 =  new Aluno("Lucas", 7.8);
        Aluno a2 =  new Aluno("Iris", 9.8);
        Aluno a3 =  new Aluno("Patricia", 6.8);
        Aluno a4 =  new Aluno("Luiz", 7.1);
        Aluno a5 =  new Aluno("Joao", 8.8);
        Aluno a6 =  new Aluno("Gustavo", 5.8);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> mensagemAprovado = a -> a.nome + ": APROVADO";

        alunos.stream()
//                .filter(a -> a.nota >= 7)
                .filter(aprovado)
                .map(mensagemAprovado)
                .forEach(System.out::println);

    }
}
