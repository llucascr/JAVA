public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Lucas");

        Compra compra1 = new Compra();
        //1
        compra1.addItem(new Produto("Lapis", 1.88), 32);
        // 2
        compra1.addItem("Caneta", 9.67, 100);

        // Associar as compras ao carrinho de compras do Cliente
//        cliente.compras.add(compra1); // Não é legal deixar a lista exposta assim
        cliente.addCompra(compra1);

        System.out.println(cliente.obterValorTotal());

    }
}