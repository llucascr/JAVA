package Fundamentos;

public class Aula29_TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2));

        String s = "Boa Tarde";
//        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); // Começa ou não com essa String
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa")); // Transforma em minuscula para depois verificar se começa com aquela String
        System.out.println(s.endsWith("dia!!")); // Termina ou não com essa String
        System.out.println(s.length()); // Tamanho da String
        System.out.println(s.equals("boa Tarde")); // Me diz se a String é igual
        System.out.println(s.equalsIgnoreCase("Boa Tarde")); // Me diz se a String é igual ignorando maiusculas ou minusculas

        // -----------------------------------------------------
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987F;

        System.out.printf("\n\nFrase 1:\nNome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$%.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\n\nFrase 2:\nNome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$%.2f",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

    }
}
