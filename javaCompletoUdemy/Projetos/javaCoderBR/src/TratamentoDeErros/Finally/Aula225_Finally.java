package TratamentoDeErros.Finally;

import java.util.Scanner;

public class Aula225_Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println(7 / entrada.nextInt());
            entrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally...");
            entrada.close(); // Mesmo que ocorra um erro ele vai fechar o Scanner (podemos aplicar isso a um contexto de fechar um banco de dados)
        }

        System.out.println("FIM!!");
    }
}
