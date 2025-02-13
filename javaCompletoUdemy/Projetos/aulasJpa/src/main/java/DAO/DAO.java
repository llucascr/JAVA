package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("aulasJpa");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> inserir(E entidade) {
        em.persist(entidade);
        return this;
    }

    // junção de abriãrTransacao, fecharTransacao, inserir
    public DAO<E> incluirCompleto(E entidade) {
        return this.abrirTransacao().inserir(entidade).fecharTransacao();
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
    }

    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int qtd, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Null Class");
        }

        String jpql = "SELECT e FROM " + classe.getName() + " e";

        return em.createQuery(jpql, classe).setMaxResults(qtd).setFirstResult(deslocamento).getResultList();
    }

    public void fechar() {
        em.close();
    }
}
