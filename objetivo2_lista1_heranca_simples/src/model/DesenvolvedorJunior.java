package model;

import java.text.NumberFormat;

public class DesenvolvedorJunior extends Desenvolvedor { //Questão 2b

	public DesenvolvedorJunior(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.05;
	} //Questão 2b

	@Override
	public String toString() {
		return "\nDesenvolvedorJunior [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}
	
	

}
