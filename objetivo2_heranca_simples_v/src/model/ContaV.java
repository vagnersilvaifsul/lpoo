package model;

public abstract class ContaV {

	protected double saldo;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		saldo += saldo + valor;
	}
	
	public void saca(double valor) {
		double saldoAutal = saldo - valor;
		if(saldoAutal >= 0) {
			saldo -= valor;
		} else {
			System.out.println("Não foi possível realizar o saque.");
		}
	}
	
	public void atualiza(double taxa) {
		if(taxa > 0) {
			saldo += saldo * (taxa/100);
		} else {
			System.out.println("A taxa deve ser maior que ZERO.");
		}	
	}
}
