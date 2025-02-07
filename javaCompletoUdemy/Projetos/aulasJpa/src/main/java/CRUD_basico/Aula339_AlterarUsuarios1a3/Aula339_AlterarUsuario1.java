package CRUD_basico.Aula339_AlterarUsuarios1a3;

import entities.Aulas335_modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula339_AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulasJpa");
        EntityManager em = emf.createEntityManager();

        // Buscar e alterar
        em.getTransaction().begin(); // como precisa passar parametro precisamos abrir uma getTransaction()

        Usuario usuario = em.find(Usuario.class, 7L);
//        System.out.println(usuario.getEmail()); // igor@email.com.br
        usuario.setNome("Leonardo");
        usuario.setEmail("leonardo@email.com.br");

        em.merge(usuario); // gera o comando para dar o update com os valores novos que setei na classe

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
