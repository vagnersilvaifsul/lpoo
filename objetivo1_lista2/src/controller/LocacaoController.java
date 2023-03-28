package controller;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Locacao;

public class LocacaoController {
	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Locacao locacao1 = new Locacao(); //utilizando o construtor padrão
		Locacao locacao2 = new Locacao(2, LocalDateTime.of(2021, 5, 10, 10, 1), LocalDateTime.of(2021, 5, 12, 8, 0), 10000, 0.00, 180.00, true); //utilizando o construtor parametrizado
		
		/*
		 * Nota: Calendar trabalha com meses de 0-11, logo, indice 2 significa mês 3 ou março. Do Java 8 em diante tem outras
		 * APIs para se trabalhar com datas, mas, existe muito códiogo por aí com Calendar ou Date.
		 * */
		
		
		//imprime essas instâncias
		System.out.println("Modelos criados com os contrutores padrão e parametrizado");
		System.out.println(locacao1);
		System.out.println(locacao2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Modelo");
		locacao1.setId(1);
		locacao1.setDataLocacao(LocalDateTime.of(2021, 2, 10, 10, 0));
		locacao1.setDataDevolucao(null);
		locacao1.setQuilometragem(10000);
		locacao1.setValorCalcao(0.0);
		locacao1.setValorLocacao(100.00);
		locacao1.setDevolvido(false);
		System.out.println(locacao1.getId());
		System.out.println(locacao1.getDataLocacao());
		System.out.println(locacao1.getDataDevolucao());
		System.out.println(locacao1.getQuilometragem());
		System.out.println(NumberFormat.getCurrencyInstance().format(locacao1.getValorCalcao()));
		System.out.println(NumberFormat.getCurrencyInstance().format(locacao1.getValorLocacao()));
		System.out.println(locacao1.isDevolvido());
		
		System.out.println("\nInstância de Modelo");
		locacao2.setDataLocacao(LocalDateTime.of(2021, 2, 22, 14, 0));
		locacao2.setDataDevolucao(null);
		locacao2.setQuilometragem(22000);
		locacao2.setValorCalcao(0.0);
		locacao2.setValorLocacao(220.00);
		locacao2.setDevolvido(false);
		System.out.println(locacao2.getId());
		System.out.println(locacao2.getDataLocacao());
		System.out.println(locacao2.getDataDevolucao());
		System.out.println(locacao2.getQuilometragem());
		System.out.println(NumberFormat.getCurrencyInstance().format(locacao2.getValorCalcao()));
		System.out.println(NumberFormat.getCurrencyInstance().format(locacao2.getValorLocacao()));
		System.out.println(locacao2.isDevolvido());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Locacao locacao3 = new Locacao(3, LocalDateTime.of(2021, 2, 3, 15, 0), LocalDateTime.of(2021, 2, 23, 10, 0), 30000, 0.00, 130.00, true);
		Locacao locacao4 = new Locacao(4, LocalDateTime.of(2021, 2, 4, 16, 0), LocalDateTime.of(2021, 2, 24, 18, 0), 40000, 0.00, 140.00, true);
		Locacao locacao5 = new Locacao(4, LocalDateTime.parse("2011-02-12T16:54"), LocalDateTime.parse("2011-02-24T18:05"), 40000, 0.00, 140.00, true);
		
		//coleção do tipo List
		List<Locacao> locacaoList = new ArrayList<>();
		locacaoList.add(locacao1);
		locacaoList.add(locacao2);
		locacaoList.add(locacao3);
		locacaoList.add(locacao4);
		locacaoList.add(locacao5);
		System.out.println("\nColeção do tipo List\n" + locacaoList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Locacao ModeloFind = locacaoList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(ModeloFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		locacaoList.sort(Comparator.comparing(Locacao::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(locacaoList);
		
		//coleção do tipo Map
		Map<Integer, Locacao> locacaoMap = new HashMap<>();
		locacaoMap.put(locacao1.getId(), locacao1);
		locacaoMap.put(locacao2.getId(), locacao2);
		locacaoMap.put(locacao3.getId(), locacao3);
		locacaoMap.put(locacao4.getId(), locacao4);
		locacaoMap.put(locacao5.getId(), locacao5);
		System.out.println("\nColeção do tipo Map\n" + locacaoMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(locacaoMap.get(3));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
	}
	
}
