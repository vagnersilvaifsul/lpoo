package model;

public class Modelo {
	//Atributos
	private int id; //atributo incluído no exercício 2
	private String descricao;

	//Métodos construtores
	/*
		Note que é possível se utilizar da SOBRECARGA DE MÉTODO para se ter mais de uma forma de construção de objetos.
	 */

	//Construtor Padrão
	public Modelo() {
		super();
	}

	//Construtor Parametrizado (com TODOS os atributos da classe)
	public Modelo(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	//Construtor Parametrizado (com ALGUNS os atributos da classe)
	public Modelo(String descricao) {
		this.descricao = descricao;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//Converte o Objeto em String
	/*
		O método toString() já vem no Java na classe Object. Ele é um conversor de Objeto para String.
		O que estamos fazendo aqui é reescrevê-lo, modificando o comportamento que ele tinha na classe Object.
		Ele é muito utilizado em operações de saída, como no console, pois, o System.out.println() requer uma string como parâmetro de saída.
	 */
	@Override
	public String toString() {
		return "\nModelo_Lista2 [id=" + id + ", descricao=" + descricao + "]";
	}
	
}
