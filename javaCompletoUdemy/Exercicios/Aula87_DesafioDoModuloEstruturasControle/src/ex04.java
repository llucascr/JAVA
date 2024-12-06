import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num: ");
        int num = scanner.nextInt();
        boolean ehPrimo = true;

        if (num <= 1){
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo){
            System.out.println(num + " é Primo");
        }else {
            System.out.println(num + " não é Primo");
        }

        scanner.close();
    }
}
