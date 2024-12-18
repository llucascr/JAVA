package ArraysCollections.Arrays;

import java.util.Arrays;

public class Aula123_Array {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        // 1
        System.out.println(Arrays.toString(notasAlunoA));

        // 2
        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.print(notasAlunoA[i] + " ");
        }

        // -----------------------------------------------------------
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        System.out.printf("\nMedia A: %.1f", totalAlunoA / notasAlunoA.length);

        // -----------------------------------------------------------
        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.printf("\nMedia B: %.1f", totalAlunoB / notasAlunoB.length);

    }
}
