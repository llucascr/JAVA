public class Jantar {
    public static void main(String[] args) {
        Comida pizza = new Comida("Pizza", 0.280);
        Comida hamburger = new Comida("Pizza", 0.100);
        Comida arroz = new Comida("Pizza", 0.140);


        Pessoa p1 = new Pessoa("Lucas", 82);
//        p1.comer(pizza.peso);
//        p1.comer(hamburger.peso);
//        p1.comer(arroz.peso);

        p1.comer(pizza);
        p1.comer(hamburger);
        p1.comer(arroz);

        p1.imprimir();
    }
}
