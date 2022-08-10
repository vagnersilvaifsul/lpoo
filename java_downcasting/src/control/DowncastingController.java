package control;

import java.util.ArrayList;
import java.util.List;

public class DowncastingController {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1, 1000.00);
		Conta conta2 = new Conta(2, 1000.00);
		Conta conta3 = new Conta(3, 1000.00);
		Conta conta4 = new Conta(4, 1000.00);
		Conta conta5 = new Conta(5, 1000.00);
		
		/*
		 * Coloca-se a esquerda do operador de atribuição o tipo genérico List (uma interface), e a direita chama o contrutor de uma
		 * classe concreta, o ArrayList. Se utiliza essa estratétia para programar polimorficamente. Isto é, uma chamada de add reage
		 * polimorficamente para ArrayList, chamando o add implementado em ArrayList
		*/
		List<Conta> contas = new ArrayList<>();
		//contas.add(conta1); //coloquei um dowcasting pra demonstrar seu uso
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		contas.add(conta5);
		
		//Note que a IDE está apontanto um alerta, mas o código funciona, o downcasting é feito
		//Nota: ¬Não se faz downcasting pq o método add em List é abastrato, isto é, sua definição fica na subclasse, ArrayList.
		((ArrayList) contas).add(conta1);
		
		//Mas, se eu imprimir Contas, verei que a instrução da linha 29 executa
		System.out.println(contas);

	}
}

class Conta {
	private int id;
	private double saldo=0.0;

	public Conta() {
		super();
	}


	public Conta(int id, double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "\nConta [id=" + id + ", saldo=" + saldo + "]";
	}
	
}
