package ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Aula127_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos: ");
        int qtdAlunos = scanner.nextInt();

        System.out.print("Quantos notas por aluno: ");
        int qtdANotas = scanner.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdANotas];

        double soma = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Nota %d do Aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = scanner.nextDouble();
                soma += notasDaTurma[i][j];
            }
        }

        double media = soma / (qtdAlunos * qtdANotas);

        System.out.printf("Media: %.1f \n", media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        scanner.close();
    }
}
