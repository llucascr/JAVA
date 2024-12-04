public class Main {
    public static void main(String[] args) {
//        int a = 2;
//        int b = (int) Math.pow(a , 3);

        // ---------------------------------------------
//        double conta1 = 6 * (3 + 2);
//        conta1 = Math.pow(conta1, 2) / (3 * 2);
////        System.out.println(conta1);
//        double conta2 = (double) (1 - 5) * (2 - 7) / 2;
//        conta2 = Math.pow(conta2, 2);
////        System.out.println(conta2);
//
//        double resultado = Math.pow((conta1 - conta2), 3) / Math.pow(10, 3);
//
//        System.out.printf("Resultado: %.2f", resultado);

        // ---------------------------------------------
        double numA = Math.pow(6 * (3 + 2) , 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10 , 3);

        double resultado = superior / inferior;
        System.out.println(resultado);
    }
}