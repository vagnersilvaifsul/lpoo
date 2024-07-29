package model;

import java.math.BigDecimal;

public class Vendedor extends Funcionario{
    private Double taxaDeComisao;
    private Regiao regiao;

    public Vendedor() {
    }

    public Vendedor(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, Regiao regiao, Double taxaDeComisao) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.regiao = regiao;
        this.taxaDeComisao = taxaDeComisao;
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

    @Override
    public String toString() {
        return "\nVendedor{" +
            "taxaDeComisao=" + taxaDeComisao +
            ", regiao=" + regiao +
            ", matricula=" + matricula +
            ", nomeCompleto='" + nomeCompleto + '\'' +
            ", email='" + email + '\'' +
            ", telefone='" + telefone + '\'' +
            ", salario=" + salario +
            "} " + super.toString();
    }
}
