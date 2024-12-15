public class Pessoa {
    String nome;
    double peso;
    double pesoDepois;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

//    void comer(double pesoComida) {
//        pesoDepois += pesoComida;
//    }

    void comer(Comida comida) {
        if (comida != null) {
            this.pesoDepois += comida.peso;
        }
    }

    void imprimir() {
        pesoDepois += peso;
        System.out.println("Nome\tPeso antes\tPeso depois");
        System.out.println(nome + "\t" + peso + "\t\t" + pesoDepois);
    }
}
