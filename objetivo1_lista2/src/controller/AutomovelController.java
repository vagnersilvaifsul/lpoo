package controller;

import java.util.*;

import model.Automovel;

public class AutomovelController {
	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//constrói duas instâncias da classe utilizando o construtor padrão
		Automovel automovel1 = new Automovel(); //utilizando o construtor padrão
		Automovel automovel2 = new Automovel();

		//1c-ii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
		//note que o atributo identificador é do tipo String (o renavan)
		Automovel automovel3 = new Automovel("3", "III-3333", "branco", 4, "Flex", 3000, "chassi-abc333", 30.00); //utilizando o construtor parametrizado
		Automovel automovel4 = new Automovel("4", "IVV-4444", "preto", 4, "Flex", 4000, "chassi-abc444", 40.00); //utilizando o construtor parametrizado

		//1c-iii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
		Automovel automovel5 = new Automovel("5", "Ka preto 4p");
		Automovel automovel6 = new Automovel("6","Ka branco 4p");

		//1c-iv
		//imprime todas instâncias (todos os objetos)
		System.out.println("Automovels criados com os contrutores padrão e parametrizado");
		System.out.println(automovel1); //criado com um contrutor padrão
		System.out.println(automovel2); //criado com um contrutor padrão
		System.out.println(automovel3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(automovel4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(automovel5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(automovel6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v
		//alterando o estado dos objetos na memória RAM utilizando setters
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		automovel1.setRenavan("1");
		automovel1.setPlaca("IAA-1111");
		automovel1.setCor("Branco");
		automovel1.setNum_rodas(4);
		automovel1.setCombustivel("flex");
		automovel1.setQuilometragem(1000);
		automovel1.setChassi("chassi-abc111");
		automovel1.setValor_locacao(10.00);
		automovel2.setRenavan("2");
		automovel2.setPlaca("IBB-2222");
		automovel2.setCor("Prata");
		automovel2.setNum_rodas(4);
		automovel2.setCombustivel("flex");
		automovel2.setQuilometragem(2000);
		automovel2.setChassi("chassi-abc222");
		automovel2.setValor_locacao(20.00);

		automovel3.setRenavan("3");
		automovel3.setPlaca("ICC-3333");
		automovel3.setCor("Branco");
		automovel3.setNum_rodas(4);
		automovel3.setCombustivel("flex");
		automovel3.setQuilometragem(3000);
		automovel3.setChassi("chassi-abc333");
		automovel3.setValor_locacao(30.00);
		automovel4.setRenavan("4");
		automovel4.setPlaca("IDD-4444");
		automovel4.setCor("Prata");
		automovel4.setNum_rodas(4);
		automovel4.setCombustivel("flex");
		automovel4.setQuilometragem(4000);
		automovel4.setChassi("chassi-abc444");
		automovel4.setValor_locacao(40.00);

		automovel5.setRenavan("5");
		automovel5.setPlaca("IEE-5555");
		automovel5.setCor("Branco");
		automovel5.setNum_rodas(4);
		automovel5.setCombustivel("flex");
		automovel5.setQuilometragem(5000);
		automovel5.setChassi("chassi-abc555");
		automovel5.setValor_locacao(50.00);
		automovel6.setRenavan("6");
		automovel6.setPlaca("IDD-6666");
		automovel6.setCor("Prata");
		automovel6.setNum_rodas(4);
		automovel6.setCombustivel("flex");
		automovel6.setQuilometragem(6000);
		automovel6.setChassi("chassi-abc666");
		automovel6.setValor_locacao(60.00);

		//1c-vi
		System.out.println(automovel1.getRenavan());
		System.out.println(automovel1.getPlaca());
		System.out.println(automovel1.getCor());
		System.out.println(automovel1.getNum_rodas());
		System.out.println(automovel1.getCombustivel());
		System.out.println(automovel1.getQuilometragem());
		System.out.println(automovel1.getChassi());
		System.out.println(automovel2.getValor_locacao());
		System.out.println(automovel2.getRenavan());
		System.out.println(automovel2.getPlaca());
		System.out.println(automovel2.getCor());
		System.out.println(automovel2.getNum_rodas());
		System.out.println(automovel2.getCombustivel());
		System.out.println(automovel2.getQuilometragem());
		System.out.println(automovel2.getChassi());
		System.out.println(automovel2.getValor_locacao());



		System.out.println(automovel3.getRenavan());
		System.out.println(automovel3.getPlaca());
		System.out.println(automovel3.getCor());
		System.out.println(automovel3.getNum_rodas());
		System.out.println(automovel3.getCombustivel());
		System.out.println(automovel3.getQuilometragem());
		System.out.println(automovel3.getChassi());
		System.out.println(automovel3.getValor_locacao());
		System.out.println(automovel4.getRenavan());
		System.out.println(automovel4.getPlaca());
		System.out.println(automovel4.getCor());
		System.out.println(automovel4.getNum_rodas());
		System.out.println(automovel4.getCombustivel());
		System.out.println(automovel4.getQuilometragem());
		System.out.println(automovel4.getChassi());
		System.out.println(automovel4.getValor_locacao());

		System.out.println(automovel5.getRenavan());
		System.out.println(automovel5.getPlaca());
		System.out.println(automovel5.getCor());
		System.out.println(automovel5.getNum_rodas());
		System.out.println(automovel5.getCombustivel());
		System.out.println(automovel5.getQuilometragem());
		System.out.println(automovel5.getChassi());
		System.out.println(automovel5.getValor_locacao());
		System.out.println(automovel6.getRenavan());
		System.out.println(automovel6.getPlaca());
		System.out.println(automovel6.getCor());
		System.out.println(automovel6.getNum_rodas());
		System.out.println(automovel6.getCombustivel());
		System.out.println(automovel6.getQuilometragem());
		System.out.println(automovel6.getChassi());
		System.out.println(automovel6.getValor_locacao());


		//---------------- Respostas da Questão 2 ----------------
		//2a ao h para coleção do tipo List
		//coleção do tipo List
		List<Automovel> automovelsList = new ArrayList<>(); //2a
		automovelsList.add(automovel1); //2d
		automovelsList.add(automovel2); //2d
		automovelsList.add(automovel3); //2d
		automovelsList.add(automovel4); //2d
		automovelsList.add(automovel5); //2d
		automovelsList.add(automovel6); //2d
		System.out.println("\nColeção do tipo List\n" + automovelsList); //2e

		//2f
		//ordenando a coleçao do tipo List
		System.out.println();
		automovelsList.sort(Comparator.comparing(Automovel::getRenavan).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(automovelsList);

		//2g
		//Pesquisa por força bruta
		for(Automovel automovel : automovelsList){
			if(automovel.getRenavan().equals("3")){
				System.out.print("\nResultado da pesquisa pelo Automovel de id=3");
				System.out.print(automovel);
			}
		}

		//2h
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Automovel pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Automovel AutomovelFind = automovelsList.stream().filter(c -> c.getRenavan().equals("3")).findAny().orElse(null);
		System.out.println(AutomovelFind);

		//2h
		//Método utilizando o método binarySearch da classe Collections
		System.out.println();
		System.out.print("\nLocalizando o Automovel pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		automovelsList.sort(Comparator.comparing(Automovel::getRenavan)); //ordena ascendente, conforme exigido na documentação
		automovelsList.get(
			Collections.binarySearch(
				automovelsList,
				automovel3,
				Comparator.comparing(Automovel::getRenavan)
			)
		);
		System.out.println(AutomovelFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<String, Automovel> automovelsMap = new HashMap<>(); //2a
		automovelsMap.put(automovel1.getRenavan(), automovel1); //2d
		automovelsMap.put(automovel3.getRenavan(), automovel3); //2d
		automovelsMap.put(automovel3.getRenavan(), automovel3); //2d
		automovelsMap.put(automovel4.getRenavan(), automovel4); //2d
		automovelsMap.put(automovel5.getRenavan(), automovel5); //2d
		System.out.println("\nColeção do tipo Map\n" + automovelsMap); //2e

		//2f
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

		//2g e h (Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o Automovel pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(automovelsMap.get(3));
	}

}
