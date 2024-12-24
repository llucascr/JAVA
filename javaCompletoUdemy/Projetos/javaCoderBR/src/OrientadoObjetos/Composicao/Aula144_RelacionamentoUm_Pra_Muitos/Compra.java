package OrientadoObjetos.Composicao.Aula144_RelacionamentoUm_Pra_Muitos;

import java.util.ArrayList;

public class Compra {

    String cliente; // Em um sistema real provavelmente isso seria outro objeto (Classe)
    // 1 : N
    ArrayList<Item> itens = new ArrayList<>();

    void addItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    void addItem(String nome, int qtd, double preco) {
        this.addItem(new Item(nome, qtd, preco));
    }

    void mostrarItens(){
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.qtd * item.preco;
        }

        return total;
    }


}
