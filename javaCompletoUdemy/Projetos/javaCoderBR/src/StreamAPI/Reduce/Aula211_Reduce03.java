package StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Aula211_Reduce03 {
    public static void main(String[] args) {

        // PARTE 1
//        Media m1 = new Media().adicionar(8.3).adicionar(6.7);
//        Media m2 = new Media().adicionar(7.6).adicionar(6.6);
//
//        System.out.println(m1.getMedia());
//        System.out.println(m2.getMedia());
//
//        System.out.println(Media.combinar(m1, m2).getMedia());

        // PARTE 2
        Aluno a1 = new Aluno("Lucas", 6.1);
        Aluno a2 = new Aluno("Iris", 8.1);
        Aluno a3 = new Aluno("Patricia", 9.1);
        Aluno a4 = new Aluno("Luiz", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> Dublenota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovados)
                .map(Dublenota)
                .reduce(new Media(), calcularMedia, combinarMedia);
        //      .reduce(valorInicial, funcaoAcumuladora, FuncaoCombinarAsMedias)

        System.out.println(media.getMedia());
    }
}
