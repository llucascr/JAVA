package OrientadoObjetos.Polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    // Polimorfismo statico
//    public void comer(Arroz arroz) {
//        this.peso += arroz.getPeso();
//    }
//
//    public void comer(Feijao feijao) {
//        this.peso += feijao.getPeso();
//    }
//
//    public void comer(Sorvete sorvete) {
//        this.peso += sorvete.getPeso();
//    }

    // Polimorfismo Dinamico
    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    // Getters / Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
