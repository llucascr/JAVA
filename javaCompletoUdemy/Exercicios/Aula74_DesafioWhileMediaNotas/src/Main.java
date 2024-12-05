import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        double nota = 0;
        int count = 0;

        while (nota != -1){
            System.out.print("Digite a Nota: ");
            nota = entrada.nextDouble();
            if (nota > 10 || nota < 0){
                System.out.println("Nota Invalida!");
            }else {
                total += nota;
                count++;
            }
        }

        double media = total / count;
        System.out.println("Somatoria: " + total);
        System.out.println("Media: " + media);

        entrada.close();
    }
}