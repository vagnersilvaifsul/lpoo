package model;

public class Conta {
    private Double saldo = 0.0;

    public Conta() {
        super();
    }

    public Conta(Double saldo) {
        super();
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta [saldo=" + saldo + "]";
    }
}
