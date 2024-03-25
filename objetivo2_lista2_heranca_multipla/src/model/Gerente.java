package model;

public class Gerente extends Funcionario implements Investidor { //Questão 1a
	private String ticker;
	private int quantidade;

	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario, String ticker, int quantidade) {
		super(nome, salario);
		this.ticker = ticker;
		this.quantidade = quantidade;
	}

	@Override
	public double getBonus() {
		return this.getSalario() * 0.1;
	}

	@Override
	public String getTicker() {
		return ticker;
	}

	@Override
	public void setTicker(String ticker) {
		this.ticker = ticker;	
	}

	@Override
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;	
	}

	@Override
	public String toString() {
		return "\nGerenteV [Ticker=" + ticker + ", Quantidade=" + quantidade + ", Bonus=" + getBonus()
				+ ", Nome=" + getNome() + ", Salario=" + getSalario() + "]";
	}
}
