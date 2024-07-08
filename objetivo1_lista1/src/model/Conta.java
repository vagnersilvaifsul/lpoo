package model;

public class Conta {
	//Atributos
	private int id;
	private double saldo;

	//Métodos Construtores
	public Conta() {
		super();
	}

	public Conta(int id, double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	//Métodos Acessores (de acesso)
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
	@Override
	public String toString() {
		return "\nConta [id=" + id + ", saldo=" + saldo + "]";
	}
	
}
