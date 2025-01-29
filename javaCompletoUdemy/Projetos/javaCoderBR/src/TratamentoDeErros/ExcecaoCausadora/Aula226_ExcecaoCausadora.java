package TratamentoDeErros.ExcecaoCausadora;

import TratamentoDeErros.BasicoSobreExecao.Aluno;

public class Aula226_ExcecaoCausadora {
    public static void main(String[] args) {

        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno) {
        if(aluno == null) {
            throw new NullPointerException("Aluno esta NULO!!!");
        }

        System.out.println(aluno.nome);
    }
}
