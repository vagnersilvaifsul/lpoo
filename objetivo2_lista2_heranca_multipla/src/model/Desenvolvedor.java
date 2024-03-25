package model;

public class Desenvolvedor extends Funcionario { //Questão 1a
	

	public Desenvolvedor() {
		super();
	}

	public Desenvolvedor(String nome, double salario) {
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
