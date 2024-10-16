package model;

import java.text.NumberFormat;

public class Desenvolvedor extends Funcionario { //Questão 1a
	

	public Desenvolvedor() {
	}

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}

	/*
		Note que o gerador de código da IDE coloca uma anotação sobre a assinatura do método.
		Trata-se do Override, sobreescrita.
		Uma sobreescrita acontece quando na classe filha usa-se a mesma assinatura de um método da classe mãe.
		A sobreescrita serve para reescrever o comportamento da classe mãe.
		Nesse exercício, a classe mãe tem o método getBonus() marcado como abstract. Isso significa que qualquer classe filha
		deve "resolver" o método abstrato que está na classe mãe. Nesse caso, resolveu escrevendo o método de cálculo do getBonus().
	 */
	@Override
	public double getBonus() { //essa linha representa a assinatura do método
		return this.getSalario() * 0.05;
	}

	/*
		Essa anotação @Override é relativa ao método toString da classe Object (a classe raiz da hierarquia de classes do Java).
	 */
	@Override
	public String toString() {
		return "\nDesenvolvedor [" +
			"Nome=" + getNome() +
			", Salário=" + NumberFormat.getCurrencyInstance().format(this.salario) +
			" Bonus=" + NumberFormat.getCurrencyInstance().format(getBonus()) +
			"]";
	}
	
	

}
