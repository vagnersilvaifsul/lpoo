package model;

import java.text.NumberFormat;

public class DesenvolvedorSenior extends Desenvolvedor {

	public DesenvolvedorSenior(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.10;
	}

	@Override
	public String toString() {
		return "\nDesenvolvedorSenior [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}
	
	

}
