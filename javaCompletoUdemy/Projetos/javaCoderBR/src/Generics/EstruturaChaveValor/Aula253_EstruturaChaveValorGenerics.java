package Generics.EstruturaChaveValor;

public class Aula253_EstruturaChaveValorGenerics {
    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Lucas");
        resultadoConcurso.adicionar(2, "Marcos");
        resultadoConcurso.adicionar(3, "Luiz");
        resultadoConcurso.adicionar(2, "Iris");

        System.out.println(resultadoConcurso.getValor(2));

    }
}
