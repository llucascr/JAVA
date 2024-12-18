package ArraysCollections.Collections.Aula138_HashCode;

import java.util.HashSet;

public class Aula138_HashCode {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Lucas"));
        usuarios.add(new Usuario("Iris"));
        usuarios.add(new Usuario("Patricia"));

        System.out.println(usuarios.contains(new Usuario("Patricia")));


    }
}
