package CRUD_basico.Aula337_ObterUsuario;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula337_ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        // Em caso de consulta não precisamos usar .getTransaction()

        Usuario usuario = em.find(Usuario.class, 3L); // essa consulta retorna um objeto do tipo Usuario
        System.out.println(usuario.getNome() + " " + usuario.getEmail());

        em.close();
        emf.close();
    }
}
