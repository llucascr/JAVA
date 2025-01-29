package TratamentoDeErros.BasicoSobreExecao;

public class Aula220_BasicoExecao {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
            // ERRO: Exception in thread "main" java.lang.NullPointerException: Cannot read field "nome" because "aluno" is null
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }

        try {
            System.out.println(7 / 0);
            // ERRO: Exception in thread "main" java.lang.ArithmeticException: / by zero
        } catch (ArithmeticException arithmeticException) {
            System.out.println("ERROR: " + arithmeticException.getMessage());
        }

        System.out.println("\nFIM!");

    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
