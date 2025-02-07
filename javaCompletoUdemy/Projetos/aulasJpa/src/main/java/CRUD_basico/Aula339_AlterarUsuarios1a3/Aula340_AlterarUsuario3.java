package CRUD_basico.Aula339_AlterarUsuarios1a3;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula340_AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);

        em.detach(usuario); // tira/desanexa o objeto do modo gerenciado do banco

        usuario.setNome("Leonardo leitao");
        usuario.setEmail("leonardo@email.com.br");

        em.merge(usuario); // então é obrigatorio o uso do merge para tornar o objeto gerenciado

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
