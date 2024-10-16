package controller;

import java.util.*;

import model.Conta;

public class ContaController {

	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
		Conta conta1 = new Conta(); //utilizando o construtor padrão
		Conta conta2 = new Conta();

		//1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando um construtor parametrizado por todos os atributos da classe de modelo;
		Conta conta3 = new Conta(3, 3000.00); //utilizando o construtor parametrizado
		Conta conta4 = new Conta(4, 4000.00); //utilizando o construtor parametrizado

		//1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
		Conta conta5 = new Conta(5000.00);
		Conta conta6 = new Conta(6000.00);

		//1c-iv. Imprima todos os objetos criados com os construtores, nos itens i, ii e iii, utilizando o método toString();
		//imprime todas instâncias (todos os objetos)
		System.out.println("Contas criados com os contrutores padrão e parametrizado");
		System.out.println(conta1); //criado com um contrutor padrão
		System.out.println(conta2); //criado com um contrutor padrão
		System.out.println(conta3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(conta4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(conta5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(conta6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v.	Agora utilize os métodos setters de cada classe de modelo para alterar o estado de cada objeto na memória RAM;
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		conta1.setId(1);
		conta1.deposita(2000.00);
		conta2.setId(2);
		conta2.deposita(4000.00);

		conta3.setId(3);
		conta3.deposita(5000.00);
		conta4.setId(4);
		conta4.deposita(8000.00);

		conta5.setId(6);
		conta5.deposita(10000.00);
		conta6.setId(6);
		conta6.deposita(12000.00);

		//1c-vi Imprima todos objetos novamente, só que agora, ao invés de utilizar o método toString(), utilize os método getters.
		System.out.println(conta1.getId());
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getId());
		System.out.println(conta2.getSaldo());

		System.out.println(conta3.getId());
		System.out.println(conta3.getSaldo());
		System.out.println(conta4.getId());
		System.out.println(conta4.getSaldo());

		System.out.println(conta5.getId());
		System.out.println(conta5.getSaldo());
		System.out.println(conta6.getId());
		System.out.println(conta6.getSaldo());

		//---------------- Respostas da Questão 2 ----------------
		//Para coleção do tipo List
		//2a. Nos controladores criados no exercício 1 adicione dois objetos do tipo coleção, um do tipo LIST, outro do tipo Map;
		List<Conta> contaList = new ArrayList<>(); //2a
		contaList.add(conta1); //2d
		contaList.add(conta2); //2d
		contaList.add(conta3); //2d
		contaList.add(conta4); //2d
		contaList.add(conta5); //2d
		contaList.add(conta6); //2d
		System.out.println("\nColeção do tipo List\n" + contaList); //2e

		//2b e 2c estão na classe de modelo (a ideia aqui é que vocês se familiarizem em ter que dar manutenção nas classes de modelo)

		//2f. Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
		System.out.println();
		contaList.sort(Comparator.comparing(Conta::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(contaList);

		//2g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
		//Pesquisa por força bruta
		for(Conta conta : contaList){
			if(conta.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Conta de id=3");
				System.out.print(conta);
			}
		}

		//2h. Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
		//Método utilizando o binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o Conta pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		contaList.sort(Comparator.comparing(Conta::getId)); //1. Primeiro se ordena na forma crescente, conforme exigido na documentação do Java
		System.out.println(
				contaList.get( //2. Obtém um objeto baseado no íncice dele na coleção
					Collections.binarySearch( //3. Faz a pesquisa binária
							contaList, //3a. Define qual a coleção vai ser ordenada
							new Conta(3, 0.0), //3b. Define qual será a chave de pesquisa
							Comparator.comparing(Conta::getId) //3c. Define qual será o critério de comparação
					)
		));

		//2h (outra forma de resolver, utilizando programação funcional)
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Conta pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Conta contaFind = contaList.stream()//1. Crie um Fluxo para a coleção
				.filter(c -> c.getId() == 3)//2. Filtre pelo predicado (uma função com uma lógica de filtro dentro)
				.findAny() //3. Procure na coleção qualquer objeto que corresponda ao filtro
				.orElse(null); //4. Se não achar, retorne null
		System.out.println(contaFind);



		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Conta> contasMap = new HashMap<>(); //2a
		contasMap.put(conta1.getId(), conta1); //2d
		contasMap.put(conta2.getId(), conta2); //2d
		contasMap.put(conta3.getId(), conta3); //2d
		contasMap.put(conta4.getId(), conta4); //2d
		contasMap.put(conta5.getId(), conta5); //2d
		System.out.println("\nColeção do tipo Map\n" + contasMap); //2e

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
		System.out.print("Localizando o Conta pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(contasMap.get(3));
	}

}
