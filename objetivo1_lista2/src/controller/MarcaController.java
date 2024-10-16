package controller;

import java.util.*;

import model.Marca;

public class MarcaController {
	public static void main(String[] args) {

		//---------------- Respostas da Questão 1 ----------------
		//1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
		Marca marca1 = new Marca(); //utilizando o construtor padrão
		Marca marca2 = new Marca();

		//1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando um construtor parametrizado por todos os atributos da classe de modelo;
		Marca marca3 = new Marca(3, "Fiat branco 4p"); //utilizando o construtor parametrizado
		Marca marca4 = new Marca(4, "Fiat azul 4p"); //utilizando o construtor parametrizado

		//1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
		Marca marca5 = new Marca("Ford preto 4p");
		Marca marca6 = new Marca("Ford branco 4p");

		//1c-iv. Imprima todos os objetos criados com os construtores, nos itens i, ii e iii, utilizando o método toString();
		//imprime todas instâncias (todos os objetos)
		System.out.println("Marcas criados com os contrutores padrão e parametrizado");
		System.out.println(marca1); //criado com um contrutor padrão
		System.out.println(marca2); //criado com um contrutor padrão
		System.out.println(marca3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(marca4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(marca5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(marca6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v.	Agora utilize os métodos setters de cada classe de modelo para alterar o estado de cada objeto na memória RAM;
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		marca1.setId(1);
		marca1.setDescricao("Volksvagen preto 4p");
		marca2.setId(2);
		marca2.setDescricao("Volksvagen branco 4p");
		
		marca3.setId(3);
		marca3.setDescricao("Citroen preto 4p");
		marca4.setId(4);
		marca4.setDescricao("Citroen branco 4p");
		
		marca5.setId(5);
		marca5.setDescricao("Peugeot preto 4p");
		marca5.setId(6);
		marca5.setDescricao("Peugeot branco 4p");

		//1c-vi Imprima todos objetos novamente, só que agora, ao invés de utilizar o método toString(), utilize os método getters.
		System.out.println(marca3.getId());
		System.out.println(marca3.getDescricao());
		System.out.println(marca4.getId());
		System.out.println(marca4.getDescricao());

		System.out.println(marca5.getId());
		System.out.println(marca5.getDescricao());
		System.out.println(marca6.getId());
		System.out.println(marca6.getDescricao());


		//---------------- Respostas da Questão 2 ----------------
		//Para coleção do tipo List
		//2a. Nos controladores criados no exercício 1 adicione dois objetos do tipo coleção, um do tipo LIST, outro do tipo Map;
		List<Marca> marcasList = new ArrayList<>(); //2a
		marcasList.add(marca1); //2d
		marcasList.add(marca2); //2d
		marcasList.add(marca3); //2d
		marcasList.add(marca4); //2d
		marcasList.add(marca5); //2d
		marcasList.add(marca6); //2d
		System.out.println("\nColeção do tipo List\n" + marcasList); //2e

		//2b e 2c estão na classe de modelo (a ideia aqui é que vocês se familiarizem em ter que dar manutenção nas classes de modelo)

		//2f. Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
		System.out.println();
		marcasList.sort(Comparator.comparing(Marca::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(marcasList);

		//2g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
		//Pesquisa por força bruta
		for(Marca marca : marcasList){
			if(marca.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Marca de id=3");
				System.out.print(marca);
			}
		}

		//2h. Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
		//Método utilizando o binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o Marca pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		marcasList.sort(Comparator.comparing(Marca::getId)); //1. Primeiro se ordena na forma crescente, conforme exigido na documentação do Java
		System.out.println(marcasList.get( //2. Obtém um objeto baseado no íncice dele na coleção
				Collections.binarySearch( //3. Faz a pesquisa binária
						marcasList,  //3a. Define qual a coleção vai ser ordenada
						marca3,  //3b. Define qual será a chave de pesquisa
						Comparator.comparing(Marca::getId) //3c. Define qual será o critério de comparação
				)
		));

		//2h (outra forma de resolver, utilizando programação funcional)
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Marca pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Marca narcaFind = marcasList.stream()
				.filter(c -> c.getId() == 3)
				.findAny()
				.orElse(null);
		System.out.println(narcaFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Marca> marcasMap = new HashMap<>(); //2a
		marcasMap.put(marca1.getId(), marca1); //2d
		marcasMap.put(marca3.getId(), marca3); //2d
		marcasMap.put(marca3.getId(), marca3); //2d
		marcasMap.put(marca4.getId(), marca4); //2d
		marcasMap.put(marca5.getId(), marca5); //2d
		System.out.println("\nColeção do tipo Map\n" + marcasMap); //2e

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
		System.out.print("Localizando o Marca pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(marcasMap.get(3));
	}

}
