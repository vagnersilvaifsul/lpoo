package model;

import java.text.NumberFormat;

public class GerenteDesenvolvimento extends Gerente { //Questão 1a

	public GerenteDesenvolvimento(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.20;
	} //Questão 2b

	@Override
	public String toString() {
		return "\nGerenteDesenvolvimento [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}

	

}
