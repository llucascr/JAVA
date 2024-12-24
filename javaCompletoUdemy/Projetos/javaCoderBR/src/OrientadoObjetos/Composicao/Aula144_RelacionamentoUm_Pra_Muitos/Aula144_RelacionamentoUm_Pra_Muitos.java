package OrientadoObjetos.Composicao.Aula144_RelacionamentoUm_Pra_Muitos;

public class Aula144_RelacionamentoUm_Pra_Muitos {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Lucas";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha", 12, 3.89));
        c1.itens.add(new Item("Caderno", 3, 18.79));

        System.out.println(c1.itens.size());

        System.out.println("Valor Total: " + c1.getValorTotal());

        Compra c2 = new Compra();

        // Usando metodo de adicionar Item
        c2.addItem(new Item("Iphone 14", 10, 4300.99));

        // Sobrecarga do metodo de addItem passando a instacia dentro do metodo
        c2.addItem("MacBook M2", 2, 7888.87);

        c2.mostrarItens();


    }
}
