package controller;

import model.ContaConjuntaV;
import model.ContaCorrenteV;
import model.ContaPoupancaSalarioV;
import model.ContaPoupancaV;

public class ContaControllerV {
	
	static double total_folha=0.0;

	public static void main(String[] args) {
		//ContaV conta1 = new ContaV(); //Não é possível criar instâncias (objetos) de classes marcadas como abstract
		
		ContaCorrenteV cc1 = new ContaCorrenteV();
		
		ContaPoupancaV cp1 = new ContaPoupancaV();
		
		ContaConjuntaV cj1 = new ContaConjuntaV();
		
		ContaPoupancaSalarioV cps1 = new ContaPoupancaSalarioV();
		
		cc1.deposita(1000.00);
		//System.out.println("Saldo em Conta Corrente=" + cc1.getSaldo());
		System.out.println(cc1);
		cc1.saca(1100.00);
		System.out.println(cc1);
		//cc1.atualiza(10);
		//System.out.println(cc1);
		
		
		System.out.println();
		cp1.deposita(2000.00);
		System.out.println(cp1);
		cp1.saca(500.00);
		//System.out.println("Saldo em Conta Poupança=" +cp1.getSaldo());
		System.out.println(cp1);
		
		System.out.println();
		cj1.deposita(5000.00);
		//System.out.println("Saldo em Conta Conjunta=" +cp1.getSaldo());
		System.out.println(cj1);
		
		
		System.out.println();
		cps1.deposita(7000.00);
		//System.out.println("Saldo em Conta Poupança Salario=" +cp1.getSaldo());
		System.out.println(cps1);


	}

}
