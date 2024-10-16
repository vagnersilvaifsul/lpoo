package controller;

import java.util.*;

import model.Modelo;

public class ModeloController {
	public static void main(String[] args) {

		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
		Modelo modelo1 = new Modelo(); //utilizando o construtor padrão
		Modelo modelo2 = new Modelo();

		//1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando um construtor parametrizado por todos os atributos da classe de modelo;
		Modelo modelo3 = new Modelo(3, "Uno branco 4p"); //utilizando o construtor parametrizado
		Modelo modelo4 = new Modelo(4, "Uno azul 4p"); //utilizando o construtor parametrizado

		//1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
		Modelo modelo5 = new Modelo("Ka preto 4p");
		Modelo modelo6 = new Modelo("Ka branco 4p");

		//1c-v.	Agora utilize os métodos setters de cada classe de modelo para alterar o estado de cada objeto na memória RAM;
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
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

		//1c-vi Imprima todos objetos novamente, só que agora, ao invés de utilizar o método toString(), utilize os método getters.
		System.out.println(modelo3.getId());
		System.out.println(modelo3.getDescricao());
		System.out.println(modelo4.getId());
		System.out.println(modelo4.getDescricao());

		System.out.println(modelo5.getId());
		System.out.println(modelo5.getDescricao());
		System.out.println(modelo6.getId());
		System.out.println(modelo6.getDescricao());


		//---------------- Respostas da Questão 2 ----------------
		//Para coleção do tipo List
		//2a. Nos controladores criados no exercício 1 adicione dois objetos do tipo coleção, um do tipo LIST, outro do tipo Map;
		List<Modelo> modelosList = new ArrayList<>(); //2a
		modelosList.add(modelo1); //2d
		modelosList.add(modelo2); //2d
		modelosList.add(modelo3); //2d
		modelosList.add(modelo4); //2d
		modelosList.add(modelo5); //2d
		modelosList.add(modelo6); //2d
		System.out.println("\nColeção do tipo List\n" + modelosList); //2e

		//2b e 2c estão na classe de modelo (a ideia aqui é que vocês se familiarizem em ter que dar manutenção nas classes de modelo)

		//2f. Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
		System.out.println();
		modelosList.sort(Comparator.comparing(Modelo::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(modelosList);

		//2g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
		//Pesquisa por força bruta
		for(Modelo modelo : modelosList){
			if(modelo.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Modelo de id=3");
				System.out.print(modelo);
			}
		}

		//2h. Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
		//Método utilizando o binarySearch da classe Collections
		System.out.println();
		System.out.print("\nLocalizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		modelosList.sort(Comparator.comparing(Modelo::getId)); //1. Primeiro se ordena na forma crescente, conforme exigido na documentação do Java
		System.out.println(modelosList.get( //2. Obtém um objeto baseado no íncice dele na coleção
				Collections.binarySearch(  //3. Faz a pesquisa binária
						modelosList, //3a. Define qual a coleção vai ser ordenada
						modelo3, //3b. Define qual será a chave de pesquisa
						Comparator.comparing(Modelo::getId) //3c. Define qual será o critério de comparação
				)
		));

		//2h (outra forma de resolver, utilizando programação funcional)
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Modelo modeloFind = modelosList.stream()
				.filter(c -> c.getId() == 3) //1. Crie um Fluxo para a coleção
				.findAny() //2. Filtre pelo predicado (uma função com uma lógica de filtro dentro)
				.orElse(null); //3. Procure na coleção qualquer objeto que corresponda ao filtro
		System.out.println(modeloFind); //4. Se não achar, retorne null

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

		//2g e h
		/*
			Note que não há o conceito de pesquisa por força bruta ou  binária em uma estrutura de dados do tipo Map.
			Essa é sua vantagem, velocidade para buscar ou salvar os objetos na coleção.
			Porém, sua desvantagem é não permitir a ordenação dos dodos.
		 */
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(modelosMap.get(3));
	}

}
