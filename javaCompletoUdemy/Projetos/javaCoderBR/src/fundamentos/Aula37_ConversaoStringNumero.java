package fundamentos;

import javax.swing.*;

public class Aula37_ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog( // Cria uma janela para digitarmos um valor
                "Digite o primeiro numero: ");

        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo numero: ");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma / 2);

        // BigDecimal -> nivel de precisão em soma
    }
}
