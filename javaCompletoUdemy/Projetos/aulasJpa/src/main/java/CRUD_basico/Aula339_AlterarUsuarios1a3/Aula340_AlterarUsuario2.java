package CRUD_basico.Aula339_AlterarUsuarios1a3;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula340_AlterarUsuario2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);

        usuario.setNome("Leonardo");
        usuario.setEmail("leonardo@email.com.br");

//        em.merge(usuario); // mesmo sem o merge ele da um UPDATE no banco de dados por conta que o objeto esta gerenciado

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
