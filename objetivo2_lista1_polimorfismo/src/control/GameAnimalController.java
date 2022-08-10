package control;

import java.util.ArrayList;
import java.util.List;

import model.AnimalG;
import model.CachorroG;
import model.PassaroG;
import model.PeixeG;

public class GameAnimalController {

	public static void main(String[] args) {
		//a
		PeixeG pei1 = new PeixeG(1.0, 1.0);
		PeixeG pei2 = new PeixeG(1.0, 1.0);
		PeixeG pei3 = new PeixeG(1.0, 1.0);
		CachorroG cah1 = new CachorroG(2.0, 2.0);
		CachorroG cah2 = new CachorroG(2.0, 2.0);
		CachorroG cah3 = new CachorroG(2.0, 2.0);
		PassaroG pas1 = new PassaroG(3.0, 3.0);
		PassaroG pas2 = new PassaroG(3.0, 3.0);
		PassaroG pas3 = new PassaroG(3.0, 3.0);
		List<AnimalG> animais = new ArrayList<>();
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
		System.out.print("\n\n(Resposta c) Animais da classe CachorroG movidos para a coordenada x=8.0 e y=8.0");
		animais.forEach(a -> {
			if(a instanceof CachorroG) {
				a.mover(8.0, 8.0);
				a.desenhar();
				System.out.print(a);
			}
		});
		
		//d
		System.out.print("\n\n(Resposta d) Animais da classe PeixeG e PassaroG movidos para a coordenada x=5.0, y=5.0, z=5.0");
		animais.forEach(a -> {
			if(a instanceof PeixeG) {
				((PeixeG) a).mover(5.0, 5.0, 5.0);
				a.desenhar();
				System.out.print(a);
			} else if(a instanceof PassaroG) {
				if(a instanceof PassaroG) {
					((PassaroG) a).mover(5.0, 5.0, 5.0);
					a.desenhar();
					System.out.print(a);
				}
			}
		});

	}

}
