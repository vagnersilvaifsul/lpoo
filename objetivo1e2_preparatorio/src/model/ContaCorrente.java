package model;

import java.text.NumberFormat;

public class ContaCorrente extends Conta implements Associado{

    private int qdeCotas;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, int qdeCotas) {
        super(saldo);
        this.qdeCotas = qdeCotas;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int getQdeCotas() {
        return this.qdeCotas;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qdeCotas=" + NumberFormat.getNumberInstance().format(this.qdeCotas) +
                ", saldo=" + NumberFormat.getCurrencyInstance().format(this.saldo) +
                '}';
    }
}
