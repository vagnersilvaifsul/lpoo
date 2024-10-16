package model;

public class Conta {
	//Atributos
	private int id; //atributo incluído no exercício 2
	private double saldo;

	//Métodos construtores
	/*
		Note que é possível se utilizar da SOBRECARGA DE MÉTODO para se ter mais de uma forma de construção de objetos.
	 */

	//Construtor Padrão
	public Conta() {

	}

	//Construtor Parametrizado (com TODOS os atributos da classe)
	public Conta(int id, double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}

	//Construtor Parametrizado (com ALGUNS os atributos da classe)
	public Conta(double saldo) {
		this.saldo = saldo;
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

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo = valor;
	}
	
	public void saca(double valor) {
		double valorTemp = this.saldo - valor;
		if(valorTemp < 0) {
			System.out.println("Não há saldo suficiente para esse saque. Saldo= " + this.saldo);
			return;
		}
		this.saldo -= valor;
		System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa/100);
//		this.saldo = this.saldo + this.saldo * (taxa/100);
		System.out.println("Saldo atualizado pela taxa. Saldo atual=" + this.saldo);
	}

	//Converte o Objeto em String
	/*
		O método toString() já vem no Java na classe Object. Ele é um conversor de Objeto para String.
		O que estamos fazendo aqui é reescrevê-lo, modificando o comportamento que ele tinha na classe Object.
		Ele é muito utilizado em operações de saída, como no console, pois, o System.out.println() requer uma string como parâmetro de saída.
	 */
	@Override
	public String toString() {
		return "\nConta [id=" + id + ", saldo=" + saldo + "]";
	}
	
}
