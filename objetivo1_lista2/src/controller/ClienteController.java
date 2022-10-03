package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Cliente;

public class ClienteController {

	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Cliente cliente1 = new Cliente(); //utilizando o construtor padrão
		Cliente cliente2 = new Cliente("2", "Ana", "da Silva", "Rua das Flores, 10", "96000700", "5395551234", "ana@email.com"); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Clientes criados com os contrutores padrão e parametrizado");
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Cliente");
		cliente1.setCpf("1");
		cliente1.setNome("Maria");
		cliente1.setSobrenome("dos Santos");
		cliente1.setEndereco("Rua dos Santos, 1");
		cliente1.setCep("96700000");
		cliente1.setTelefone("5395559876");
		cliente1.setEmail("maria@email.com");
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getSobrenome());
		System.out.println(cliente1.getEndereco());
		System.out.println(cliente1.getCep());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getEmail());
		
		System.out.println();
		cliente2.setNome("José");
		cliente2.setSobrenome("dos Santos");
		cliente2.setEndereco("Rua dos Santos, 1");
		cliente2.setCep("96700000");
		cliente2.setTelefone("5395554567");
		cliente2.setEmail("jose@email.com");
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getSobrenome());
		System.out.println(cliente2.getEndereco());
		System.out.println(cliente2.getCep());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getEmail());
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Cliente cliente3 = new Cliente("3", "Gabriel", "da Silva", "Rua das Flores, 10", "96000700", "5395554433", "gabriel@email.com");
		Cliente cliente4 = new Cliente("4", "Antonia", "Soares", "Rua das Flores, 10", "96000700", "5395557890", "antonia@email.com");
		Cliente cliente5 = new Cliente("4", "Antonia", "Soares", "Rua das Flores, 10", "96000700", "5395557890", "antonia@email.com");
		
		//coleção do tipo List
		List<Cliente> clientesList = new ArrayList<>();
		clientesList.add(cliente1);
		clientesList.add(cliente2);
		clientesList.add(cliente3);
		clientesList.add(cliente4);
		clientesList.add(cliente5);
		System.out.println("\nColeção do tipo List\n" + clientesList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Cliente pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Cliente ClienteFind = clientesList.stream().filter(c -> c.getCpf().equals("3")).findAny().orElse(null);
		System.out.println(ClienteFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		clientesList.sort(Comparator.comparing(Cliente::getCpf).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(clientesList);
		
		//coleção do tipo Map
		Map<String, Cliente> clientesMap = new HashMap<>();
		clientesMap.put(cliente1.getCpf(), cliente1);
		clientesMap.put(cliente2.getCpf(), cliente2);
		clientesMap.put(cliente3.getCpf(), cliente3);
		clientesMap.put(cliente4.getCpf(), cliente4);
		clientesMap.put(cliente5.getCpf(), cliente5);
		System.out.println("\nColeção do tipo Map\n" + clientesMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Cliente pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(clientesMap.get("3"));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
	}

}
