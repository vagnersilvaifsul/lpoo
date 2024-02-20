package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Automovel;

public class VeiculoController {
	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Automovel veiculo1 = new Automovel(); //utilizando o construtor padrão
		Automovel veiculo2 = new Automovel("22", "IVV2222", "branco", 4, "álcool/gasolina", 0, "22", 20.00); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Modelos criados com os contrutores padrão e parametrizado");
		System.out.println(veiculo1);
		System.out.println(veiculo2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Modelo");
		veiculo1.setRenavan("1111");
		veiculo1.setPlaca("IVV1111");
		veiculo1.setCor("branco");
		veiculo1.setCombustivel("álcool/gasolina");
		veiculo1.setQuilometragem(0);
		veiculo1.setChassi("1111");
		veiculo1.setValor_locacao(110.00);
		System.out.println(veiculo1.getRenavan());
		System.out.println(veiculo1.getPlaca());
		System.out.println(veiculo1.getCor());
		System.out.println(veiculo1.getCombustivel());
		System.out.println(veiculo1.getQuilometragem());
		System.out.println(veiculo1.getChassi());
		System.out.println(veiculo1.getValor_locacao());
		
		System.out.println("\nInstância de Modelo");
		veiculo2.setRenavan("2222");
		veiculo2.setPlaca("IVV2222");
		veiculo2.setCor("branco");
		veiculo2.setCombustivel("álcool/gasolina");
		veiculo2.setQuilometragem(0);
		veiculo2.setChassi("2222");
		veiculo2.setValor_locacao(120.00);
		System.out.println(veiculo2.getRenavan());
		System.out.println(veiculo2.getPlaca());
		System.out.println(veiculo2.getCor());
		System.out.println(veiculo2.getCombustivel());
		System.out.println(veiculo2.getQuilometragem());
		System.out.println(veiculo2.getChassi());
		System.out.println(veiculo2.getValor_locacao());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Automovel veiculo3 = new Automovel("3333", "IVV3333", "branco", 4, "álcool/gasolina", 0, "3333", 130.00);
		Automovel veiculo4 = new Automovel("4444", "IVV4444", "branco", 4, "álcool/gasolina", 0, "4444", 140.00);
		Automovel veiculo5 = new Automovel("4444", "IVV4444", "branco", 4, "álcool/gasolina", 0, "4444", 140.00);
		
		//coleção do tipo List
		List<Automovel> veiculosList = new ArrayList<>();
		veiculosList.add(veiculo1);
		veiculosList.add(veiculo2);
		veiculosList.add(veiculo3);
		veiculosList.add(veiculo4);
		veiculosList.add(veiculo5);
		System.out.println("\nColeção do tipo List\n" + veiculosList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Automovel ModeloFind = veiculosList.stream().filter(c -> c.getRenavan().equals("3333")).findAny().orElse(null);
		System.out.println(ModeloFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		veiculosList.sort(Comparator.comparing(Automovel::getRenavan).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(veiculosList);
		
		//coleção do tipo Map
		Map<String, Automovel> veiculosMap = new HashMap<>();
		veiculosMap.put(veiculo1.getRenavan(), veiculo1);
		veiculosMap.put(veiculo2.getRenavan(), veiculo2);
		veiculosMap.put(veiculo3.getRenavan(), veiculo3);
		veiculosMap.put(veiculo4.getRenavan(), veiculo4);
		veiculosMap.put(veiculo5.getRenavan(), veiculo5);
		System.out.println("\nColeção do tipo Map\n" + veiculosMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(veiculosMap.get("3333"));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

	}

}
