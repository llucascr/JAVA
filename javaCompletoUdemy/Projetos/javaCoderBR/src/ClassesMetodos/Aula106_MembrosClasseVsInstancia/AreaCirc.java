package ClassesMetodos.Aula106_MembrosClasseVsInstancia;

public class AreaCirc {
    double raio;
    final static double pi = 3.14; // O metodo virou estatico e esta associado diretamente a classe

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    // o metodo pow de Math é um metodo estatico
    double area() {
        return pi * Math.pow(raio, 2);
    }

    // metodo static
    static double areaStatic(double raio) {
        return pi * Math.pow(raio, 2);
    }
}
