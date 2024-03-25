package model;

import java.text.NumberFormat;

public class GerenteGeral extends Gerente { //Questão 1a

	public GerenteGeral(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.40;
	} //Questão 2b

	@Override
	public String toString() {
		return "\nGerenteGeral [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}

	
	
	
	
}
