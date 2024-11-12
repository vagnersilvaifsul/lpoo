package model;


public class ContaCorrente extends Conta{

	//Está sobreescrevendo o método saca que está na classe abstract Conta
	public void saca(double valor) {
		double saldoAutal = this.saldo - valor;
		if(saldoAutal >= -1000.00) {
			this.saldo -= valor;
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente. Saldo atual é de = " + this.saldo);
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}

}
