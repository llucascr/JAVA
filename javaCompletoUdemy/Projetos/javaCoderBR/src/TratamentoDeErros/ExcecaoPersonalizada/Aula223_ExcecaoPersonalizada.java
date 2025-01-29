package TratamentoDeErros.ExcecaoPersonalizada;

import TratamentoDeErros.BasicoSobreExecao.Aluno;

public class Aula223_ExcecaoPersonalizada {
    public static void main(String[] args) {
//        Aluno aluno = new Aluno("", -7);

        // Exception in thread "main" TratamentoDeErros.ExcecaoPersonalizada.StringVaziaException: O atrtributo 'nome' esta vazio
//        Validar.aluno(aluno);
        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException  | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM!!!");
    }
}
