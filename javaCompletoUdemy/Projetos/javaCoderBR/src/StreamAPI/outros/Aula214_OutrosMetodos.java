package StreamAPI.outros;

import StreamAPI.Reduce.Aluno;

import java.util.Arrays;
import java.util.List;

public class Aula214_OutrosMetodos {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas", 6.1);
        Aluno a2 = new Aluno("Iris", 8.1);
        Aluno a3 = new Aluno("Patricia", 9.1);
        Aluno a4 = new Aluno("Luiz", 10);
        Aluno a5 = new Aluno("Lucas", 6.1);
        Aluno a6 = new Aluno("Iris", 8.1);
        Aluno a7 = new Aluno("Patricia", 9.1);
        Aluno a8 = new Aluno("Joao", 2.0);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
