package Relacionamentos.UmParaMuitos.Aula351_UmParaMuitos;

import javax.persistence.*;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int qtd;

    @Column(nullable = false)
    private Double preco;

    @ManyToOne
    private Pedido pedido; // tenho muitos itens de pedido para um unico pedido

    @ManyToOne(fetch = FetchType.EAGER)
    private Produto2 produto;

    public ItemPedido() {
    }

    public ItemPedido(int qtd, Pedido pedido, Produto2 produto) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQtd(qtd);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto2 getProduto() {
        return produto;
    }

    public void setProduto(Produto2 produto) {
        this.produto = produto;
        if (produto != null && this.preco == null) {
            this.setPreco(produto.getPreco());
        }
    }
}
