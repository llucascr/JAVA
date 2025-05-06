package List.Aula02_Pesquisa.tarefa02;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> list;

    public SomaNumeros() {
        this.list = new ArrayList<>();
    }

    /**
     * Adiciona um número à lista de números.
     * @param numero
     */
    public void adicionarNumero(int numero) {
        list.add(numero);
    }

    /**
     * Calcula a soma de todos os números na lista e retorna o resultado.
     * @return
     */
    public int calcularSoma() {
        int total = 0;
        if (!list.isEmpty()) {
            for (Integer i : list) {
                total += i;
            }
        } else {
            System.out.println("Lista vazia!");
        }
        return total;
    }

    /**
     * Encontra o maior número na lista e retorna o valor.
     * @return
     */
    public int encontrarMaiorNumero() {
        int maior = 0;
        if (!list.isEmpty()) {
            for (Integer i : list) {
                if (i > maior) {
                    maior = i;
                }
            }
        }
        return maior;
    }

    /**
     *  Encontra o menor número na lista e retorna o valor.
     * @return
     */
    public int encontrarMenorNumero() {
        int menor = 0;
        int count = 0;
        if (!list.isEmpty()) {
            for (Integer i : list) {
                if (count == 0) {
                    menor = i;
                    count++;
                } else if (menor > i) {
                    menor = i;
                }
            }
        }
        return menor;
    }

    /**
     * Retorna uma lista contendo todos os números presentes na lista.
     * @return
     */
    public List<Integer> exibirNumeros() {
        return list;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "list=" + list +
                '}';
    }
}
