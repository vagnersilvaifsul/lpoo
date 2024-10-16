package model;

import java.text.NumberFormat;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
    }

    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "saldo=" + NumberFormat.getCurrencyInstance().format(this.saldo) +
                '}';
    }
}
