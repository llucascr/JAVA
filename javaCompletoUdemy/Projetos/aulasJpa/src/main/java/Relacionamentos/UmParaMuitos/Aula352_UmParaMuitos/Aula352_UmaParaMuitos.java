package Relacionamentos.UmParaMuitos.Aula352_UmParaMuitos;

import DAO.DAO;
import Relacionamentos.UmParaMuitos.Aula351_UmParaMuitos.ItemPedido;
import Relacionamentos.UmParaMuitos.Aula351_UmParaMuitos.Pedido;

import java.util.List;

public class Aula352_UmaParaMuitos {

    public static void main(String[] args) {

//        DAO<Pedido> dao = new DAO<>(Pedido.class);

//        Pedido pedido = dao.obterPorId(1L);

//        for (ItemPedido item : pedido.getItens()) {
//            System.out.println("Produto: " + item.getProduto().getNome());
//            System.out.println("Preco: " + item.getProduto().getPreco());
//            System.out.println("Qtd: " + item.getQtd());
//        }

        DAO<ItemPedido> daoItem = new DAO<>(ItemPedido.class);

        List<ItemPedido> itens = daoItem.obterTodos();

        for (ItemPedido item : itens) {
            System.out.println("Produto: " + item.getProduto().getNome());
            System.out.println("Preco: " + item.getProduto().getPreco());
            System.out.println("Qtd: " + item.getQtd());
            System.out.println("----------------------------------------");
        }

    }
}
