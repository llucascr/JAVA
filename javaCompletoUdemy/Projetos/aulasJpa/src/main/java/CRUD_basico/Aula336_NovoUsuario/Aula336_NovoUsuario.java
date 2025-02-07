package CRUD_basico.Aula336_NovoUsuario;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula336_NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Igor", "igor@email.com.br");
//        novoUsuario.setId(1L); // @Generated gera os IDs e subistitue esse trabalho de definir cada um

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O Id gerado foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
