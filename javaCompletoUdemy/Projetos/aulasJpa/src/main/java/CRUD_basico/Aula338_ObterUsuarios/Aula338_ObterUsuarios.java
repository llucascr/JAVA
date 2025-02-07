package CRUD_basico.Aula338_ObterUsuarios;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Aula338_ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); // (consulta JPQL, e a clsse que quero que retorne)
//        query.setMaxResults(5); // setar quantos resultados quero que ele traga

//        List<Usuario> usuarios = query.getResultList(); // pega os usuarios e coloca na lista

        // Alternativa em uma linha só
        List<Usuario> usuarios = em
                .createQuery(jpql, Usuario.class)
                .setMaxResults(5)
                .getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId());
            System.out.println("NOME: " + usuario.getNome());
            System.out.println("E-mail: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}
