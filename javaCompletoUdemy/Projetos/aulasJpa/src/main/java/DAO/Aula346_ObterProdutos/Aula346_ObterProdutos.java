package DAO.Aula346_ObterProdutos;

import entities.Aula343_EntidadeProduto.Produto;

import java.util.List;

public class Aula346_ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println("ID: "+ produto.getId() + " | Nome: " + produto.getNome() + " | Preco: " + produto.getPreco());
        }

        double precoTotal = produtos.stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();
        System.out.println("Total: " + precoTotal);

        dao.fechar();
    }
}
