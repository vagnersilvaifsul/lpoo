package model;

public abstract class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		double saldoAutal = this.saldo - valor;
		if(saldoAutal >= 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
		}
	}
	
	public void atualiza(double taxa) {
		if(taxa > 0) {
			this.saldo += this.saldo * (taxa/100);
		} else {
			System.out.println("A taxa deve ser maior que ZERO.");
		}
	}	
	
}
