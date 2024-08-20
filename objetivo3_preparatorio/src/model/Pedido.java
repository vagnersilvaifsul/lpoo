package model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private LocalDateTime data;
    private BigDecimal total;
    private Estado estado = Estado.Aberto;

    //associacões
    private List<Item> itens = new ArrayList<>();
    private Vendedor vendedor = new Vendedor();

    public Pedido() {
    }

    public Pedido(String numero, LocalDateTime data, BigDecimal total, Estado estado, List<Item> itens, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.total = total;
        this.estado = estado;
        this.itens = itens;
        this.vendedor = vendedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
            "numero='" + numero + '\'' +
            ", data=" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data) +
            ", total=" + NumberFormat.getCurrencyInstance().format(total) +
            ", estado=" + estado +
            ", itens=" + itens +
            ", vendedor=" + vendedor +
            '}';
    }
}
