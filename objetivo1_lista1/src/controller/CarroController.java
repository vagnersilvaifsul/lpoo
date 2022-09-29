package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Carro;

public class CarroController {
	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Carro carro1 = new Carro(); //utilizando o construtor padrão
		Carro carro2 = new Carro(2, "Fiat", "Uno", 2000); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Carros criados com os contrutores padrão e parametrizado");
		System.out.println(carro1);
		System.out.println(carro2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Carro");
		carro1.setId(1);
		carro1.setMarca("Volkswagen");
		carro1.setModelo("Fox");
		carro1.setAnoFabricacao(2012);
		System.out.println(carro1.getId());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAnoFabricacao());
		
		System.out.println("\nInstância de Carro");
		carro2.setMarca("Renault");
		carro2.setModelo("Duster");
		carro2.setAnoFabricacao(2020);
		System.out.println(carro2.getId());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAnoFabricacao());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Carro carro3 = new Carro(3, "Fiat", "Uno", 2000);
		Carro carro4 = new Carro(4, "Ford", "Fiesta", 2010);
		Carro carro5 = new Carro(4, "Ford", "Fiesta", 2010);
		
		//coleção do tipo List
		List<Carro> carrosList = new ArrayList<>();
		carrosList.add(carro1);
		carrosList.add(carro2);
		carrosList.add(carro3);
		carrosList.add(carro4);
		carrosList.add(carro5);
		System.out.println("\nColeção do tipo List\n" + carrosList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Carro carroFind = carrosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(carroFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		carrosList.sort(Comparator.comparing(Carro::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(carrosList);
		
		//coleção do tipo Map
		Map<Integer, Carro> carrosMap = new HashMap<>();
		carrosMap.put(carro1.getId(), carro1);
		carrosMap.put(carro2.getId(), carro2);
		carrosMap.put(carro3.getId(), carro3);
		carrosMap.put(carro4.getId(), carro4);
		carrosMap.put(carro5.getId(), carro5);
		System.out.println("\nColeção do tipo Map\n" + carrosMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o carro pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(carrosMap.get(3));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

	}
}
