import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("MEDIA: " + media);

        if (media >= 7){
            System.out.println("APROVADO!");
        } else if (media > 4) {
            System.out.println("RECUPERACAO!");
        }else {
            System.out.println("REPROVADO!");
        }

        scanner.close();
    }
}
