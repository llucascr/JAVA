import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        if(num >= 0 && num <= 10 ){
            if (num % 2 == 0){
                System.out.println("PAR");
            }else {
                System.out.println("IMPAR");
            }
        }else {
            System.out.println("NUMERO MENOR QUE 0 ou MAIOR QUE 10");
        }

        scanner.close();
    }
}
