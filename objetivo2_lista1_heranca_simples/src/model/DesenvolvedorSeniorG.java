package model;

public class DesenvolvedorSeniorG extends DesenvolvedorG {

	public DesenvolvedorSeniorG() {
		super();
	}

	public DesenvolvedorSeniorG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.10;
	}

	@Override
	public String toString() {
		return "\nDesenvolvedorSeniorG [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= "
				+ getSalario() + "]";
	}
	
	

}
