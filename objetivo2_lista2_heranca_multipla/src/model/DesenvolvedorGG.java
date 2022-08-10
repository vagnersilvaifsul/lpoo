package model;

public class DesenvolvedorGG extends FuncionarioGG {
	

	public DesenvolvedorGG() {
		super();
	}

	public DesenvolvedorGG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return this.getSalario() * 0.05;
	}

	@Override
	public String toString() {
		return "\nDesenvolvedorV [Bonus=" + getBonus() + ", Nome=" + getNome() + ", Salario=" + getSalario() + "]";
	}
	
	

}
