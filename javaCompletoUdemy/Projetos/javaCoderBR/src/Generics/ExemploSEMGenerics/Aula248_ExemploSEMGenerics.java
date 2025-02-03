package Generics.ExemploSEMGenerics;

public class Aula248_ExemploSEMGenerics {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // double -> Double

        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.guardar("ola");

        String coisaB = (String) caixaA.abrir();
        System.out.println(coisaB);
    }
}
