package controller;

import java.util.*;

import model.Funcionario;

public class FuncionarioController {

	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
		Funcionario funcionario1 = new Funcionario(); //utilizando o construtor padrão
		Funcionario funcionario2 = new Funcionario();

		//1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando um construtor parametrizado por todos os atributos da classe de modelo;
		Funcionario funcionario3 = new Funcionario(3, "Ana", 3000.00); //utilizando o construtor parametrizado
		Funcionario funcionario4 = new Funcionario(4, "Rafael",4000.00); //utilizando o construtor parametrizado

		//1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de cada classe utilizando uma variação do construtor parametrizado;
		Funcionario funcionario5 = new Funcionario(5, "João");
		Funcionario funcionario6 = new Funcionario(6, "Alice");

		//1c-iv. Imprima todos os objetos criados com os construtores, nos itens i, ii e iii, utilizando o método toString();
		//imprime todas instâncias (todos os objetos)
		System.out.println("Funcionarios criados com os contrutores padrão e parametrizado");
		System.out.println(funcionario1); //criado com um contrutor padrão
		System.out.println(funcionario2); //criado com um contrutor padrão
		System.out.println(funcionario3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(funcionario4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(funcionario5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(funcionario6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v.	Agora utilize os métodos setters de cada classe de modelo para alterar o estado de cada objeto na memória RAM;
		funcionario1.setId(1);
		funcionario1.setNome("José");
		funcionario1.setSalario(2000.00);
		funcionario2.setId(2);
		funcionario2.setNome("Maria");
		funcionario2.setSalario(4000.00);


		funcionario3.setId(3);
		funcionario3.setNome("Patrícia");
		funcionario3.setSalario(6000.00);
		funcionario4.setId(4);
		funcionario4.setNome("Taís");
		funcionario4.setSalario(8000.00);

		/* Note que, mesmo tendo construído com apenas três argumento estes objetos, é possível usar o setter para alterar todos os atributos dos objetos. */
		funcionario5.setId(5);
		funcionario5.setNome("Denise");
		funcionario5.setSalario(10000.00);
		funcionario6.setId(6);
		funcionario6.setNome("Vitor");
		funcionario6.setSalario(12000.00);

		//1c-vi Imprima todos objetos novamente, só que agora, ao invés de utilizar o método toString(), utilize os método getters.
		System.out.println(funcionario1.getId());
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario2.getId());
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getSalario());

		System.out.println(funcionario3.getId());
		System.out.println(funcionario3.getNome());
		System.out.println(funcionario3.getSalario());
		System.out.println(funcionario4.getId());
		System.out.println(funcionario4.getNome());
		System.out.println(funcionario4.getSalario());

		System.out.println(funcionario5.getId());
		System.out.println(funcionario5.getNome());
		System.out.println(funcionario5.getSalario());
		System.out.println(funcionario6.getId());
		System.out.println(funcionario6.getNome());
		System.out.println(funcionario6.getSalario());


		//---------------- Respostas da Questão 2 ----------------
		//Para coleção do tipo List
		//2a. Nos controladores criados no exercício 1 adicione dois objetos do tipo coleção, um do tipo LIST, outro do tipo Map;
		List<Funcionario> funcionarioList = new ArrayList<>(); //2a
		funcionarioList.add(funcionario1); //2d
		funcionarioList.add(funcionario2); //2d
		funcionarioList.add(funcionario3); //2d
		funcionarioList.add(funcionario4); //2d
		funcionarioList.add(funcionario5); //2d
		funcionarioList.add(funcionario6); //2d
		System.out.println("\nColeção do tipo List\n" + funcionarioList); //2e

		//2b e 2c estão na classe de modelo (a ideia aqui é que vocês se familiarizem em ter que dar manutenção nas classes de modelo)

		//2f. Ordene a coleção em ordem decrescente, pelo critério id, e a imprima;
		System.out.println();
		funcionarioList.sort(Comparator.comparing(Funcionario::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(funcionarioList);

		//2g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
		//Pesquisa por força bruta
		for(Funcionario funcionario : funcionarioList){
			if(funcionario.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Funcionario de id=3");
				System.out.print(funcionario);
			}
		}

		//2h. Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
		//Método utilizando o binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		funcionarioList.sort(Comparator.comparing(Funcionario::getId));  //1. Primeiro se ordena na forma crescente, conforme exigido na documentação do Java
		System.out.println(funcionarioList.get( //2. Obtém um objeto baseado no íncice dele na coleção
				Collections.binarySearch( //3. Faz a pesquisa binária
						funcionarioList, //3a. Define qual a coleção vai ser ordenada
						new Funcionario(3, "nao importa o valor"), //3b. Define qual será a chave de pesquisa
						Comparator.comparing(Funcionario::getId) //3c. Define qual será o critério de comparação
				)
		));

		//2h (outra forma de resolver, utilizando programação funcional)
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Funcionario funcionarioFind = funcionarioList.stream() //1. Crie um Fluxo para a coleção
				.filter(c -> c.getId() == 3)//2. Filtre pelo predicado (uma função com uma lógica de filtro dentro)
				.findAny() //3. Procure na coleção qualquer objeto que corresponda ao filtro
				.orElse(null); //4. Se não achar, retorne null
		System.out.println(funcionarioFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Funcionario> funcionarioMap = new HashMap<>(); //2a
		funcionarioMap.put(funcionario1.getId(), funcionario1); //2d
		funcionarioMap.put(funcionario3.getId(), funcionario3); //2d
		funcionarioMap.put(funcionario3.getId(), funcionario3); //2d
		funcionarioMap.put(funcionario4.getId(), funcionario4); //2d
		funcionarioMap.put(funcionario5.getId(), funcionario5); //2d
		System.out.println("\nColeção do tipo Map\n" + funcionarioMap); //2e

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
		System.out.print("Localizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(funcionarioMap.get(3));
	}


}
