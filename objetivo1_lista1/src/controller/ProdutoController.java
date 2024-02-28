package controller;

import java.util.*;

import model.Produto;


public class ProdutoController {
	
	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//constrói duas instâncias da classe utilizando o construtor padrão
		Produto produto1 = new Produto(); //utilizando o construtor padrão
		Produto produto2 = new Produto(); //utilizando o construtor padrão

		//1c-ii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
		Produto produto3 = new Produto(3, "Arroz", "Arroz Ceolin tipo 1 5kg", 21.90, 300); //utilizando o construtor parametrizado
		Produto produto4 = new Produto(4, "Feijão", "Feijão Tordilho tipo 1 1kg", 8.90, 400); //utilizando o construtor parametrizado

		//1c-iii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
		Produto produto5 = new Produto(5, "Batata");
		Produto produto6 = new Produto(6, "Cebola");

		//1c-iv
		//imprime todas instâncias (todos os objetos)
		System.out.println("Produtos criados com os contrutores padrão e parametrizado");
		System.out.println(produto1); //criado com um contrutor padrão
		System.out.println(produto2); //criado com um contrutor padrão
		System.out.println(produto3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(produto4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(produto5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(produto6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v
		//alterando o estado dos objetos na memória RAM utilizando setters
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		produto1.setId(1);
		produto1.setNome("Leite");
		produto1.setDescricao("Leite longa via LG 1L");
		produto1.setValor(4.90);
		produto1.setEstoque(100);
		produto2.setId(2);
		produto2.setNome("Café");
		produto2.setDescricao("Café torrado moído Iguaçu lata 800g");
		produto2.setValor(14.90);
		produto2.setEstoque(200);

		produto3.setId(3);
		produto3.setNome("Arroz");
		produto3.setDescricao("Arroz Tio João tipo 1 5kg");
		produto3.setValor(14.90);
		produto3.setEstoque(300);
		produto4.setId(4);
		produto4.setNome("Feijão");
		produto4.setDescricao("Feijão Tio João tipo 1 1kg");
		produto4.setValor(9.90);
		produto4.setEstoque(400);

		/* Note que, mesmo tendo construído com apenas três argumento estes objetos, é possível usar o setter para alterar todos os atributos dos objetos. */
		produto5.setId(5);
		produto5.setNome("Batata");
		produto5.setDescricao("Batata inglesa rosa kg");
		produto5.setValor(14.90);
		produto5.setEstoque(300);
		produto6.setId(6);
		produto6.setNome("Cebola");
		produto6.setDescricao("Cebola tradicional kg");
		produto6.setValor(9.90);
		produto6.setEstoque(400);

		
		//1c-vi
		System.out.println(produto1.getId());
		System.out.println(produto1.getNome());
		System.out.println(produto1.getDescricao());
		System.out.println(produto1.getValor());
		System.out.println(produto1.getEstoque());
		System.out.println(produto2.getId());
		System.out.println(produto2.getNome());
		System.out.println(produto2.getDescricao());
		System.out.println(produto2.getValor());
		System.out.println(produto2.getEstoque());

		System.out.println(produto3.getId());
		System.out.println(produto3.getNome());
		System.out.println(produto3.getDescricao());
		System.out.println(produto3.getValor());
		System.out.println(produto3.getEstoque());
		System.out.println(produto4.getId());
		System.out.println(produto4.getNome());
		System.out.println(produto4.getDescricao());
		System.out.println(produto4.getValor());
		System.out.println(produto4.getEstoque());

		System.out.println(produto5.getId());
		System.out.println(produto5.getNome());
		System.out.println(produto5.getDescricao());
		System.out.println(produto5.getValor());
		System.out.println(produto5.getEstoque());
		System.out.println(produto6.getId());
		System.out.println(produto6.getNome());
		System.out.println(produto6.getDescricao());
		System.out.println(produto6.getValor());
		System.out.println(produto6.getEstoque());
		
		//---------------- Respostas da Questão 2 ----------------
		//2a ao h para coleção do tipo List
		//coleção do tipo List
		List<Produto> produtoList = new ArrayList<>(); //2a
		produtoList.add(produto1); //2d
		produtoList.add(produto2); //2d
		produtoList.add(produto3); //2d
		produtoList.add(produto4); //2d
		produtoList.add(produto5); //2d
		produtoList.add(produto6); //2d
		System.out.println("\nColeção do tipo List\n" + produtoList); //2e

		//2f
		//ordenando a coleçao do tipo List
		System.out.println();
		produtoList.sort(Comparator.comparing(Produto::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(produtoList);

		//2g
		//Pesquisa por força bruta
		for(Produto produto : produtoList){
			if(produto.getId() == 3){
				System.out.println("\nResultado da pesquisa pelo Produto de id=3");
			}
		}

		//2h
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("Localizando o Produto pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Produto ProdutoFind = produtoList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(ProdutoFind);

		//2h
		//Método utilizando o método binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o Produto pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		produtoList.sort(Comparator.comparing(Produto::getId)); //ordena ascendente, conforme exigido na documentação
		produtoList.get(
			Collections.binarySearch(
				produtoList,
				new Produto(3, "nao importa o valor"),
				Comparator.comparing(Produto::getId)
			)
		);
		System.out.println(ProdutoFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Produto> produtosMap = new HashMap<>(); //2a
		produtosMap.put(produto1.getId(), produto1); //2d
		produtosMap.put(produto3.getId(), produto3); //2d
		produtosMap.put(produto3.getId(), produto3); //2d
		produtosMap.put(produto4.getId(), produto4); //2d
		produtosMap.put(produto5.getId(), produto5); //2d
		System.out.println("\nColeção do tipo Map\n" + produtosMap); //2e

		//2f
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

		//2g e h (Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o Produto pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(produtosMap.get(3));
	}
}
