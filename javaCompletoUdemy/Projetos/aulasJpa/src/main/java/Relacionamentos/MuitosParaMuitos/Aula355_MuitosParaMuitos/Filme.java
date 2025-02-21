package Relacionamentos.MuitosParaMuitos.Aula355_MuitosParaMuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "Filmes") // ERRO
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double nota;

    @ManyToMany(cascade = CascadeType.PERSIST)
//    @JoinTable(name = "Filmes_Atores", // ERRO
//            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id"))
    private List<Ator> atores;

    public Filme() {
    }

    public Filme(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void adicionarAtor(Ator ator){
        if (ator != null && !getAtores().contains(ator)) {
            getAtores().add(ator);
        }

        if (!ator.getFilmes().contains(this)) {
            ator.getFilmes().add(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ator> getAtores() {
        if (atores == null) {
            atores = new ArrayList<>(); // Sempre vai retornar uma lista valida
        }
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}
