import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int qtd) {
        this.itens.add( new Item(p, qtd));
    }

    // Metodo ja cria um produto que ja se relaciona com item
    void addItem(String nome, double preco, int qtd) {
        this.itens.add(new Item(new Produto(nome, preco), qtd));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.qtd * item.produto.preco;
        }

        return total;
    }
}
