package control;

import model.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AppController {

    public static void main(String[] args) {
        //c
        System.out.println("********** c **********");
        //primeiro pedido
        //cria o fornecedor e os produtos
        Vendedor v1 = new Vendedor(1L, "João da Silva", "joaosilva@email.com", "55555558765", BigDecimal.valueOf(3000.0), 5.0, Regiao.sul);
        Fornecedor f1 = new Fornecedor("12340001-12", "Silva Jardim LTDA", "silvajardim@email.com", "5355551234", null);
        Produto arroz = new Produto(UUID.randomUUID().toString(), "Arroz", "Arroz Celin tipo 1 5kg", 100, BigDecimal.valueOf(12.0), BigDecimal.valueOf(18.9), List.of(f1));
        Produto feijao = new Produto(UUID.randomUUID().toString(), "Feijão", "Feijão Tordilho tipo 1 1kg", 100, BigDecimal.valueOf(5.0), BigDecimal.valueOf(8.9), List.of(f1));
        //cria o carrinho
        List<Item> itens = new ArrayList<>();
        //adiciona os itens ao carrinho
        Item i1 = new Item(10, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(10L)), Situacao.ativo, arroz);
        itens.add(i1);
        Item i2 = new Item(10, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(10L)), Situacao.ativo, feijao);
        //fecha o pedido e baixa o estoque
        itens.add(i2);
        BigDecimal acumTotalCarrinho = BigDecimal.ZERO;
        for(Item i : itens) {
            acumTotalCarrinho =acumTotalCarrinho.add(i.getTotal());
        }
        baixarEstoque(itens);
        Pedido p1 = new Pedido(UUID.randomUUID().toString(), LocalDateTime.now(), acumTotalCarrinho, Estado.aberto, itens, v1);
        System.out.print("---------- Detalhes do Pedido " + p1.getNumero() + " ----------");
        System.out.println(p1);

        //d
        System.out.println("\n\n********** d **********");
        //segundo pedido
        itens.clear(); //limpa o carrinho
        //adiciona os itens ao carrinho
        i1 = new Item(15, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(15L)), Situacao.ativo, arroz);
        itens.add(i1);
        i2 = new Item(15, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(15L)), Situacao.ativo, feijao);
        //fecha o pedido e baixa o estoque
        itens.add(i2);
        acumTotalCarrinho = BigDecimal.ZERO; //zera o acumulador
        for(Item i : itens) {
            acumTotalCarrinho =acumTotalCarrinho.add(i.getTotal());
        }
        baixarEstoque(itens);
        Pedido p2 = new Pedido(UUID.randomUUID().toString(), LocalDateTime.now(), acumTotalCarrinho, Estado.aberto, itens, v1);
        System.out.print("---------- Detalhes do Pedido " + p2.getNumero() + " ----------");
        System.out.println(p2);

        //e
        //lista com os pedidos realizados
        System.out.println("\n\n********** e **********");
        List<Pedido> pedidos = new ArrayList<>(List.of(p1, p2));
        System.out.println(pedidos);

        //f
        System.out.println("\n\n********** f **********");
        System.out.println("------ Relatório de Vendas ------");
        double totalDasVendas = pedidos.stream() //1. crie um fluxo para a coleção
            .mapToDouble(p -> p.getTotal().doubleValue()) //2. passe cada objeto para double
            .sum(); //3. some e devolva o resultado
        System.out.println(pedidos);
        System.out.println("Total das Vendas= " + NumberFormat.getCurrencyInstance().format(totalDasVendas));
    }

    private static void baixarEstoque(List<Item> itens){
        itens.forEach(i -> i.getProduto().setEstoque(i.getProduto().getEstoque() - i.getQuantidade()));
    }

    private static void atualizaEstoque(Item item){
//        Produto produto = item.getProduto();
//        produto.setEstoque(produto.getEstoque() + item.getQuantidade());
//        Produto produtoAlterado = produtoService.update(produto);
//        if (produtoAlterado != null) {
//            System.out.println("estoque estornado:" + produtoAlterado);
//        } else {
//            System.out.println("Erro ao tentar estornar o estoque. Por favor, contate o adminstrador.");
//        }
    }
}
