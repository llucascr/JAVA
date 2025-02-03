package Generics.GenericsHeranca;

public class Aula151_GenericsHeranca2 {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.3);
        System.out.println(caixaA.abrir());
    }
}
