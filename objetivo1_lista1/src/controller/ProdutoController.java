package controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Produto;


public class ProdutoController {
	
	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Produto produto1 = new Produto(); //utilizando o construtor padrão
		Produto produto2 = new Produto(2, "Feijão", "desc Feijão", 8.50, 2000); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Produtos criados com os contrutores padrão e parametrizado");
		System.out.println(produto1);
		System.out.println(produto2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Produto");
		produto1.setId(1);
		produto1.setNome("Arroz");
		produto1.setValor(18.30);
		produto1.setEstoque(10000);
		System.out.println(produto1.getId());
		System.out.println(produto1.getNome());
		System.out.println(NumberFormat.getCurrencyInstance().format(produto1.getValor()));
		System.out.println(produto1.getEstoque());
		
		System.out.println("\nInstância de Produto");
		produto2.setNome("Óleo de Soja");
		produto2.setValor(8.30);
		produto2.setEstoque(10000);
		System.out.println(produto2.getId());
		System.out.println(produto2.getNome());
		System.out.println(NumberFormat.getCurrencyInstance().format(produto2.getValor()));
		System.out.println(produto2.getEstoque());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Produto produto3 = new Produto(3, "Batata", "desc Batata",2.00, 6000);
		Produto produto4 = new Produto(4, "Cenoura", "desc Cenoura", 2.50, 1000);
		Produto produto5 = new Produto(4, "Cenoura", "desc Cenoura", 2.50, 1000);
		
		//coleção do tipo List
		List<Produto> produtosList = new ArrayList<>();
		produtosList.add(produto1);
		produtosList.add(produto2);
		produtosList.add(produto3);
		produtosList.add(produto4);
		produtosList.add(produto5);
		System.out.println("\nColeção do tipo List\n" + produtosList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Produto pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Produto ProdutoFind = produtosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(ProdutoFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		produtosList.sort(Comparator.comparing(Produto::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(produtosList);
		
		//coleção do tipo Map
		Map<Integer, Produto> produtosMap = new HashMap<>();
		produtosMap.put(produto1.getId(), produto1);
		produtosMap.put(produto2.getId(), produto2);
		produtosMap.put(produto3.getId(), produto3);
		produtosMap.put(produto4.getId(), produto4);
		produtosMap.put(produto5.getId(), produto5);
		System.out.println("\nColeção do tipo Map\n" + produtosMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Produto pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(produtosMap.get(3));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

	}
}
