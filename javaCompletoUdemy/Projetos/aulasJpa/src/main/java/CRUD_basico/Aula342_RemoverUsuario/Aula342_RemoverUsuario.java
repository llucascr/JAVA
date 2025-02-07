package CRUD_basico.Aula342_RemoverUsuario;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula342_RemoverUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        // Consultar e depois excluir

        Usuario usuario = em.find(Usuario.class, 8L);

        if (usuario != null) { // verifica se o usuario foi encontrado
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }


        em.close();
        emf.close();
    }
}
