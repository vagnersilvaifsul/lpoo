package model;

public abstract class GerenteG extends FuncionarioG {
	
	public GerenteG() {
		super();
	}

	public GerenteG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public abstract double getBonus();	

}
