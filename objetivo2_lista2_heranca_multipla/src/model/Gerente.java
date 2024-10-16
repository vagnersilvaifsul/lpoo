package model;

import java.text.NumberFormat;

public class Gerente extends Funcionario implements Investidor { //Questão 1a
	private String ticker;
	private int qdeCotas;

	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario, String ticker, int qdeCotas) {
		super(nome, salario);
		this.ticker = ticker;
		this.qdeCotas = qdeCotas;
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
	public double getBonus() {
		return this.getSalario() * 0.1;
	}

	/*
		As anotações @Override a seguir são relativas a Interface.
		Note que é padrão sobreescrever os métodos públicos (ou os default) nas classes filhas.
	 */
	@Override
	public String getTicker() {
		return ticker;
	}

	@Override
	public void setTicker(String ticker) {
		this.ticker = ticker;	
	}

	@Override
	public int getQdeCotas() {
		return qdeCotas;
	}

	@Override
	public void setQdeCotas(int qdeCotas) {
		this.qdeCotas = qdeCotas;
	}

	/*
		Essa anotação @Override é relativa ao método toString da classe Object (a classe raiz da hierarquia de classes do Java).
	 */
	@Override
	public String toString() {
		return "\nGerente [" +
				"Nome=" + getNome() +
				", Salário=" + NumberFormat.getCurrencyInstance().format(this.salario) +
				", Ticker=" + ticker +
				", Quantidade de Cotas=" + NumberFormat.getNumberInstance().format(qdeCotas) +
				", Bonus=" + NumberFormat.getCurrencyInstance().format(getBonus()) +
				"]";
	}
}
