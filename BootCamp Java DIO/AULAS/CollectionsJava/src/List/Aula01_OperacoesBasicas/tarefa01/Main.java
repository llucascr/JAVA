package List.Aula01_OperacoesBasicas.tarefa01;

public class Main {

    public static void main(String[] args) {

        // 2. Carrinho de Compras

        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Banana", 9.90, 4);
        compras.adicionarItem("Leite", 12.70, 2);
        compras.adicionarItem("Coca-Cola", 11.00, 3);
        compras.adicionarItem("Picanha", 120.00, 1);

        System.out.println("Total: " + compras.calcularValorTotal());

        compras.removerItem("Picanha");

        System.out.println("Total: " + compras.calcularValorTotal());

        compras.exibirItems();
    }
}
