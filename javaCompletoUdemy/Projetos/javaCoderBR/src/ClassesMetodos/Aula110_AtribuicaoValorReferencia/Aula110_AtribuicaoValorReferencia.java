package ClassesMetodos.Aula110_AtribuicaoValorReferencia;

public class Aula110_AtribuicaoValorReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        // ----------------------------------------
        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // Atribuição por referencia (objeto)

        d1.dia = 31;
        d2.mes = 12;

        // As duas datas são igauis pois estão se referindo ao mesmo endereço de memoria
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }
}
