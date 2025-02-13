package DAO.Aula345_NovoProduto;

import DAO.DAO;
import entities.Aula343_EntidadeProduto.Produto;

public class Aula345_NovoProduto {

    public static void main(String[] args) {

        DAO<Produto> dao = new DAO<Produto>(Produto.class);

        Produto produto = new Produto("Monitor 23", 789.98);

//        dao.abrirTransacao().inserir(produto).fecharTransacao().fechar();
        // forma encurtada
        dao.incluirCompleto(produto).fechar();

        System.out.println("ID do produto: " + produto.getId());
    }
}
