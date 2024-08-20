package model;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Item {
    private Integer quantidade;
    private BigDecimal total;
    private Situacao situacao = Situacao.Ativo;

    //associacoes
    private Produto produto;

    public Item() {
    }

    public Item(Integer quantidade, BigDecimal total, Situacao situacao, Produto produto) {
        this.quantidade = quantidade;
        this.total = total;
        this.situacao = situacao;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItem{" +
            "quantidade=" + quantidade +
            ", total=" + NumberFormat.getCurrencyInstance().format(total) +
            ", situacao=" + situacao +
            ", produto=" + produto +
            '}';
    }
}
