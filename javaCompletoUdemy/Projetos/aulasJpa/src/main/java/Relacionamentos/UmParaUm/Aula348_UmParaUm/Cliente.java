package Relacionamentos.UmParaUm.Aula348_UmParaUm;

import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // 1 : 1
    @OneToOne(cascade = CascadeType.PERSIST) // cascade = quando tiver pessistindo um cliente ele vai la e persisti o assento tambem
    @JoinColumn(name = "assento_id", unique = true) // expecifica para mapear campos que representam junção
    private Assento assento;

    public Cliente() {
    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
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

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}