package model;

public class GerenteGeralG extends GerenteG {

	public GerenteGeralG() {
		super();
	}

	public GerenteGeralG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.40;
	}

	@Override
	public String toString() {
		return "\nGerenteGeralG [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= " + getSalario()
				+ "]";
	}

	
	
	
	
}
