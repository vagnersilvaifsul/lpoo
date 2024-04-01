package controller;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

public class GameAnimalController {

	public static void main(String[] args) {
		//1b Utiliza o Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
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
		System.out.print("(Resposta 1b) Lista de animais criada:");
		System.out.println(animais);

		//1c
		System.out.print("\n\n(Resposta 1c) Animais movidos para a coordenada x=2.0 e y=2.0");
		animais.forEach(a -> {
			a.mover(2.0, 2.0); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
			a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
			System.out.print(a);
		});
		
		//1d
		System.out.print("\n\n(Resposta 1d) Animais da classe Cachorro movidos para a coordenada x=8.0 e y=8.0");
		animais.forEach(a -> {
			if(a instanceof Cachorro) {
				a.mover(8.0, 8.0); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
				a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
				System.out.print(a);
			}
		});
		
		//1e
		System.out.print("\n\n(Resposta d) Animais da classe Peixe e Passaro movidos para a coordenada x=5.0, y=5.0, z=5.0");
		animais.forEach(a -> {
			if(a instanceof Peixe) {
				//((Peixe) a) faz um Downcasting da classe Animal para a classe Peixe, assim tem acesso ao método mover com três argumentos
				((Peixe) a).mover(5.0, 5.0, 5.0); //chama o método mover() específico da classe Peixe (que não sobreescreve o mover da superclasse, pois tem outra assintaura)
				a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
				System.out.print(a);
			} else if(a instanceof Passaro) {
				if(a instanceof Passaro) {
					//((Passaro) a) faz um Downcasting da classe Animal para a classe Passaro, assim tem acesso ao método mover com três argumentos
					((Passaro) a).mover(5.0, 5.0, 5.0); //chama o método mover() específico da classe Passaro (que não sobreescreve o mover da superclasse, pois tem outra assintaura)
					a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
					System.out.print(a);
				}
			}
		});

	}

}
