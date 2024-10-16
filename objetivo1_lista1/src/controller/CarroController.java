package controller;

import java.util.*;

import model.Carro;

public class CarroController {
	public static void main(String[] args) {

		//---------------- Respostas da Questão 1 ----------------
		//1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
		Carro carro1 = new Carro(); //utilizando o construtor padrão
		Carro carro2 = new Carro();

		//1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando um construtor parametrizado por todos os atributos da classe de modelo;
		Carro carro3 = new Carro(2, "Fiat", "Uno", 2000); //utilizando o construtor parametrizado com todos os atributos da classe
		Carro carro4 = new Carro(4, "Fiat", "Pálio", 2010); //utilizando o construtor parametrizado com todos os atributos da classe

		//1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
		Carro carro5 = new Carro(5, "Ford", "Ka");
		Carro carro6 = new Carro(6, "Ford", "Fiesta");

		//1c-iv. Imprima todos os objetos criados com os construtores, nos itens i, ii e iii, utilizando o método toString();
		//imprime todas instâncias (todos os objetos)
		System.out.println("Carros criados com os contrutores padrão e parametrizado");
		System.out.println(carro1); //criado com um contrutor padrão
		System.out.println(carro2); //criado com um contrutor padrão
		System.out.println(carro3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(carro4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(carro5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(carro6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v.	Agora utilize os métodos setters de cada classe de modelo para alterar o estado de cada objeto na memória RAM;
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		carro1.setId(1);
		carro1.setMarca("Volksvagen");
		carro1.setModelo("Gol");
		carro1.setAnoFabricacao(1995);
		carro2.setId(2);
		carro2.setMarca("Volksvagen");
		carro2.setModelo("T-cross");
		carro2.setAnoFabricacao(2023);

		carro3.setId(3);
		carro3.setMarca("Volksvagen");
		carro3.setModelo("Gol");
		carro3.setAnoFabricacao(1995);
		carro4.setId(4);
		carro4.setMarca("Volksvagen");
		carro4.setModelo("T-cross");
		carro4.setAnoFabricacao(2023);

		/* Note que, mesmo tendo construído com apenas três argumento estes objetos, é possível usar o setter para alterar todos os atributos dos objetos. */
		carro5.setId(5);
		carro5.setMarca("Volksvagen");
		carro5.setModelo("Gol");
		carro5.setAnoFabricacao(1995);
		carro6.setId(6);
		carro6.setMarca("Volksvagen");
		carro6.setModelo("T-cross");
		carro6.setAnoFabricacao(2023);

		//1c-vi Imprima todos objetos novamente, só que agora, ao invés de utilizar o método toString(), utilize os método getters.
		System.out.println(carro1.getId());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAnoFabricacao());
		System.out.println(carro2.getId());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAnoFabricacao());

		System.out.println(carro3.getId());
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAnoFabricacao());
		System.out.println(carro4.getId());
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAnoFabricacao());

		System.out.println(carro5.getId());
		System.out.println(carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println(carro5.getAnoFabricacao());
		System.out.println(carro6.getId());
		System.out.println(carro6.getMarca());
		System.out.println(carro6.getModelo());
		System.out.println(carro6.getAnoFabricacao());


		//---------------- Respostas da Questão 2 ----------------
		//Para coleção do tipo List
		//2a. Nos controladores criados no exercício 1 adicione dois objetos do tipo coleção, um do tipo LIST, outro do tipo Map;
		List<Carro> carrosList = new ArrayList<>(); //2a
		carrosList.add(carro1); //2d
		carrosList.add(carro2); //2d
		carrosList.add(carro3); //2d
		carrosList.add(carro4); //2d
		carrosList.add(carro5); //2d
		carrosList.add(carro6); //2d
		System.out.println("\nColeção do tipo List\n" + carrosList); //2e

		//2b e 2c estão na classe de modelo (a ideia aqui é que vocês se familiarizem em ter que dar manutenção nas classes de modelo)

		//2f. Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
		System.out.println();
		carrosList.sort(Comparator.comparing(Carro::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(carrosList);

		//2g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
		//Pesquisa por força bruta
		for(Carro carro : carrosList){
			if(carro.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo carro de id=3");
				System.out.print(carro);
			}
		}

		//2h. Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
		//Método utilizando o binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		carrosList.sort(Comparator.comparing(Carro::getId)); //1. Primeiro se ordena na forma crescente, conforme exigido na documentação do Java
		System.out.println(
			carrosList.get( //2. Obtém um objeto baseado no íncice dele na coleção
				Collections.binarySearch( //3. Faz a pesquisa binária
					carrosList, //3a. Define qual a coleção vai ser ordenada
					new Carro(3, "nao importa o valor", "nao importa o valor"), //3b. Define qual será a chave de pesquisa
					Comparator.comparing(Carro::getId) //3c. Define qual será o critério de comparação
				)
		));

		//2h (outra forma de resolver, utilizando programação funcional)
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o carro pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Carro carroFind = carrosList.stream() //1. Crie um Fluxo para a coleção
				.filter(c -> c.getId() == 3) //2. Filtre pelo predicado (uma função com uma lógica de filtro dentro)
				.findAny() //3. Procure na coleção qualquer objeto que corresponda ao filtro
				.orElse(null); //4. Se não achar, retorne null
		System.out.println(carroFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Carro> carrosMap = new HashMap<>(); //2a
		carrosMap.put(carro1.getId(), carro1); //2d
		carrosMap.put(carro3.getId(), carro3); //2d
		carrosMap.put(carro3.getId(), carro3); //2d
		carrosMap.put(carro4.getId(), carro4); //2d
		carrosMap.put(carro5.getId(), carro5); //2d
		System.out.println("\nColeção do tipo Map\n" + carrosMap); //2e

		//2f
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

		//2g e h
		/*
			Note que não há o conceito de pesquisa por força bruta ou  binária em uma estrutura de dados do tipo Map.
			Essa é sua vantagem, velocidade para buscar ou salvar os objetos na coleção.
			Porém, sua desvantagem é não permitir a ordenação dos dodos.
		 */
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(carrosMap.get(3));
	}
}
