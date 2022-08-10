package model;

public class GerenteV extends FuncionarioV implements InvestidorV {
	
	private String ticker;
	private int quantidade;

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
		return "\nGerenteV [ticker=" + ticker + ", quantidade=" + quantidade + ", getBonus()=" + getBonus()
				+ ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + "]";
	}
	
	

}
