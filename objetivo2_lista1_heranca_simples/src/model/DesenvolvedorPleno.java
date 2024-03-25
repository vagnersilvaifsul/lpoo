package model;

import java.text.NumberFormat;

public class DesenvolvedorPleno extends Desenvolvedor { //Questão 1a

	public DesenvolvedorPleno(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonus() {
		return getSalario() * 0.05;
	} //Questão 2b

	@Override
	public String toString() {
		return "\nDesenvolvedorPleno [Bonus= "
			+ NumberFormat.getCurrencyInstance().format(getBonus())
			+ ", Nome= " + getNome()
			+ ", Salario= "
			+ NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
	}
	
	

}