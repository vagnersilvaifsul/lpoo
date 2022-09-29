package controller;

import java.util.ArrayList;
import java.util.List;

import model.AviaoV;
import model.NavioV;
import model.PersonagemV;
import model.TanqueV;

public class GameControllerV {
	public static void main(String[] args) {

		double a = 23L; //coerção
		//int a = 23.5;
		System.out.println(a); //23

		//1. Sobrecarga dos contrutores
		AviaoV a1 = new AviaoV();
		AviaoV a2 = new AviaoV(1,1,1);
		NavioV n1 = new NavioV();
		NavioV n2 = new NavioV(2,2);
		TanqueV t1 = new TanqueV();
		TanqueV t2 = new TanqueV(3,3);
		
		//2a. forma
		List<PersonagemV> personagens = new ArrayList<>();
		personagens.add(a1);
		personagens.add(a2);
		personagens.add(n1);
		personagens.add(n2);
		personagens.add(t1);
		personagens.add(t2);
		System.out.println("Posição inicial dos Personagens:");
		System.out.println(personagens);
		
		personagens.forEach(p -> {
			p.desenhar(); //agindo polimorficamente, 3a
			if(p instanceof AviaoV) {
				((AviaoV) p).mover(2,2,2); //4a
			} else if(p instanceof NavioV) {
				p.mover(4, 4);
			} else if(p instanceof TanqueV) {
				p.mover(6, 6);
			}
		});
		System.out.println("Posição atual dos Personagens:");
		System.out.println(personagens);
		
	}
}
