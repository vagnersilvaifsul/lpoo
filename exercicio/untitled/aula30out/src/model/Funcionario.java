package model;

public abstract class Funcionario {
    /*
        O "#" no uml significa que o atributo é protect.
    */
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //os métodos podem ser abstratos, passando assim para os filhos a implementação do algoritmo.
    public abstract double getBonus();
}
