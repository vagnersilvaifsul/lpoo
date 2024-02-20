package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Produto;

public class ProdutoController {

	public static void main(String[] args) {
		
		//cada produto simula um registro em um banco de dados
		Produto produto1 = new Produto("Arroz", 18.50, 100); //produto1 é uma intância da classe Produto (ou simplemente, um objeto)
		Produto produto2 = new Produto("Feijão", 8.30, 100);	
		Produto produto3 = new Produto("Café", 13.10, 100);	
		Produto produto4 = new Produto("Açucar", 2.20, 100);
		Produto produto5 = new Produto("Batata", 2.50, 60);
		
		//criando a coleção e add objetos na coleção
		List<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		System.out.println("--------- Lista Orinal ---------");
		System.out.println(produtos);
		
		//ordena a coleção pelo atributo nome do produto
		produtos.sort(Comparator.comparing(Produto::getNome));
		System.out.println("--------- Lista Ordenada ---------");
		System.out.println(produtos);
		
		//pesquisa por força bruta
		System.out.println();
		System.out.print("Localizando o produto pelo nome Açucar (pela chave, usando força bruta) ...");
		produtos.forEach(p -> {
			if(p.getNome().equals("Açucar")) {
				System.out.println(p);
			}
			//System.out.println(p);
		});
		
		//pesquisando na coleção pelo método filter
		System.out.println();
		System.out.print("Localizando o produto pelo nome Açucar (pela chave, usando o filter) ...");
		Produto produtoFind = produtos.stream().filter(p -> p.getNome().equals("Açucar")).findAny().orElse(null);
		System.out.println(produtoFind);
		
	}

}
