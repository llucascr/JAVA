package OrientacaoObjetos.Metodos;

public class ExercicioMetodos {
    public static void main(String[] args) {
        // Crie uma classe Funcionario com os seguintes atributos
        // nome, idade, salario (trê salario devem ser guardados)

        // Crie dois Metodos
        //   1. Para imprimir os dados  2. Para tirar a média dos salarios e imprimir o resultado
        Funcionario funcionario = new Funcionario();
        MetodoEx metodoEx = new MetodoEx();

        funcionario.nome = "Lucas";
        funcionario.idade = 19;
        funcionario.salarios = new double[]{1200, 987.32, 2000};
//        funcionario.salario[0] = 1200;
//        funcionario.salario[1] = 987.32;
//        funcionario.salario[2] = 2000;

        // 1.
        funcionario.imprimir();

        // 2.
        metodoEx.mediaSalarios(funcionario.salarios);



    }
}
