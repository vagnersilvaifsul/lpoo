package controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import model.Atleta3V;
import model.Time3V;

public class TimeController3V {
	public static void main(String[] args) {
		//cria os atletas
		Atleta3V atleta1 = new Atleta3V(1L, "123.456.123-11", "Pedro", "Geromel", 
				new GregorianCalendar(2000, 1, 2));
		Atleta3V atleta2 = new Atleta3V(2L, "456.456.123-11", "Aldemir", "Ferreira", 
				new GregorianCalendar(2000, 1, 2));
		Atleta3V atleta3 = new Atleta3V(3L, "123.123.123-11", "Diego", "Souza", 
				new GregorianCalendar(2000, 1, 2));
		//os adiciona em um array no controller
		List<Atleta3V> atletas = new ArrayList<>();
		atletas.add(atleta1);
		atletas.add(atleta2);
		atletas.add(atleta3);
		
		//cria o time
		Time3V timaco = new Time3V(1L, "Grêmio", "RS", atletas);
		//imprime os dados do time
		System.out.println("Melhor time do Brasil:");
		System.out.println(timaco);
		
		atletas.remove(atleta3);
		System.out.println("\n\nMelhor time do Brasil desfalcado:");
		System.out.println(timaco);
	
	}
}
