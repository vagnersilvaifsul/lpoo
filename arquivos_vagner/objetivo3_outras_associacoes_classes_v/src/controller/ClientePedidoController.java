package controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class ClientePedidoController {
	public static void main(String[] args) {
		//cadastra o cliente no sistema
		Cliente cliente1 = new Cliente(
				1L, 
				"Ana", 
				"da Silva", 
				true);
		System.out.println("\nCliente " + 
				cliente1.getNome() +
				" " + cliente1.getSobrenome() + 
				" cadastrado com sucesso.");
		
		//Adiciona um produto no sistema
		Produto produto1 = new Produto(1L, "Arroz", "5kg Ceolin", 18.5, true);
		
		//Adiciona um produto no Pedido (Cria um ItemPedido)
		ItemPedido item = new ItemPedido
				(1L, 2, (2 * produto1.getValor()), true, produto1);
		//Lista de Itens do Pedido
		List<ItemPedido> itens = new ArrayList<>();
		itens.add(item);
		
		//cadastra um pedido para o cliente
		Pedido pedido1 = new Pedido(
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
