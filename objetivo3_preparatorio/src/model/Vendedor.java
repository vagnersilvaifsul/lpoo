package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario{
    private Double taxaDeComisao;
    private Regiao regiao;

    //associações
    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor() {
    }

    public Vendedor(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, Double taxaDeComisao, Regiao regiao) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.taxaDeComisao = taxaDeComisao;
        this.regiao = regiao;
    }

    public Double getTaxaDeComisao() {
        return taxaDeComisao;
    }

    public void setTaxaDeComisao(Double taxaDeComisao) {
        this.taxaDeComisao = taxaDeComisao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
            "taxaDeComisao=" + taxaDeComisao +
            ", regiao=" + regiao +
            ", pedidos=" + pedidos +
            ", matricula=" + matricula +
            ", nomeCompleto='" + nomeCompleto + '\'' +
            ", email='" + email + '\'' +
            ", telefone='" + telefone + '\'' +
            ", salario=" + salario +
            "} " + super.toString();
    }
}
