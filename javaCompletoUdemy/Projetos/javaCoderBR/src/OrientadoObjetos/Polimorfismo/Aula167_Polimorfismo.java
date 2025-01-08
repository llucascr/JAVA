package OrientadoObjetos.Polimorfismo;

public class Aula167_Polimorfismo {
    public static void main(String[] args) {

        Pessoa cliente = new Pessoa(99.65);

        Arroz arroz = new Arroz(0.2);
        Feijao feijao = new Feijao(0.1);
        // Preciso instanciar as classes para o cliente ter acesso

        cliente.comer(arroz); // Polimorfismo Statico
        cliente.comer(feijao); // Polimorfismo Dinamico

        Sorvete sorvete = new Sorvete(0.4);

        cliente.comer(sorvete);

        System.out.println(cliente.getPeso());

    }
}
