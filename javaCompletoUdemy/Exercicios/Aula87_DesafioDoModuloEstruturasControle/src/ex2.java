import java.time.LocalDate;

public class ex2 {
    public static void main(String[] args) {
        int anoAtual = LocalDate.now().getYear();
        int ultimosDoisNumeros = anoAtual % 100;

        if (ultimosDoisNumeros % 4 == 0){
            System.out.println(anoAtual + " é bissexto!");
        }else {
            System.out.println(anoAtual + "não é bissexto!");
        }

    }
}
