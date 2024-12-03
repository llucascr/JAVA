package fundamentos;

public class Aula36_ConversaoNumeroString {
    public static void main(String[] args) {
        // Wrapper
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        // Tipo Primitivo
        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());
    }
}
