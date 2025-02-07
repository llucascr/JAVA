package entities.Aula343_EntidadeProduto;

import javax.persistence.*;

@Entity
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //(name = nome que sera registrado no banco, length = tamanho do tipo do atributo, nullable = não vai aceitar valores nulos)
    @Column(name = "prod_nome", length = 200, nullable = false)
    private String nome;
    // ( , , precision = quantos digitos o numero pode ter (tamanho), scale = numero de casas decimais)
    @Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
