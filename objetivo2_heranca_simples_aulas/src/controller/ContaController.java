package controller;

import model.ContaPoupanca;
import model.ContaCorrente;

public class ContaController {

	public static void main(String[] args) {
		//Conta conta1 = new Conta(); //Não é possível criar instâncias (objetos) de classes marcadas como abstract

		System.out.println("*********** ContaCorrente ***********");
		ContaCorrente cc1 = new ContaCorrente(); //está utilizando um contrutor padrão
		System.out.println("ContaCorrente criada: " + cc1); //espera que imprima o saldo 0.0
		cc1.deposita(1000.00);
		System.out.println("Saldo da ContaCorrente depois do depósito de R$ 1000,00= " + cc1.getSaldo());
		cc1.atualiza(10.00);
		System.out.println("Saldo da ContaCorrente depois da atualização monetária de 10,00%= " + cc1.getSaldo());
		cc1.saca(200.00);
		System.out.println("Saldo da ContaCorrente depois do saque de R$ 200,00= " + cc1.getSaldo());

		//E se quiser que a ContaCorrente tenha limite de R$ 1000.00? (veja que o método saca foi sobreescrito na classe ContaCorrente)
		cc1.saca(1900.00);
		System.out.println("Saldo da ContaCorrente depois do saque de R$ 1900,00= " + cc1.getSaldo());
		//E se tentar sacar mais valor já que o limite é R$ 1000.00?
		cc1.saca(50.00); //não será possível, pois ultrapassa o limite da conta
		System.out.println("Saldo da ContaCorrente depois do saque de R$ 1900,00= " + cc1.getSaldo()); //impime o mesmo saldo da operação anterior
		/*
			Note que na herança é possível deixar o Tipo de Dados mais flexível, um segue a regra do código que está na
			superclasse, outro segue a regra sobreescrita, que está na subclasse.
		 */

		System.out.println("*********** ContaPoupanca ***********");
		ContaPoupanca cp1 = new ContaPoupanca(); //está utilizando um contrutor padrão
		System.out.println("ContaPoupanca criada= " + cp1); //espera que imprima o saldo 0.0
		
	}
	
}
