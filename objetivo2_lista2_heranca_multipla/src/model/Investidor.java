package model;

/*
	As Interfaces servem para aplicar o conceito de abstração em diferentes ramos (ou famílias) de hierarquia
	de herança simples. Observe que, neste exercício, a Interface Investidor, "compartilha" métodos com as classes
	Cliente e a classe Gerente, mas não capartilha com Desenvolvedor (pois, o Desenvolvedor não é um Investidor).
 */
public interface Investidor { //Questão 1a
	//os métodos em uma interface são, por natureza, públicos e abstratos (até o JDK 8)
	String getTicker();
	void setTicker(String ticker);
	int getQuantidade();
	void setQuantidade(int quantidade);
}
