package StreamAPI.Match;

import StreamAPI.Reduce.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Aula212_Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas", 6.1);
        Aluno a2 = new Aluno("Iris", 8.1);
        Aluno a3 = new Aluno("Patricia", 9.1);
        Aluno a4 = new Aluno("Luiz", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovados.negate();

        System.out.println(alunos.stream().allMatch(aprovados));
        System.out.println(alunos.stream().anyMatch(aprovados));
        System.out.println(alunos.stream().noneMatch(reprovado));

    }
}
