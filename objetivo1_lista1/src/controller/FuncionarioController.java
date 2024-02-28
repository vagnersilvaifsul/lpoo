package controller;

import java.util.*;

import model.Funcionario;

public class FuncionarioController {

	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//constrói duas instâncias da classe utilizando o construtor padrão
		Funcionario funcionario1 = new Funcionario(); //utilizando o construtor padrão
		Funcionario funcionario2 = new Funcionario();

		//1c-ii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
		Funcionario funcionario3 = new Funcionario(3, "Ana", 3000.00); //utilizando o construtor parametrizado
		Funcionario funcionario4 = new Funcionario(4, "Rafael",4000.00); //utilizando o construtor parametrizado

		//1c-iii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
		Funcionario funcionario5 = new Funcionario(5, "João");
		Funcionario funcionario6 = new Funcionario(6, "Alice");

		//1c-iv
		//imprime todas instâncias (todos os objetos)
		System.out.println("Funcionarios criados com os contrutores padrão e parametrizado");
		System.out.println(funcionario1); //criado com um contrutor padrão
		System.out.println(funcionario2); //criado com um contrutor padrão
		System.out.println(funcionario3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(funcionario4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(funcionario5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(funcionario6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v
		//alterando o estado dos objetos na memória RAM utilizando setters
		/* Para facilitar o debug do código, todos os salários receberam o dobro */
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

		//1c-vi
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
		//2a ao h para coleção do tipo List
		//coleção do tipo List
		List<Funcionario> funcionarioList = new ArrayList<>(); //2a
		funcionarioList.add(funcionario1); //2d
		funcionarioList.add(funcionario2); //2d
		funcionarioList.add(funcionario3); //2d
		funcionarioList.add(funcionario4); //2d
		funcionarioList.add(funcionario5); //2d
		funcionarioList.add(funcionario6); //2d
		System.out.println("\nColeção do tipo List\n" + funcionarioList); //2e

		//2f
		//ordenando a coleçao do tipo List
		System.out.println();
		funcionarioList.sort(Comparator.comparing(Funcionario::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(funcionarioList);

		//2g
		//Pesquisa por força bruta
		for(Funcionario funcionario : funcionarioList){
			if(funcionario.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Funcionario de id=3");
				System.out.print(funcionario);
			}
		}

		//2h
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Funcionario FuncionarioFind = funcionarioList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(FuncionarioFind);

		//2h
		//Método utilizando o método binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		funcionarioList.sort(Comparator.comparing(Funcionario::getId)); //ordena ascendente, conforme exigido na documentação
		funcionarioList.get(
			Collections.binarySearch(
				funcionarioList,
				new Funcionario(3, "nao importa o valor"),
				Comparator.comparing(Funcionario::getId)
			)
		);
		System.out.println(FuncionarioFind);

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

		//2g e h (Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(funcionarioMap.get(3));
	}


}
