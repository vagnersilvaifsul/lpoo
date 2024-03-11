package controller;

import java.util.*;

import model.Modelo;

public class ModeloController {
	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//constrói duas instâncias da classe utilizando o construtor padrão
		Modelo modelo1 = new Modelo(); //utilizando o construtor padrão
		Modelo modelo2 = new Modelo();

		//1c-ii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
		Modelo modelo3 = new Modelo(3, "Uno branco 4p"); //utilizando o construtor parametrizado
		Modelo modelo4 = new Modelo(4, "Uno azul 4p"); //utilizando o construtor parametrizado

		//1c-iii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
		Modelo modelo5 = new Modelo("Ka preto 4p");
		Modelo modelo6 = new Modelo("Ka branco 4p");

		//1c-iv
		//imprime todas instâncias (todos os objetos)
		System.out.println("Modelos criados com os contrutores padrão e parametrizado");
		System.out.println(modelo1); //criado com um contrutor padrão
		System.out.println(modelo2); //criado com um contrutor padrão
		System.out.println(modelo3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(modelo4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(modelo5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(modelo6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v
		//alterando o estado dos objetos na memória RAM utilizando setters
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		modelo1.setId(1);
		modelo1.setDescricao("Fox preto 4p");
		modelo2.setId(2);
		modelo2.setDescricao("Fox branco 4p");

		modelo3.setId(3);
		modelo3.setDescricao("C3 preto 4p");
		modelo4.setId(4);
		modelo4.setDescricao("C3 branco 4p");

		modelo5.setId(5);
		modelo5.setDescricao("208 preto 4p");
		modelo5.setId(6);
		modelo5.setDescricao("208 branco 4p");

		//1c-vi
		System.out.println(modelo3.getId());
		System.out.println(modelo3.getDescricao());
		System.out.println(modelo4.getId());
		System.out.println(modelo4.getDescricao());

		System.out.println(modelo5.getId());
		System.out.println(modelo5.getDescricao());
		System.out.println(modelo6.getId());
		System.out.println(modelo6.getDescricao());


		//---------------- Respostas da Questão 2 ----------------
		//2a ao h para coleção do tipo List
		//coleção do tipo List
		List<Modelo> modelosList = new ArrayList<>(); //2a
		modelosList.add(modelo1); //2d
		modelosList.add(modelo2); //2d
		modelosList.add(modelo3); //2d
		modelosList.add(modelo4); //2d
		modelosList.add(modelo5); //2d
		modelosList.add(modelo6); //2d
		System.out.println("\nColeção do tipo List\n" + modelosList); //2e

		//2f
		//ordenando a coleçao do tipo List
		System.out.println();
		modelosList.sort(Comparator.comparing(Modelo::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(modelosList);

		//2g
		//Pesquisa por força bruta
		for(Modelo modelo : modelosList){
			if(modelo.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Modelo de id=3");
				System.out.print(modelo);
			}
		}

		//2h
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Modelo modeloFind = modelosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(modeloFind);

		//2h
		//Método utilizando o método binarySearch da classe Collections
		System.out.println();
		System.out.print("\nLocalizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		modelosList.sort(Comparator.comparing(Modelo::getId)); //ordena ascendente, conforme exigido na documentação
		modeloFind = modelosList.get(
			Collections.binarySearch(
				modelosList,
				modelo3,
				Comparator.comparing(Modelo::getId)
			)
		);
		System.out.println(modeloFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Modelo> modelosMap = new HashMap<>(); //2a
		modelosMap.put(modelo1.getId(), modelo1); //2d
		modelosMap.put(modelo3.getId(), modelo3); //2d
		modelosMap.put(modelo3.getId(), modelo3); //2d
		modelosMap.put(modelo4.getId(), modelo4); //2d
		modelosMap.put(modelo5.getId(), modelo5); //2d
		System.out.println("\nColeção do tipo Map\n" + modelosMap); //2e

		//2f
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

		//2g e h (Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(modelosMap.get(3));
	}

}
