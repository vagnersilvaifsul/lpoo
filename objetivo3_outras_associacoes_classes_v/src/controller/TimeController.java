package controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import model.Atleta;
import model.Time;

public class TimeController {
	public static void main(String[] args) {
		//cria os atletas
		Atleta atleta1 = new Atleta(1L, "123.456.123-11", "Pedro", "Geromel",
				new GregorianCalendar(2000, 1, 2));
		Atleta atleta2 = new Atleta(2L, "456.456.123-11", "Aldemir", "Ferreira",
				new GregorianCalendar(2000, 1, 2));
		Atleta atleta3 = new Atleta(3L, "123.123.123-11", "Diego", "Souza",
				new GregorianCalendar(2000, 1, 2));
		//os adiciona em um array no controller
		List<Atleta> atletas = new ArrayList<>();
		atletas.add(atleta1);
		atletas.add(atleta2);
		atletas.add(atleta3);
		
		//cria o time
		Time timaco = new Time(1L, "Grêmio", "RS", atletas);
		//imprime os dados do time
		System.out.println("Melhor time do Brasil:");
		System.out.println(timaco);
		
		atletas.remove(atleta3);
		System.out.println("\n\nMelhor time do Brasil desfalcado:");
		System.out.println(timaco);
	
	}
}
