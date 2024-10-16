package controller;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

public class GameAnimalController {

	public static void main(String[] args) {
		//1a. Está nas clases do pacote model e na estrutura de pacotes do projeto.

		//1b. Crie três instâncias de cada classe do diagrama (das possíveis), com valores válidos para os seus atributos. Insira-os em uma coleção do tipo List e os imprima.
		// Utiliza o Polimorfismo Ad Hoc - Overloading (ou sobrecarga). Isto é, os objetos são construídos de poli(muitas) morfo(formas)
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
		System.out.println("******** Questão 1b ********");
		System.out.print("(Resposta 1b) Lista de animais criada:");
		System.out.println(animais);

		//1c. Percorra a coleção e faça com que os personagens sejam posicionados nas coordenadas (2, 2), os desenhe e imprima-os;
		System.out.print("\n\n******** Questão 1c ********");
		System.out.print("\n(Resposta 1c) Animais movidos para a coordenada x=2.0 e y=2.0");
		animais.forEach(a -> {
			a.mover(2.0, 2.0); //utiliza o Polimorfismo Universal (ou sobreescrita)
			a.desenhar(); //utiliza o Polimorfismo Universal (ou sobreescrita)
			System.out.print(a);
		});
		
		//1d Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8), os desenhe e imprima-os;
		System.out.print("\n\n******** Questão 1d ********");
		System.out.print("\n(Resposta 1d) Animais da classe Cachorro movidos para a coordenada x=8.0 e y=8.0");
		animais.forEach(a -> {
			if(a instanceof Cachorro) {
				a.mover(8.0, 8.0); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
				a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
				System.out.print(a);
			}
		});
		
		//1e Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenadas (5, 5, 5), os desenhe e imprima-os.
		System.out.print("\n\n******** Questão 1e ********");
		System.out.print("\n(Resposta d) Animais da classe Peixe e Passaro movidos para a coordenada x=5.0, y=5.0, z=5.0");
		animais.forEach(a -> {
			if(a instanceof Peixe) {
				//((Peixe) a) faz um Downcasting da classe Animal para a classe Peixe, assim tem acesso ao método mover com três argumentos
				((Peixe) a).mover3D(5.0, 5.0, 5.0); //chama o método mover() específico da classe Peixe (que não sobreescreve o mover da superclasse, pois tem outra assintaura)
				a.desenhar(); //utiliza o Polimorfismo Universal (ou sobreescrita)
				System.out.print(a);
			} else if(a instanceof Passaro) {
				if(a instanceof Passaro) {
					//((Passaro) a) faz um Downcasting da classe Animal para a classe Passaro, assim tem acesso ao método mover com três argumentos
					((Passaro) a).mover3D(5.0, 5.0, 5.0); //chama o método mover() específico da classe Passaro (que não sobreescreve o mover da superclasse, pois tem outra assintaura)
					a.desenhar(); //utiliza o Polimorfismo Universal (ou sobreescrita)
					System.out.print(a);
				}
			}
		});

	}

}
