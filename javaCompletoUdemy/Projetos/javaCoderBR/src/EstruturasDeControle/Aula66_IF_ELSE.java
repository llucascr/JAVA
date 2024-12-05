package EstruturasDeControle;

import javax.swing.*;

public class Aula66_IF_ELSE {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o valor: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

    }
}
