package model;

public class ContaCorrenteV extends ContaV {
	
	


	@Override
	public void saca(double valor) {
		double saldoAutal = saldo - valor;
		if(saldoAutal >= -200) {
			saldo -= valor;
		} else {
			System.out.println("Não foi possível realizar o saque.");
		}
	}
	
	
	@Override
	public String toString() {
		return "\nContaCorrenteV [saldo=" + getSaldo() + "]";
	}
	

}
