package model;

public abstract class Gerente extends Funcionario {
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public abstract double getBonus();	

}
