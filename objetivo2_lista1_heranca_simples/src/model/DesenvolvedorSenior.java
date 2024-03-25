package model;

import java.text.NumberFormat;

public class DesenvolvedorSenior extends Desenvolvedor { //Questão 1a

	public DesenvolvedorSenior(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.10;
	} //Questão 2b

	@Override
	public String toString() {
		return "\nDesenvolvedorSenior [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}
	
	

}
