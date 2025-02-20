package Relacionamentos.UmParaMuitos.Aula351_UmParaMuitos;

import DAO.DAO;

public class Aula351_UmParaMuitos {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

//        Produto2 produto2 = new Produto2("Geladeira", 2789.99);
//        Produto2 produto2 = new Produto2("Maquina de Lavar", 2549.89);
        Produto2 produto2 = new Produto2("Iphone 16", 6480.90);
        Pedido pedido = new Pedido(); // pega a data atual
        ItemPedido item = new ItemPedido(5, pedido, produto2);

        dao.abrirTransacao()
                .inserir(produto2)
                .inserir(pedido)
                .inserir(item)
                .fecharTransacao()
                .fechar();

    }
}
