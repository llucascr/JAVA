package OrientacaoObjetos.ModificadoresAcesso;

public class AulaAcoplamento {
    public static void main(String[] args) {
        // Acoplhamento: É o quão uma classe esta conectada com outra
        // Tem a ver o quanto uma classe sabe da outra pra isso temos os modificadores de acesso
//        Pessoa pessoa = new Pessoa();

        // Não é possivel acessar esses atributos pois eles estao privados
//        pessoa.nome = "Lucas";
//        pessoa.idade = -1;

//        pessoa.setNome("Lucas");
//        pessoa.setIdade(19);

//        pessoa.imprime();
//        System.out.println("Nome: " + pessoa.getNome());
//        System.out.println("Idade: " + pessoa.getIdade());

        // ---------------------------------------------------------------
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Lucas");
        funcionario.setIdade(19);
//        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();






    }
}
