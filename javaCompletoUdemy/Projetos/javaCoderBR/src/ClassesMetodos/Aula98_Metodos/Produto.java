package ClassesMetodos.Aula98_Metodos;

public class Produto {
    public String nome;
    public double preco;
    public double desconto;

    // tipo nomeMetodo (...) {
    //  return
    // }

    public double precoComDesconto() {
        return this.preco * (1 - this.desconto);
    }

    public double precoComDesconto(double descontoGerente) {
        return this.preco * (1 - (this.desconto + descontoGerente));
    }

}
