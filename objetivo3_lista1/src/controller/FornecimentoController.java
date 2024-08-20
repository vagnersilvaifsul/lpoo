package controller;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import exception.NaoPossuiNumeroDeTelefone;
import exception.NaoPossuiNumeroDeTelefoneVerificada;
import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

public class FornecimentoController {

	public static void main(String[] args) {
		//a
		Fornecedor f1 = new Fornecedor("16.785.406/0001-67", "Silva Jardim LTDA", "SóCódigo", "socodigo@email.com", "5355551234", null);

		Produto p1 = new Produto("DTK234", "Arroz", "Arroz Ceolin 5kg", 100, BigDecimal.valueOf(13.0), BigDecimal.valueOf(18.9), List.of(f1));
		Produto p2 = new Produto("DTK234", "Feijão", "Feijão Tordilho 1kg", 100, BigDecimal.valueOf(5.0), BigDecimal.valueOf(8.9), List.of(f1));

		Fornecimento fr1 = new Fornecimento(LocalDateTime.of(2024, 7, 1, 9, 28), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)), f1, p1);
		Fornecimento fr2 = new Fornecimento(LocalDateTime.of(2024, 7, 2, 10, 0), 100, p2.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)), f1, p2);

		//b
		List<Fornecimento> fornecimentos = Arrays.asList(fr1, fr2);
		BigDecimal total = BigDecimal.ZERO;
		for (Fornecimento fornecimento : fornecimentos) {
			total = total.add(fornecimento.getTotal());
		}
		System.out.println("\n***** Relatório de fornecimentos *****");
		System.out.println(fornecimentos);
		System.out.println("Total de fornecimentos= "
			+ NumberFormat.getCurrencyInstance().format(total));

		//Resposta ao exercício sobre exceções
		/*
			1. A partir do diagrama Produto-Fornecedor-Fornecimento da Lista de Exercícios 1 do Objetivo 3, faça o
				que se pede:
				a. Crie uma classe de exceção do tipo Não Verificada e lance essa exceção quando, ao registrar um
					Fornecimento, o Fornecedor não possuir um número de telefone (ele seja null ou ""). Faça a
					lógica necessária para que a aplicação lance a exceção.
				b. Agora crie uma classe de exceção do tipo Verificada e lance a exceção quando as mesmas condições
					apresentadas no item "a" acontecerem.
				c. Para testar o lançamento das exceções, faça as chamadas no controlador. Teste a Exceção Não Verificada
					primeiro, comente o código, e teste a Exceção Verificada.
		 */

		//a
		System.out.println("\n");
		Fornecedor f2 = new Fornecedor("21.345.678/0001-96", "Outros Fornecimentos LTDA", "OutroForcecimentos", "outrosfornecimentos@email.com", null, null);
		if(f2.getTelefone() == null){
			throw new NaoPossuiNumeroDeTelefone("O Fornecedor não possuir um número de telefone cadastrado.");
		}
		//daqui em diante não executa, pois lança a exceção por não ter telefone cadastrado
		Fornecimento fr3 = new Fornecimento(LocalDateTime.of(2024, 7, 2, 10, 0), 100, p2.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)), f1, p2);
		System.out.println(fr3);

		//b
		if(f2.getTelefone() == null){
            try {
                throw new NaoPossuiNumeroDeTelefoneVerificada("O Fornecedor não possuir um número de telefone cadastrado.");
            } catch (NaoPossuiNumeroDeTelefoneVerificada e) {
                e.printStackTrace();
            }
        }
		//daqui em diante não executa, pois lança a exceção por não ter telefone cadastrado
		Fornecimento fr4 = new Fornecimento(LocalDateTime.of(2024, 7, 2, 10, 0), 100, p2.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)), f1, p2);
		System.out.println(fr4);

	}

}
