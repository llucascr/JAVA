import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o num1: "));
        String operacao = JOptionPane.showInputDialog("Digite a operação: [+ - * / %] ");
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o num2: "));

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double mod = num1 % num2;

        boolean seSoma = operacao.equals("+");
        boolean seSub = operacao.equals("-");
        boolean seMult = operacao.equals("*");
        boolean seDiv = operacao.equals("/");
        boolean seMod = operacao.equals("%");

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2,
                seSoma == true ? soma : seSub == true ? sub : seMult == true ? mult : seDiv == true ? div : seMod == true ? mod : "");

//        System.out.println(seSoma == true ? "Resultado = " + soma : "");
//        System.out.println(seSub == true ? "Resultado = " + sub : "");
//        System.out.println(seMult == true ? "Resultado = " + mult : "");
//        System.out.println(seDiv == true ? "Resultado = " + div : "");
//        System.out.println(seMod == true ? "Resultado = " + mod : "");

    }
}