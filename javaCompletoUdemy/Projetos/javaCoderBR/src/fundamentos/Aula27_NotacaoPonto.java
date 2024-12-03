package fundamentos;

public class Aula27_NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.4;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
        System.out.println("Leo".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
    }
}
