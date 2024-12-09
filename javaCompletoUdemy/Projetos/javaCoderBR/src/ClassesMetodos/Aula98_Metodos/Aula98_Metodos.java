package ClassesMetodos.Aula98_Metodos;

public class Aula98_Metodos {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Fone";
        produto.preco = 840.99;
        produto.desconto = 0.25;

        double precoDesconto = produto.precoComDesconto();
        double precoDescontoGerente = produto.precoComDesconto(0.10);

        System.out.printf("%.2f \n", precoDesconto);
        System.out.printf("%.2f", precoDescontoGerente);

    }
}
