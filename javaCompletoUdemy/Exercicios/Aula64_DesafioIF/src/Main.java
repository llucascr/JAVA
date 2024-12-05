public class Main {
    public static void main(String[] args) {

        double nota = 1.3;

//        if(nota >= 9.0); {
//            System.out.println("Quadro de Honra!");
//            System.out.println("Você é fera!!!");
//        }

        // O erro estava no ; ao final da expressao aonde ela estava ignorando a validação e executando todas as vezes
        // o codigo que estava dentro das { }
        if (nota >= 9.0) {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }

    }
}