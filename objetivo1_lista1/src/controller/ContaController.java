package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Conta;

public class ContaController {

	public static void main(String[] args) {
		//1
		
		//constrói instâncias da classe
		Conta conta1 = new Conta(); //utilizando o construtor padrão
		Conta conta2 = new Conta(2, 2000.00); //utilizando o construtor parametrizado
		
		//imprime essas instâncias
		System.out.println("Contas criadas com os contrutores padrão e parametrizado");
		System.out.println(conta1);
		System.out.println(conta2);
		
		//altera o estado do objeto na memória
		System.out.print("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
		System.out.println("\nInstância de Conta");
		conta1.setId(1);
		conta1.deposita(2000.00);
		System.out.println(conta1.getId());
		System.out.println(conta1.getSaldo());
		
		System.out.println("\nInstância de Conta");
		conta2.deposita(5000.00);
		System.out.println(conta2.getId());
		System.out.println(conta2.getSaldo());
		
		//De brinde uns movimentos na conta2
		System.out.print("\n++++ BRINDE, movimentos na conta2 ++++");
		conta2.saca(1000.00);
		conta2.atualiza(10);
		conta2.saca(6000.00);
		
		//2	
		//para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id
		Conta conta3 = new Conta(3, 1000.00);
		Conta conta4 = new Conta(4, 500.00);
		Conta conta5 = new Conta(4, 500.00);
		
		//coleção do tipo List
		List<Conta> contasList = new ArrayList<>();
		contasList.add(conta1);
		contasList.add(conta2);
		contasList.add(conta3);
		contasList.add(conta4);
		contasList.add(conta5);
		System.out.println("\nColeção do tipo List\n" + contasList);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Conta pela chave de pesquisa (id=3) na coleção do tipo List ...");
		Conta ContaFind = contasList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(ContaFind);
		
		//ordenando a coleçao do tipo List
		System.out.println();
		contasList.sort(Comparator.comparing(Conta::getId).reversed());
		System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
		System.out.println(contasList);
		
		//coleção do tipo Map
		Map<Integer, Conta> contasMap = new HashMap<>();
		contasMap.put(conta1.getId(), conta1);
		contasMap.put(conta2.getId(), conta2);
		contasMap.put(conta3.getId(), conta3);
		contasMap.put(conta4.getId(), conta4);
		contasMap.put(conta5.getId(), conta5);
		System.out.println("\nColeção do tipo Map\n" + contasMap);
		
		//pesquisando na coleção (método filter)
		System.out.println();
		System.out.print("Localizando o Conta pela chave de pesquisa (id=3) na coleção do tipo Map...");
		System.out.println(contasMap.get(3));
		
		//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
	}

}
