package ArraysCollections.Collections.Aula133_List;

import java.util.ArrayList;
import java.util.List;

public class Aula133_List {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
//        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Lucas");
        lista.add(u1);
        // ou
        lista.add(new Usuario("Iris"));
        lista.add(new Usuario("Iris")); // Aceita repetições

        lista.add(new Usuario("Patricia"));
        lista.add(new Usuario("Luiz"));
        lista.add(new Usuario("Ricardo"));

        for (Usuario u : lista) {
            System.out.print(u.nome + " ");
        }

        // .get(posição) -> pega o elemento da posição que passou como argumento
        System.out.println("\n\n" + lista.get(1).nome + "\n\n");

        // Usando o metodo toString()
        for (Usuario u : lista) {
            System.out.println(u);
        }

        // Podemos remover por index ou por Objeto(Usuario)
        lista.remove(4);
        lista.remove(new Usuario("Lucas")); // Pode retornar um TRUE ou FALSE

        System.out.println("\nRemoveu Lucas e Ricardo");
        for (Usuario u : lista) {
            System.out.print(u.nome + " ");
        }

        System.out.println("\n\n" + lista.contains(new Usuario("Iris")));
    }
}
