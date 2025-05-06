package List.Aula02_Pesquisa.tarefa02;

public class Main {

    public static void main(String[] args) {

        // 2. Soma de Números
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(10);

        System.out.println("Soma: " + numeros.calcularSoma());

        System.out.println("Maior: " + numeros.encontrarMaiorNumero());

        System.out.println("Menor: " + numeros.encontrarMenorNumero());

        System.out.println(numeros.exibirNumeros());

    }
}
