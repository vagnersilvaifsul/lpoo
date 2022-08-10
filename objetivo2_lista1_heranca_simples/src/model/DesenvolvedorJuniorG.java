package model;

public class DesenvolvedorJuniorG extends DesenvolvedorG {
	
	public DesenvolvedorJuniorG() {
		super();
	}

	public DesenvolvedorJuniorG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.05;
	}

	@Override
	public String toString() {
		return "\nDesenvolvedorJuniorG [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= "
				+ getSalario() + "]";
	}
	
	

}
