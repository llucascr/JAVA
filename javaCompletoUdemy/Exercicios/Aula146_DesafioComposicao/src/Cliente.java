import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    // Quanto de dinheiro esse cliente gastou na loja
    double obterValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }

        return total;
    }

    void addCompra(Compra compra) {
        this.compras.add(compra);
    }
}
