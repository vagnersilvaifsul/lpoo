package control;

import model.ContaPoupanca;
import model.ContaCorrente;
//import model.Conta;

public class ContaController {

	public static void main(String[] args) {
		//Conta conta1 = new Conta();
		
		ContaCorrente cc1 = new ContaCorrente();
		System.out.println(cc1);
		
		ContaPoupanca cp1 = new ContaPoupanca();
		System.out.println(cp1);
		
	}
	
}
