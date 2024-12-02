package OrientacaoObjetos.Classes;

public class ExercicioClasses {
    public static void main(String[] args) {
        // Crie uma classe carro com os seguintes atributos: Nome, Modelo, Ano
        // Em seguida, crie dois objetos distintos e imprima seus valores
        Carro carro1 = new Carro();

        carro1.nome = "Up";
        carro1.modelo = "TSI";
        carro1.ano = 2022;

        Carro carro2 = new Carro();

        carro2.nome = "Hilux";
        carro2.modelo = "Toyota";
        carro2.ano = 1980;

        System.out.println("Carro: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Carro: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

    }
}
