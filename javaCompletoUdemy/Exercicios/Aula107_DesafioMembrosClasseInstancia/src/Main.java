public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Iphone 14", 7800);

        p1.imprimir();

        System.out.println("Preco com desnconto!");
        double precoDesconto = p1.desconto();
        System.out.println(precoDesconto);
    }
}