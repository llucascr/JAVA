package OrientacaoObjetos.Metodos;

public class AulaMetodos {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

//        // Metodo 1
//        calculadora.somaDoisNumeros();
//
//        // Metodo 2
//        calculadora.subtraiDoisNumeros();

        // --------------------------------------------
        // Metodo Parametro
//        calculadora.multDoisNumeros(20, 10);

        // --------------------------------------------
        // Metodo Retorno
//        int result = (int)calculadora.divideDoisNumeros(25, 5);
//        double result = calculadora.divideDoisNumeros(25, 2);
//        System.out.println(result);

        // Case 1 erro
//        double result2 = calculadora.divideDoisNumeros(25, 0);
//        System.out.println(result2); // return: Infinity

        // --------------------------------------------
        // Metodo que chama Metodo
//        calculadora.multDoisNumeros(4,3);

        // --------------------------------------------
        // return; no void
//        calculadora.divideDoisNumeros2(20, 0);

        // --------------------------------------------
        // São passadas copias dessas variaveis para o metodo por isso elas não mudam
//        int num1 = 1;
//        int num2 = 2;
//        calculadora.alteraDoiNumeros(num1, num2);
//        System.out.println("Dentro do Main:");
//        System.out.println("Num1: " + num1);
//        System.out.println("Num2: " + num2);

        // --------------------------------------------
//        Aluno aluno01 = new Aluno();
//        Aluno aluno02 = new Aluno();
//        ImprimeAluno impressora = new ImprimeAluno();
//
//        aluno01.nome = "Lucas";
//        aluno01.idade = 19;
//        aluno01.sexo = 'M';
//
//        aluno02.nome = "Iris";
//        aluno02.idade = 19;
//        aluno02.sexo = 'F';
//
//        impressora.imprime(aluno01);
//
//        impressora.imprime(aluno02);

        // --------------------------------------------
//        // This
//        Aluno aluno01 = new Aluno();
//        Aluno aluno02 = new Aluno();
//        ImprimeAluno impressora = new ImprimeAluno();
//
//        aluno01.nome = "Lucas";
//        aluno01.idade = 19;
//        aluno01.sexo = 'M';
//
//        aluno02.nome = "Iris";
//        aluno02.idade = 19;
//        aluno02.sexo = 'F';
//
//        aluno01.imprime();
//        aluno02.imprime();

        // --------------------------------------------
        int[] numeros = {1, 2, 3, 4, 5};

        calculadora.somaArray(numeros);

        // Posso passar um array digitado dentro dos parametos
        calculadora.somaVarargs(1,2,3,4,5);


    }
}
