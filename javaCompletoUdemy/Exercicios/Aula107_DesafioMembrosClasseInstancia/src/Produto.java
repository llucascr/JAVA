public class Produto {
    public String nome;
    public double preco;
    public static double desconto = 0.25;

    // Construtor padrao sem parametros
    Produto() {

    }

    // Construtor com parametros obrigatorios
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double desconto(){
        return this.preco - (this.preco * Produto.desconto);
    }

    public void imprimir(){
        System.out.println("Nome\tPreço\tDesconto");
        System.out.println(this.nome + "\t" + this.preco + "\t" + Produto.desconto);
    }
}
