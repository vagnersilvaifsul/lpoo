package model;

public class DesenvolvedorPlenoG extends DesenvolvedorG {

	public DesenvolvedorPlenoG() {
		super();
	}

	public DesenvolvedorPlenoG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.05;
	}

	@Override
	public String toString() {
		return "\nDesenvolvedorPlenoG [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= "
				+ getSalario() + "]";
	}
	
	

}