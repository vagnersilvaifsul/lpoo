package controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import model.Cliente3V;
import model.ItemPedido3V;
import model.Pedido3V;
import model.Produto3V;

public class ClientePedidoController {
	public static void main(String[] args) {
		//cadastra o cliente no sistema
		Cliente3V cliente1 = new Cliente3V(
				1L, 
				"Ana", 
				"da Silva", 
				true);
		System.out.println("\nCliente " + 
				cliente1.getNome() +
				" " + cliente1.getSobrenome() + 
				" cadastrado com sucesso.");
		
		//Adiciona um produto no sistema
		Produto3V produto1 = new Produto3V(1L, "Arroz", "5kg Ceolin", 18.5, true);
		
		//Adiciona um produto no Pedido (Cria um ItemPedido)
		ItemPedido3V item = new ItemPedido3V
				(1L, 2, (2 * produto1.getValor()), true, produto1);
		//Lista de Itens do Pedido
		List<ItemPedido3V> itens = new ArrayList<>();
		itens.add(item);
		
		//cadastra um pedido para o cliente
		Pedido3V pedido1 = new Pedido3V(
				1L, 
				"a vista", 
				"aberto", 
				new GregorianCalendar(2021, 4, 12, 10, 00),
				new GregorianCalendar(2021, 4, 12, 10, 00),
				1200.00,
				true,
				cliente1,
				itens);
		System.out.println("\nPedido realizado com sucesso. Número do pedido: " + 
				pedido1.getId());
		System.out.println("Detalhes do pedido:" + pedido1);
		
		//como não tem banco de dados, coloca o pedido na lista de pedidos do cliente
		cliente1.getPedidos().add(pedido1);
		
		
		//Relatórios do sistema
		
		//relação de pedidos de um cliente
		System.out.println("\n\nRelação de Pedidos de um determinado cliente:");
		System.out.println("Pedidos do cliente " + cliente1.getNome() + " " + cliente1.getSobrenome());
		System.out.println(cliente1.getPedidos());	
		
	}
}
