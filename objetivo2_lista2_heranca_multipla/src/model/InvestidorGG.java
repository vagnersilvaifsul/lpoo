package model;

public interface InvestidorGG {
	//os métodos em uma interface são, por natureza, públicos e abstratos
	String getTicker();
	void setTicker(String ticker);
	int getQuantidade();
	void setQuantidade(int quantidade);
}
