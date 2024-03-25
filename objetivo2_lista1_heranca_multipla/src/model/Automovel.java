package model;

/*
	As Interfaces servem para aplicar o conceito de abstração em diferentes ramos (ou famílias) de hierarquia
	de herança simples. Observe que, neste exercício, a Interface Automóvel, "compartilha" métodos com as classes Carro
	e Caminhao, mas não capartilha com Bicicleta (pois, a Bicicleta não é um Automóvel).
 */
public interface Automovel { //Questão 1a
	String getRenavam();
	void setRenavam(String renavam);
	String getChassi();
	void setChassi(String chassi);
	String getPlaca();
	void setPlaca(String placa);
}
