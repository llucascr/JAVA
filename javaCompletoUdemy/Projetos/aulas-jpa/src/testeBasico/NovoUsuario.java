package testeBasico;

import main.java.modeloBasico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulas-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Lucas", "lucas@email.com.br");

        em.persist(novoUsuario);

        em.close();
        emf.close();
    }
}
