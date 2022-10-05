package controller;

import static model.StaticExemplo.*;
//import model.StaticExemplo;

public class StartHere {
	public static void main(String[] args) {
		System.out.println(a);
		imprimir();
		
		StartHere.imprimirMessage();
		
		//StartHere sh = new StartHere();
		//sh.imprimirMessage();
	}
	
	public static void imprimirMessage() {
		System.out.println("Olá mundo.");
	}
}
