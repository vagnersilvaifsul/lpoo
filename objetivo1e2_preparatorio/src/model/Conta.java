package model;

public abstract class Conta {
    //atributos
    protected double saldo;

    //métodos construtores
    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    //métodos acessores
    /*
        Note que eles não iniciam com get ou set. Isso mesmo, eles podem
        não iniciar com esse prefixo, mas seguem acessando os atributos da classe
        para escrita ou leitura.
     */
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public abstract void atualiza(double taxa);

    public double getSaldo() {
        return saldo;
    }
}
