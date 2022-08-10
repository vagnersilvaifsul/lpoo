package control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Marca_Lista2;

public class MarcaController {
	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Marca_Lista2 marca1 = new Marca_Lista2(); //utilizando o construtor padrão
		Marca_Lista2 marca2 = new Marca_Lista2(2, "Fiat"); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Marcas criados com os contrutores padrão e parametrizado");
		System.out.println(marca1);
		System.out.println(marca2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Marca");
		marca1.setId(1);
		marca1.setDescricao("Volkswagen");
		System.out.println(marca1.getId());
		System.out.println(marca1.getDescricao());
		
		System.out.println("\nInstância de Marca");
		marca2.setDescricao("Renault");
		System.out.println(marca2.getId());
		System.out.println(marca2.getDescricao());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Marca_Lista2 marca3 = new Marca_Lista2(3, "Fiat");
		Marca_Lista2 marca4 = new Marca_Lista2(4, "Citroen");
		Marca_Lista2 marca5 = new Marca_Lista2(4, "Citroen");
		
		//coleção do tipo List
		List<Marca_Lista2> marcasList = new ArrayList<>();
		marcasList.add(marca1);
		marcasList.add(marca2);
		marcasList.add(marca3);
		marcasList.add(marca4);
		marcasList.add(marca5);
		System.out.println("\nColeção do tipo List\n" + marcasList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Marca pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Marca_Lista2 MarcaFind = marcasList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(MarcaFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		marcasList.sort(Comparator.comparing(Marca_Lista2::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(marcasList);
		
		//coleção do tipo Map
		Map<Integer, Marca_Lista2> marcasMap = new HashMap<>();
		marcasMap.put(marca1.getId(), marca1);
		marcasMap.put(marca2.getId(), marca2);
		marcasMap.put(marca3.getId(), marca3);
		marcasMap.put(marca4.getId(), marca4);
		marcasMap.put(marca5.getId(), marca5);
		System.out.println("\nColeção do tipo Map\n" + marcasMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Marca pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(marcasMap.get(3));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

	}

}
