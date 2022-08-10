package model;

public abstract class DesenvolvedorG extends FuncionarioG {
	
	public DesenvolvedorG() {
		super();
	}
	
	public DesenvolvedorG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public abstract double getBonus();	
	
}
