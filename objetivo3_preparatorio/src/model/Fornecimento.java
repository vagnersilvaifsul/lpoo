package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Fornecimento {
    private LocalDateTime data;
    private Integer quantidade;
    private BigDecimal total;

    //associações
    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento() {
    }

    public Fornecimento(LocalDateTime data, Integer quantidade, BigDecimal total, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
            "data=" + data +
            ", quantidade=" + quantidade +
            ", total=" + total +
            ", produto=" + produto +
            '}';
    }
}
