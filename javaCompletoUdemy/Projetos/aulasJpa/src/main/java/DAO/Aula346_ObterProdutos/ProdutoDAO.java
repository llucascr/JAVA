package DAO.Aula346_ObterProdutos;

import DAO.DAO;
import entities.Aula343_EntidadeProduto.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }
}
