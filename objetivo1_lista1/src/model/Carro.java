package model;

public class Carro {
	//Atributos
	private int id; //atributo incluído no exercício 2
	private String marca;
	private String modelo;
	private int anoFabricacao;

	//Métodos construtores
	/*
		Note que é possível se utilizar da SOBRECARGA DE MÉTODO para se ter mais de uma forma de construção de objetos.
	 */

	//Construtor Padrão
	public Carro() {
	}

	//Construtor Parametrizado (com TODOS os atributos da classe)
	public Carro(int id, String marca, String modelo, int anoFabricacao) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	//Construtor Parametrizado (com ALGUNS os atributos da classe)
	public Carro(int id, String marca, String modelo) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
	}

	//Métodos Acessores (com C mesmo, de acesso)
	/*
		Os métodos acessores funcionam como uma camada de proteção para leitura e escrita dos valores dos atributos da classe.
		A boa prática de Engenharia de Software requer que os atributos sejam protegidos com private para as operações de leitura e escrita (ENCAPSULE).
		Assim, somente membros da própria classe, como os getters e setters, podem ter acesso aos atibutos (gerenciam o ENCAPSULAMENTO).
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	//Converte o Objeto em String
	/*
		O método toString() já vem no Java na classe Object. Ele é um conversor de Objeto para String.
		O que estamos fazendo aqui é reescrevê-lo, modificando o comportamento que ele tinha na classe Object.
		Ele é muito utilizado em operações de saída, como no console, pois, o System.out.println() requer uma string como parâmetro de saída.
	 */
	@Override
	public String toString() {
		return "\nCarro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + "]";
	}
	
}
