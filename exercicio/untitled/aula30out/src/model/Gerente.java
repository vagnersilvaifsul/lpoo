package model;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double getBonus() {
        return 0;
    }
}
