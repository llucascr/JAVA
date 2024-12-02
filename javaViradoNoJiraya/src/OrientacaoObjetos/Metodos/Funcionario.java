package OrientacaoObjetos.Metodos;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        System.out.print("Salarios: ");
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        }else {
            System.out.println("Salarios Não informados!!");
        }

//        for (int i = 0; i < 3; i++){
//            System.out.print(this.salarios[i] + " ");
//        }
        System.out.println("\n------------------------");
    }
}
