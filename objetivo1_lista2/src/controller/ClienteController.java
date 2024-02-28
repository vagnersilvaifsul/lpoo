package controller;

import java.util.*;

import model.Cliente;

public class ClienteController {

	public static void main(String[] args) {
		//---------------- Respostas da Questão 1 ----------------
		//1c-i
		//constrói duas instâncias da classe utilizando o construtor padrão
		Cliente cliente1 = new Cliente(); //utilizando o construtor padrão
		Cliente cliente2 = new Cliente();

		//1c-ii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
		Cliente cliente3 = new Cliente(3, "123.445.667-21","Ana", "Silva", "Rua das Flores, 10", "96000-000", "5355551234", "email@mail.com"); //utilizando o construtor parametrizado
		Cliente cliente4 = new Cliente(4, "432.765.321-89","Rafael", "Torres", "Rua das Estrelas, 43", "96000-222", "5355559876", "email@mail.com"); //utilizando o construtor parametrizado

		//1c-iii
		//constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
		Cliente cliente5 = new Cliente("734.754.123-56", "Maria", "Santos");
		Cliente cliente6 = new Cliente("321.567.333-55", "João", "Ferreira");

		//1c-iv
		//imprime todas instâncias (todos os objetos)
		System.out.println("Clientes criados com os contrutores padrão e parametrizado");
		System.out.println(cliente1); //criado com um contrutor padrão
		System.out.println(cliente2); //criado com um contrutor padrão
		System.out.println(cliente3); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(cliente4); //criado com um contrutor parametrizado, com todos os atrutos nele
		System.out.println(cliente5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
		System.out.println(cliente6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

		//1c-v
		//alterando o estado dos objetos na memória RAM utilizando setters
		/* Para facilitar o debug do código, todos os objetos receberam os mesmos valores */
		cliente1.setId(1);
		cliente1.setCpf("111.111.111-11");
		cliente1.setNome("Anita");
		cliente1.setSobrenome("da Silva");
		cliente1.setEndereco("Rua das Flores, 110");
		cliente1.setCep("96000-000");
		cliente1.setTelefone("5355558888");
		cliente1.setEmail("email@dominio.com");
		cliente2.setId(2);
		cliente2.setCpf("111.111.111-11");
		cliente2.setNome("Anita");
		cliente2.setSobrenome("da Silva");
		cliente2.setEndereco("Rua das Flores, 110");
		cliente2.setCep("96000-000");
		cliente2.setTelefone("5355558888");
		cliente2.setEmail("email@dominio.com");

		cliente3.setId(3);
		cliente3.setCpf("111.111.111-11");
		cliente3.setNome("Anita");
		cliente3.setSobrenome("da Silva");
		cliente3.setEndereco("Rua das Flores, 110");
		cliente3.setCep("96000-000");
		cliente3.setTelefone("5355558888");
		cliente3.setEmail("email@dominio.com");
		cliente4.setId(4);
		cliente4.setCpf("111.111.111-11");
		cliente4.setNome("Anita");
		cliente4.setSobrenome("da Silva");
		cliente4.setEndereco("Rua das Flores, 110");
		cliente4.setCep("96000-000");
		cliente4.setTelefone("5355558888");
		cliente4.setEmail("email@dominio.com");

		/* Note que, mesmo tendo construído com apenas três argumento estes objetos, é possível usar o setter para alterar todos os atributos dos objetos. */
		cliente5.setId(5);
		cliente5.setCpf("111.111.111-11");
		cliente5.setNome("Mariazinha");
		cliente5.setSobrenome("dos Santos");
		cliente5.setEndereco("Rua das Estrelas, 110");
		cliente5.setCep("96000-000");
		cliente5.setTelefone("5355558888");
		cliente5.setEmail("email@dominio.com");
		cliente6.setId(6);
		cliente6.setCpf("111.111.111-11");
		cliente6.setNome("Mariazinha");
		cliente6.setSobrenome("dos Santos");
		cliente6.setEndereco("Rua das Estrelas, 110");
		cliente6.setCep("96000-000");
		cliente6.setTelefone("5355558888");
		cliente6.setEmail("email@dominio.com");

		//1c-vi
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getSobrenome());
		System.out.println(cliente1.getEndereco());
		System.out.println(cliente1.getCep());
		System.out.println(cliente1.getEmail());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getSobrenome());
		System.out.println(cliente2.getEndereco());
		System.out.println(cliente2.getCep());
		System.out.println(cliente2.getEmail());
		System.out.println(cliente2.getTelefone());


		System.out.println(cliente3.getId());
		System.out.println(cliente3.getCpf());
		System.out.println(cliente3.getNome());
		System.out.println(cliente3.getSobrenome());
		System.out.println(cliente3.getEndereco());
		System.out.println(cliente3.getCep());
		System.out.println(cliente3.getEmail());
		System.out.println(cliente3.getTelefone());
		System.out.println(cliente4.getId());
		System.out.println(cliente4.getCpf());
		System.out.println(cliente4.getNome());
		System.out.println(cliente4.getSobrenome());
		System.out.println(cliente4.getEndereco());
		System.out.println(cliente4.getCep());
		System.out.println(cliente4.getEmail());
		System.out.println(cliente4.getTelefone());

		System.out.println(cliente5.getId());
		System.out.println(cliente5.getCpf());
		System.out.println(cliente5.getNome());
		System.out.println(cliente5.getSobrenome());
		System.out.println(cliente5.getEndereco());
		System.out.println(cliente5.getCep());
		System.out.println(cliente5.getEmail());
		System.out.println(cliente5.getTelefone());
		System.out.println(cliente6.getId());
		System.out.println(cliente6.getCpf());
		System.out.println(cliente6.getNome());
		System.out.println(cliente6.getSobrenome());
		System.out.println(cliente6.getEndereco());
		System.out.println(cliente6.getCep());
		System.out.println(cliente6.getEmail());
		System.out.println(cliente6.getTelefone());


		//---------------- Respostas da Questão 2 ----------------
		//2a ao h para coleção do tipo List
		//coleção do tipo List
		List<Cliente> clientesList = new ArrayList<>(); //2a
		clientesList.add(cliente1); //2d
		clientesList.add(cliente2); //2d
		clientesList.add(cliente3); //2d
		clientesList.add(cliente4); //2d
		clientesList.add(cliente5); //2d
		clientesList.add(cliente6); //2d
		System.out.println("\nColeção do tipo List\n" + clientesList); //2e

		//2f
		//ordenando a coleçao do tipo List
		System.out.println();
		clientesList.sort(Comparator.comparing(Cliente::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(clientesList);

		//2g
		//Pesquisa por força bruta
		for(Cliente cliente : clientesList){
			if(cliente.getId() == 3){
				System.out.print("\nResultado da pesquisa pelo Cliente de id=3");
				System.out.print(cliente);
			}
		}

		//2h
		//Método utilizando Fluxos para a estrutura de dados
		System.out.println();
		System.out.print("\nLocalizando o Cliente pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
		Cliente ClienteFind = clientesList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(ClienteFind);

		//2h
		//Método utilizando o método binarySearch da classe Collections
		System.out.println();
		System.out.print("Localizando o Cliente pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
		clientesList.sort(Comparator.comparing(Cliente::getId)); //ordena ascendente, conforme exigido na documentação
		clientesList.get(
			Collections.binarySearch(
				clientesList,
				cliente3,
				Comparator.comparing(Cliente::getId)
			)
		);
		System.out.println(ClienteFind);

		//----------------
		//2a ao h para coleção do tipo Map
		Map<Integer, Cliente> clientesMap = new HashMap<>(); //2a
		clientesMap.put(cliente1.getId(), cliente1); //2d
		clientesMap.put(cliente3.getId(), cliente3); //2d
		clientesMap.put(cliente3.getId(), cliente3); //2d
		clientesMap.put(cliente4.getId(), cliente4); //2d
		clientesMap.put(cliente5.getId(), cliente5); //2d
		System.out.println("\nColeção do tipo Map\n" + clientesMap); //2e

		//2f
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

		//2g e h (Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
		//pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
		System.out.println();
		System.out.print("Localizando o Cliente pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(clientesMap.get(3));
	}

}
