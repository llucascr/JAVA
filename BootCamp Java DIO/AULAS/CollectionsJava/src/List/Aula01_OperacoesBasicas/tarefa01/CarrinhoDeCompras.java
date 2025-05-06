package List.Aula01_OperacoesBasicas.tarefa01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList = new ArrayList<>();

    /**
     * Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
     * @param nome
     * @param preco
     * @param quantidade
     */
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    /**
     * Remove um item do carrinho com base no seu nome.
     * @param nome
     */
    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        itemList.forEach(i -> {
            if (i.getNome().equals(nome)) {
                itemsParaRemover.add(i);
            }
        });
        itemList.removeAll(itemsParaRemover);
    }


//    public double calcularValorTotal() {
//        double total = 0.0;
//        for (Item i : itemList) {
//            total += i.getPreco() * i.getQuantidade();
//        }
//        return total;
//    }

    /**
     * Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
     * @return
     */
    public double calcularValorTotal() {
        return itemList.stream()
                .mapToDouble(i -> i.getPreco() * i.getQuantidade())
                .sum();
    }

    public void exibirItems() {
        System.out.println(itemList);

    }


}
