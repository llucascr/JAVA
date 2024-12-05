import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Domingo -> 1
        // Quarta -> 4
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine();
        
        if(dia.equalsIgnoreCase("domingo")){
            System.out.println("Domingo = " + 1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("Segunda = " + 2);
        } else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.println("Terça = " + 3);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("Quarta = " + 4);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("Quinta = " + 5);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("Sexta = " + 6);
        } else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
            System.out.println("Sabado = " + 7);
        }else {
            System.out.println("Dia invalido!");
        }
    }
}