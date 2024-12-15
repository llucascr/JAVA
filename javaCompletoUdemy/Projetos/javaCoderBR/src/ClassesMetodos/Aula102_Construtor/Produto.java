package ClassesMetodos.Aula102_Construtor;

public class Produto {
    public String nome;
    public double preco;
    public double desconto;

    // Construtor padrao sem parametros
    Produto() {

    }

    // Construtor com parametros obrigatorios
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("Nome\tPreço\tDesconto");
        System.out.println(this.nome + "\t" + this.preco);
    }
}
