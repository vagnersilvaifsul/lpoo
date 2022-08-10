package control;

import java.util.ArrayList;
import java.util.List;

import model.Aviao;
import model.Navio;
import model.Personagem;
import model.Tanque;

public class GameController {
	
	public static void main(String[] args) {
		//1a. forma de se fazer polimorfismo
		//Note que cada personagem é criado com um tipo diferente de construtor
	    Aviao aviao1 = new Aviao();
	    Aviao aviao2 = new Aviao(1,1,1);
	    Navio navio1 = new Navio();
	    Navio navio2 = new Navio(2,2);
	    Tanque tanque1 = new Tanque();
	    Tanque tanque2 = new Tanque(3,3);

	    //2a. forma de se fazer polimorfismo
	    //Note que o tipo de List é Personagem, isto é, a superclasse do diagrama UML
	    //Note que List é uma interface que ArrayList implementa, logo, ela está acima na hierarquia. Aqui também se está usando o tipo genérico, 4a.forma de se fazer Polimorfismo 
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
	        p.desenhar(); //uma chamada, vários comportamentos em tempo de execução (usa a sobrescrita para isso, a 3a.forma de se fazer Polimorfismo)
	        if(p instanceof Aviao){ //chama um comportamento que só tem na subclasse (Exemplo do uso de instanceof)
	            ((Aviao)p).mover(2, 2, 2); //faz downcasting, isto é, sai de Personagem para Avião, e chama um comportamento da subclasse
	        } else if(p instanceof Navio){
	        	p.mover(4,4);
	        } else if(p instanceof Tanque) {
	        	p.mover(6,6);
	        }
	    });
	    System.out.println("\nNova posição dos Personagens:");
	    System.out.println(personagens);
	}
	
}
