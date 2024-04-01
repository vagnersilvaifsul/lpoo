package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aviao;
import model.Navio;
import model.Personagem;
import model.Tanque;

public class GameController {
	
	public static void main(String[] args) {
		//Utiliza o Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	    Aviao aviao1 = new Aviao();
	    Aviao aviao2 = new Aviao(1,1,1);
	    Navio navio1 = new Navio();
	    Navio navio2 = new Navio(2,2);
	    Tanque tanque1 = new Tanque();
	    Tanque tanque2 = new Tanque(3,3);

	    List<Personagem> personagens = new ArrayList<>();
	    personagens.add(aviao1);
	    personagens.add(aviao2);
	    personagens.add(navio1);
	    personagens.add(navio2);
	    personagens.add(tanque1);
	    personagens.add(tanque2);
	    System.out.println("Posição Inicial dos Personagens:");
	    System.out.println(personagens);

	    personagens.forEach((p) -> {
	        p.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
	        if(p instanceof Aviao){ //chama um comportamento que só tem na subclasse (Exemplo do uso de instanceof)
	            ((Aviao)p).mover(2, 2, 2); //faz downcasting, isto é, sai de Personagem para Avião, e chama um comportamento da subclasse
	        } else if(p instanceof Navio){
	        	p.mover(4,4); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
	        } else if(p instanceof Tanque) {
	        	p.mover(6,6); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
	        }
	    });
	    System.out.println("\nNova posição dos Personagens:");
	    System.out.println(personagens);
	}
	
}
