package model;

public class GerenteDesenvolvimentoG extends GerenteG {

	public GerenteDesenvolvimentoG() {
		super();
	}

	public GerenteDesenvolvimentoG(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.20;
	}

	@Override
	public String toString() {
		return "\nGerenteDesenvolvimentoG [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= "
				+ getSalario() + "]";
	}

	

}
