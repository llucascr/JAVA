package Generics.GenericsHeranca;

public class Aula250_GenericsHeranca {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);

        System.out.println(caixaA.abrir());
    }
}
