package model;

import java.math.BigDecimal;

public class Gerente extends Funcionario{
    private Double taxaDeBonificacao;
    private Filial filial;

    public Gerente() {
    }

    public Gerente(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, Double taxaDeBonificacao, Filial filial) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.taxaDeBonificacao = taxaDeBonificacao;
        this.filial = filial;
    }

    public Double getTaxaDeBonificacao() {
        return taxaDeBonificacao;
    }

    public void setTaxaDeBonificacao(Double taxaDeBonificacao) {
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
            "taxaDeBonificacao=" + taxaDeBonificacao +
            ", filial=" + filial +
            ", matricula=" + matricula +
            ", nomeCompleto='" + nomeCompleto + '\'' +
            ", email='" + email + '\'' +
            ", telefone='" + telefone + '\'' +
            ", salario=" + salario +
            "} " + super.toString();
    }
}
