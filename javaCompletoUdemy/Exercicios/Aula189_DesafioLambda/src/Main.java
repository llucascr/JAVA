import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        String preco = precoFinal
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println(preco);
    }
}