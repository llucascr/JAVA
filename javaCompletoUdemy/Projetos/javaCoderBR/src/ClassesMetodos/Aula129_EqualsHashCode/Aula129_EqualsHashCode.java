package ClassesMetodos.Aula129_EqualsHashCode;

public class Aula129_EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lucas" , "lucasdecamposranzani@gmail.com");
        Usuario u2 = new Usuario("Lucas" , "lucasdecamposranzani@gmail.com");

        System.out.println(u1 == u2);

        System.out.println(u1.equals(u2)); // Modificando o metodo equals isso fica True
        // Mas com o equals padrão ele é false

        // --------------------------
        // HashCode
        // O HashCode sera implementado na aula 138



    }
}
