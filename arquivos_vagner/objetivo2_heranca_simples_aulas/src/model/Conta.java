package model;

public abstract class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		System.out.println("deposita");
	}
	
	public void saca(double valor) {
		System.out.println("saca");
	}
	
	public void atualiza(double taxa) {
		System.out.println("atualiza");
	}	
	
}
