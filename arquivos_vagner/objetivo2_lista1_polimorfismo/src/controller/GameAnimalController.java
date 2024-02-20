package controller;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

public class GameAnimalController {

	public static void main(String[] args) {
		//a
		Peixe pei1 = new Peixe(1.0, 1.0);
		Peixe pei2 = new Peixe(1.0, 1.0);
		Peixe pei3 = new Peixe(1.0, 1.0);
		Cachorro cah1 = new Cachorro(2.0, 2.0);
		Cachorro cah2 = new Cachorro(2.0, 2.0);
		Cachorro cah3 = new Cachorro(2.0, 2.0);
		Passaro pas1 = new Passaro(3.0, 3.0);
		Passaro pas2 = new Passaro(3.0, 3.0);
		Passaro pas3 = new Passaro(3.0, 3.0);
		List<Animal> animais = new ArrayList<>();
		animais.add(pei1);
		animais.add(pei2);
		animais.add(pei3);
		animais.add(cah1);
		animais.add(cah2);
		animais.add(cah3);
		animais.add(pas1);
		animais.add(pas2);
		animais.add(pas3);
		System.out.print("(Resposta a) Lista de animais criada:");
		System.out.println(animais);
		
		//b
		System.out.print("\n\n(Resposta b) Animais movidos para a coordenada x=2.0 e y=2.0");
		animais.forEach(a -> {
			a.mover(2.0, 2.0);
			a.desenhar();
			System.out.print(a);
		});
		
		//c
		System.out.print("\n\n(Resposta c) Animais da classe Cachorro movidos para a coordenada x=8.0 e y=8.0");
		animais.forEach(a -> {
			if(a instanceof Cachorro) {
				a.mover(8.0, 8.0);
				a.desenhar();
				System.out.print(a);
			}
		});
		
		//d
		System.out.print("\n\n(Resposta d) Animais da classe Peixe e Passaro movidos para a coordenada x=5.0, y=5.0, z=5.0");
		animais.forEach(a -> {
			if(a instanceof Peixe) {
				((Peixe) a).mover(5.0, 5.0, 5.0);
				a.desenhar();
				System.out.print(a);
			} else if(a instanceof Passaro) {
				if(a instanceof Passaro) {
					((Passaro) a).mover(5.0, 5.0, 5.0);
					a.desenhar();
					System.out.print(a);
				}
			}
		});

	}

}
