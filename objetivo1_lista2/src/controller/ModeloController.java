package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Modelo;

public class ModeloController {
	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Modelo modelo1 = new Modelo(); //utilizando o construtor padrão
		Modelo modelo2 = new Modelo(2, "Uno"); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Modelos criados com os contrutores padrão e parametrizado");
		System.out.println(modelo1);
		System.out.println(modelo2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Modelo");
		modelo1.setId(1);
		modelo1.setDescricao("Fox");
		System.out.println(modelo1.getId());
		System.out.println(modelo1.getDescricao());
		
		System.out.println("\nInstância de Modelo");
		modelo2.setDescricao("Duster");
		System.out.println(modelo2.getId());
		System.out.println(modelo2.getDescricao());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Modelo modelo3 = new Modelo(3, "Uno");
		Modelo modelo4 = new Modelo(4, "C3");
		Modelo modelo5 = new Modelo(4, "C3");
		
		//coleção do tipo List
		List<Modelo> modeloList = new ArrayList<>();
		modeloList.add(modelo1);
		modeloList.add(modelo2);
		modeloList.add(modelo3);
		modeloList.add(modelo4);
		modeloList.add(modelo5);
		System.out.println("\nColeção do tipo List\n" + modeloList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Modelo ModeloFind = modeloList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(ModeloFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(modeloList);
		
		//coleção do tipo Map
		Map<Integer, Modelo> modelosMap = new HashMap<>();
		modelosMap.put(modelo1.getId(), modelo1);
		modelosMap.put(modelo2.getId(), modelo2);
		modelosMap.put(modelo3.getId(), modelo3);
		modelosMap.put(modelo4.getId(), modelo4);
		modelosMap.put(modelo5.getId(), modelo5);
		System.out.println("\nColeção do tipo Map\n" + modelosMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(modelosMap.get(3));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

	}

}
