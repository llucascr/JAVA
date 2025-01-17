package StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Aula209_Reduce02 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas", 6.1);
        Aluno a2 = new Aluno("Iris", 8.1);
        Aluno a3 = new Aluno("Patricia", 9.1);
        Aluno a4 = new Aluno("Luiz", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovados = a -> a.nota > 7;
        Function<Aluno, Double> nota = a -> a.nota;
        BinaryOperator<Double> somatoria = (a, b) -> a + b;

        alunos.stream()
                .filter(aprovados) // Separou os aprovados > 7
                .map(nota) // Transformou as notas de Objeto para Double
                .reduce(somatoria) // Somou somente as notas maiores que 7
                .ifPresent(System.out::println);

    }
}
