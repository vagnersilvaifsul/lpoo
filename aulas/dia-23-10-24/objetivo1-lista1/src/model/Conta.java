package model;

public class Conta {
    private double saldo;
    private int id;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }

}
