package controller;

import java.time.LocalDateTime;
import java.util.*;

import model.Locacao;

public class LocacaoController {
	public static void main(String[] args) {

		//---------------- Respostas da Questão 1 ----------------
		//1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
		Locacao locacao1 = new Locacao(); //utilizando o construtor padrão
		Locacao locacao2 = new Locacao();

		//1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando um construtor parametrizado por todos os atributos da classe de modelo;
		Locacao locacao3 = new Locacao(3, LocalDateTime.of(2021, 2, 10, 10, 0), LocalDateTime.of(2021, 2, 15, 10, 0), 200, 30.00, 30.00, false); //utilizando o construtor parametrizado
		Locacao locacao4 = new Locacao(4, LocalDateTime.of(2023, 2, 10, 10, 0), LocalDateTime.of(2023, 2, 15, 10, 0), 200, 40.00, 40.00, false); //utilizando o construtor parametrizado

		//1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
		Locacao locacao5 = new Locacao(5, false);
		Locacao locacao6 = new Locacao(6, false);

		//1c-iv. Imprima todos os objetos criados com os construtores, nos itens i, ii e iii, utilizando o método toString();
		//imprime todas instâncias (todos os objetos)
		System.out.println("Locacaos criados com os contrutores padrão e parametrizado");
		System.out.println(locacao1); //criado com um contrutor padrão
		System.out.println(locacao2); //criado com um contrutor padrão
		System.out.println(locacao3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(locacao4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(locacao5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(locacao6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v.	Agora utilize os métodos setters de cada classe de modelo para alterar o estado de cada objeto na memória RAM;
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		locacao1.setId(1);
		locacao1.setDataLocacao(LocalDateTime.of(2021, 1, 10, 10, 0));
		locacao1.setDataDevolucao(LocalDateTime.of(2021, 1, 11, 11, 0));
		locacao1.setQuilometragem(100);
		locacao1.setValorCalcao(100);
		locacao1.setValorLocacao(100);
		locacao1.setDevolvido(true);
		locacao2.setId(1);
		locacao2.setDataLocacao(LocalDateTime.of(2022, 2, 12, 10, 0));
		locacao2.setDataDevolucao(LocalDateTime.of(2022, 1, 13, 11, 0));
		locacao2.setQuilometragem(200);
		locacao2.setValorCalcao(200);
		locacao2.setValorLocacao(200);
		locacao2.setDevolvido(true);

		locacao3.setId(3);
		locacao3.setDataLocacao(LocalDateTime.of(2023, 3, 13, 10, 0));
		locacao3.setDataDevolucao(LocalDateTime.of(2021, 3, 14, 11, 0));
		locacao3.setQuilometragem(300);
		locacao3.setValorCalcao(300);
		locacao3.setValorLocacao(300);
		locacao3.setDevolvido(true);
		locacao4.setId(4);
		locacao4.setDataLocacao(LocalDateTime.of(2024, 4, 14, 10, 0));
		locacao4.setDataDevolucao(LocalDateTime.of(2024, 4, 15, 11, 0));
		locacao4.setQuilometragem(400);
		locacao4.setValorCalcao(400);
		locacao4.setValorLocacao(400);
		locacao4.setDevolvido(true);

		/* Note que, mesmo tendo construído com apenas três argumento estes objetos, é possível usar o setter para alterar todos os atributos dos objetos. */
		locacao5.setId(1);
		locacao5.setDataLocacao(LocalDateTime.of(2015, 5, 15, 10, 0));
		locacao5.setDataDevolucao(LocalDateTime.of(2015, 5, 16, 11, 0));
		locacao5.setQuilometragem(500);
		locacao5.setValorCalcao(500);
		locacao5.setValorLocacao(500);
		locacao5.setDevolvido(true);
		locacao6.setId(6);
		locacao6.setDataLocacao(LocalDateTime.of(2016, 6, 16, 10, 0));
		locacao6.setDataDevolucao(LocalDateTime.of(2016, 6, 17, 11, 0));
		locacao6.setQuilometragem(600);
		locacao6.setValorCalcao(600);
		locacao6.setValorLocacao(600);
		locacao6.setDevolvido(true);

		//1c-vi Imprima todos objetos novamente, só que agora, ao invés de utilizar o método toString(), utilize os método getters.
		System.out.println(locacao1.getId());
		System.out.println(locacao1.getDataLocacao());
		System.out.println(locacao1.getDataDevolucao());
		System.out.println(locacao1.getQuilometragem());
		System.out.println(locacao1.getValorCalcao());
		System.out.println(locacao1.getValorLocacao());
		System.out.println(locacao1.isDevolvido());
		System.out.println(locacao2.getId());
		System.out.println(locacao2.getDataLocacao());
		System.out.println(locacao2.getDataDevolucao());
		System.out.println(locacao2.getQuilometragem());
		System.out.println(locacao2.getValorCalcao());
		System.out.println(locacao2.getValorLocacao());
		System.out.println(locacao2.isDevolvido());

		System.out.println(locacao3.getId());
		System.out.println(locacao3.getDataLocacao());
		System.out.println(locacao3.getDataDevolucao());
		System.out.println(locacao3.getQuilometragem());
		System.out.println(locacao3.getValorCalcao());
		System.out.println(locacao3.getValorLocacao());
		System.out.println(locacao3.isDevolvido());
		System.out.println(locacao4.getId());
		System.out.println(locacao4.getDataLocacao());
		System.out.println(locacao4.getDataDevolucao());
		System.out.println(locacao4.getQuilometragem());
		System.out.println(locacao4.getValorCalcao());
		System.out.println(locacao4.getValorLocacao());
		System.out.println(locacao4.isDevolvido());

		System.out.println(locacao5.getId());
		System.out.println(locacao5.getDataLocacao());
		System.out.println(locacao5.getDataDevolucao());
		System.out.println(locacao5.getQuilometragem());
		System.out.println(locacao5.getValorCalcao());
		System.out.println(locacao5.getValorLocacao());
		System.out.println(locacao5.isDevolvido());
		System.out.println(locacao6.getId());
		System.out.println(locacao6.getDataLocacao());
		System.out.println(locacao6.getDataDevolucao());
		System.out.println(locacao6.getQuilometragem());
		System.out.println(locacao6.getValorCalcao());
		System.out.println(locacao6.getValorLocacao());
		System.out.println(locacao6.isDevolvido());


		//---------------- Respostas da Questão 2 ----------------
		//Para coleção do tipo List
		//2a. Nos controladores criados no exercício 1 adicione dois objetos do tipo coleção, um do tipo LIST, outro do tipo Map;
		List<Locacao> locacaosList = new ArrayList<>(); //2a
		locacaosList.add(locacao1); //2d
		locacaosList.add(locacao2); //2d
		locacaosList.add(locacao3); //2d
		locacaosList.add(locacao4); //2d
		locacaosList.add(locacao5); //2d
		locacaosList.add(locacao6); //2d
		System.out.println("\nColeção do tipo List\n" + locacaosList); //2e

		//2b e 2c estão na classe de modelo (a ideia aqui é que vocês se familiarizem em ter que dar manutenção nas classes de modelo)

		//2f. Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
		System.out.println();
		locacaosList.sort(Comparator.comparing(Locacao::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(locacaosList);

		//2g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
		//Pesquisa por força bruta
		for(Locacao locacao : locacaosList){
			if(locacao.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Locacao de id=3");
				System.out.print(locacao);
			}
		}

		//2h. Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
		//Método utilizando o binarySearch da classe Collections
		System.out.print("Localizando o Locacao pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		locacaosList.sort(Comparator.comparing(Locacao::getId)); //1. Primeiro se ordena na forma crescente, conforme exigido na documentação do Java
		System.out.println(locacaosList.get( //2. Obtém um objeto baseado no íncice dele na coleção
				Collections.binarySearch( //3. Faz a pesquisa binária
						locacaosList,  //3a. Define qual a coleção vai ser ordenada
						locacao3, //3b. Define qual será a chave de pesquisa
						Comparator.comparing(Locacao::getId) //3c. Define qual será o critério de comparação
				)
		));

		//2h (outra forma de resolver, utilizando programação funcional)
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Locacao pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Locacao locacaoFind = locacaosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(locacaoFind);


		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Locacao> locacaosMap = new HashMap<>(); //2a
		locacaosMap.put(locacao1.getId(), locacao1); //2d
		locacaosMap.put(locacao3.getId(), locacao3); //2d
		locacaosMap.put(locacao3.getId(), locacao3); //2d
		locacaosMap.put(locacao4.getId(), locacao4); //2d
		locacaosMap.put(locacao5.getId(), locacao5); //2d
		System.out.println("\nColeção do tipo Map\n" + locacaosMap); //2e

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
		System.out.print("Localizando o Locacao pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(locacaosMap.get(3));
	}
	
}
