package List.Aula03_OrdenacaoList.tarefa03;

public class Main {

    public static void main(String[] args) {

        // 2. Ordenação de Números
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(11);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(100);

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());
    }
}
