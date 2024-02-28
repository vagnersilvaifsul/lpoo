package controller;

import java.util.*;

import model.Carro;
import model.Funcionario;

public class CarroController {
	public static void main(String[] args) {

		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//constrói duas instâncias da classe utilizando o construtor padrão
		Carro carro1 = new Carro(); //utilizando o construtor padrão
		Carro carro2 = new Carro();

		//1c-ii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
		Carro carro3 = new Carro(2, "Fiat", "Uno", 2000); //utilizando o construtor parametrizado
		Carro carro4 = new Carro(4, "Fiat", "Pálio", 2010); //utilizando o construtor parametrizado

		//1c-iii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
		Carro carro5 = new Carro(5, "Ford", "Ka");
		Carro carro6 = new Carro(6, "Ford", "Fiesta");

		//1c-iv
		//imprime todas instâncias (todos os objetos)
		System.out.println("Carros criados com os contrutores padrão e parametrizado");
		System.out.println(carro1); //criado com um contrutor padrão
		System.out.println(carro2); //criado com um contrutor padrão
		System.out.println(carro3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(carro4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(carro5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(carro6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v
		//alterando o estado dos objetos na memória RAM utilizando setters
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

		//1c-vi
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
		//2a ao h para coleção do tipo List
		//coleção do tipo List
		List<Carro> carrosList = new ArrayList<>(); //2a
		carrosList.add(carro1); //2d
		carrosList.add(carro2); //2d
		carrosList.add(carro3); //2d
		carrosList.add(carro4); //2d
		carrosList.add(carro5); //2d
		carrosList.add(carro6); //2d
		System.out.println("\nColeção do tipo List\n" + carrosList); //2e

		//2f
		//ordenando a coleçao do tipo List
		System.out.println();
		carrosList.sort(Comparator.comparing(Carro::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(carrosList);

		//2g
		//Pesquisa por força bruta
		for(Carro carro : carrosList){
			if(carro.getId() == 3){
				System.out.println("\nResultado da pesquisa pelo carro de id=3");
			}
		}

		//2h
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Carro carroFind = carrosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(carroFind);

		//2h
		//Método utilizando o método binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		carrosList.get(
			Collections.binarySearch(
				carrosList,
				new Carro(3, "nao importa o valor", "nao importa o valor"),
				Comparator.comparing(Carro::getId)
			)
		);
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

		//2g e h (Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(carrosMap.get(3));
	}
}
