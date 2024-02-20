package model;

import java.text.NumberFormat;

public class GerenteDesenvolvimento extends Gerente {

	public GerenteDesenvolvimento(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.20;
	}

	@Override
	public String toString() {
		return "\nGerenteDesenvolvimento [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}

	

}
