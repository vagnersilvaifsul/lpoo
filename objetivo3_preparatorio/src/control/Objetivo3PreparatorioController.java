package control;

import exception.EstoqueInsufiente;
import model.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Objetivo3PreparatorioController {

    public static void main(String[] args) {
        //a está refletida nos pacotes do projeto

        //b está no pacote model

        //c
        System.out.println("********** c **********");
        //primeiro pedido
        //(i) cria o fornecedor e os produtos
        Vendedor v1 = new Vendedor(1L, "João da Silva", "joaosilva@email.com", "55555558765", BigDecimal.valueOf(3000.0), 5.0, Regiao.Sul);
        Fornecedor f1 = new Fornecedor("12340001-12", "Silva Jardim LTDA", "silvajardim@email.com", "5355551234", null);
        Produto arroz = new Produto(UUID.randomUUID().toString(), "Arroz", "Arroz Celin tipo 1 5kg", 100, BigDecimal.valueOf(12.0), BigDecimal.valueOf(18.9), List.of(f1));
        Produto feijao = new Produto(UUID.randomUUID().toString(), "Feijão", "Feijão Tordilho tipo 1 1kg", 100, BigDecimal.valueOf(5.0), BigDecimal.valueOf(8.9), List.of(f1));
        //cria o carrinho
        List<Item> itens = new ArrayList<>();
        //adiciona os itens ao carrinho
        Item i1 = new Item(10, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)), Situacao.Ativo, arroz);
        itens.add(i1);
        Item i2 = new Item(10, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)), Situacao.Ativo, feijao);
        //fecha o pedido e baixa o estoque
        itens.add(i2);
        BigDecimal acumTotalCarrinho = BigDecimal.ZERO;
        for(Item i : itens) {
            acumTotalCarrinho = acumTotalCarrinho.add(i.getTotal());
        }
        //(iii) baixa o estoque
        Produto.baixarEstoque(itens);
        //(ii) registra o pedido
        Pedido p1 = new Pedido(UUID.randomUUID().toString(), LocalDateTime.now(), acumTotalCarrinho, Estado.Aberto, itens, v1);
        //(iv) exibe o pedido
        System.out.print("---------- Detalhes do Pedido " + p1.getNumero() + " ----------");
        System.out.println(p1);
        System.out.println("=======> Total do Pedido = "
            + NumberFormat.getCurrencyInstance().format(acumTotalCarrinho));

        //d
        System.out.println("\n\n********** d **********");
        //(i) segundo pedido
        itens.clear(); //limpa o carrinho
        //adiciona os itens ao carrinho
        i1 = new Item(15, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(15)), Situacao.Ativo, arroz);
        itens.add(i1);
        i2 = new Item(15, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(15)), Situacao.Ativo, feijao);
        //fecha o pedido e baixa o estoque
        itens.add(i2);
        acumTotalCarrinho = BigDecimal.ZERO; //zera o acumulador
        for(Item i : itens) {
            acumTotalCarrinho =acumTotalCarrinho.add(i.getTotal());
        }
        //(iii) baixa o estoque
        Produto.baixarEstoque(itens);
        //(ii) registra o pedido
        Pedido p2 = new Pedido(UUID.randomUUID().toString(), LocalDateTime.now(), acumTotalCarrinho, Estado.Aberto, itens, v1);
        //(iv) exibe o pedido
        System.out.print("---------- Detalhes do Pedido " + p2.getNumero() + " ----------");
        System.out.println(p2);
        System.out.println("=======> Total do Pedido = "
            + NumberFormat.getCurrencyInstance().format(acumTotalCarrinho));

        //e
        //lista com os pedidos realizados
        System.out.println("\n\n********** e **********");
        List<Pedido> pedidos = new ArrayList<>(List.of(p1, p2));
        System.out.println("Pedidos registrados na coleção.");
        pedidos.forEach(System.out::println);

        //f
        System.out.print("\n\n********** f **********");
        System.out.print("\n------ Relatório de Vendas ------");
        //Solução utilizando a técnica OO Imperativa
        BigDecimal totalVendas = BigDecimal.ZERO;
        for(Pedido pedido : pedidos) {
            totalVendas = totalVendas.add(pedido.getTotal());
        }
        System.out.println("=====>Total de vendas (programação imperativa)= " + totalVendas);
        //Solução utilizando a Programação Funcional
        double totalDasVendas = pedidos.stream() //1. crie um fluxo para a coleção
            .mapToDouble(p -> p.getTotal().doubleValue()) //2. passe cada objeto para double
            .sum(); //3. some e devolva o resultado
        System.out.println("=====> Total das Vendas (programação funcional)= " + NumberFormat.getCurrencyInstance().format(totalDasVendas));

        //g
        System.out.println("\n\n********** g **********");
        System.out.println("------ Fornecimento de produtos ------");
        //registra o fornecimento de arroz
        Fornecimento fn1 = new Fornecimento(LocalDateTime.now(), 100, arroz.getPrecoDeCusto().multiply(BigDecimal.valueOf(100)), arroz, f1);
        //atualiza o estoque
        Produto.atualizaEstoque(fn1);
        System.out.print("Fornecimento registrado: ");
        System.out.println(fn1.getProduto().getNome() + ", etoque atualizado= " + fn1.getProduto().getEstoque());
        //registra o fornecimento de feijão
        Fornecimento fn2 = new Fornecimento(LocalDateTime.now(), 50, feijao.getPrecoDeCusto().multiply(BigDecimal.valueOf(50)), feijao, f1);
        //atualiza o estoque
        Produto.atualizaEstoque(fn2);
        System.out.print("Fornecimento registrado: ");
        System.out.println(fn2.getProduto().getNome() + ", etoque atualizado= " + fn2.getProduto().getEstoque());

        //h
        System.out.println("\n\n********** h **********");
        System.out.print("------ Relatório de Fornecimentos de Produtos ------");
        //cria a coleção com os fornecimentos
        List<Fornecimento> fornecimentos = new ArrayList<>(List.of(fn1, fn2));
        //Solução utilizando a técnica OO Imperativa
        BigDecimal totalFornecimentos = BigDecimal.ZERO;
        for(Fornecimento fornecimento : fornecimentos) {
            totalFornecimentos = totalFornecimentos.add(fornecimento.getTotal());
        }
        System.out.println("=====> Total de fornecimentos (programação imperativa)= " + totalFornecimentos);
        //Solução utilizando a Programação Funcional
        double totalDosFornecimentos = fornecimentos.stream() //1. crie um fluxo para a coleção
                .mapToDouble(p -> p.getTotal().doubleValue()) //2. passe cada objeto para double
            .sum(); //3. some e devolva o resultado
        fornecimentos.forEach(System.out::println);
        System.out.println("=====> Total dos Fornecimentos (programação funcional)= " + NumberFormat.getCurrencyInstance().format(totalDosFornecimentos));

        //i
        System.out.println("\n\n********** i **********");
        /*
            Por questão didática, aqui foi implementado outro método que baixa o estoque, onde pode ser lançada uma exceção.
         */
        //Repeti os passos para emissão de um pedido
        itens.clear(); //limpa o carrinho
        //adiciona os itens ao carrinho
        i1 = new Item(1500, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(1500L)), Situacao.Ativo, arroz);
        itens.add(i1);
        i2 = new Item(15, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(15L)), Situacao.Ativo, feijao);
        //fecha o pedido e baixa o estoque
        itens.add(i2);
        acumTotalCarrinho = BigDecimal.ZERO; //zera o acumulador
        for(Item i : itens) {
            acumTotalCarrinho = acumTotalCarrinho.add(i.getTotal());
        }
        try { //tenta executar
            Produto.baixarEstoqueComException(itens); //vai lança a exceção aqui, antes de registrar um pedido
        } catch (EstoqueInsufiente e) { //se lançar uma exceção a captura aqui
            e.printStackTrace(); //imprime a pilha de exceção
        } finally { //sempre apresenta o estoque atualizado
            System.out.println("Estoque atualizado:");
            System.out.print(
                """
                    Note que o arroz não baixou o estoque, pois foi emitida a exceção EstoqueInsufiente.
                    E o feijão, que tem estoque suficiente, também não foi baixado o estoque, pois a execução
                    do programa parou ao encontrar estoque insuficiente no Arroz.
                """
            );
            itens.forEach(i -> System.out.print(i.getProduto()));
            System.out.println();
        }
        //aqui continuaria o restante do algoritmo para realiza um Pedido. Porém, a exceção para a execução do programa.
    }

}
