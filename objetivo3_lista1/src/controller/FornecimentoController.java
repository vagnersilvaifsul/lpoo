package controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import model.Fornecedor;
import model.Fornecimento;
import model.ProdutoO3L1;

public class FornecimentoController {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("16.785.406/0001-67", "Dirley 5355559292", "Só Alimento S.A.");
		Fornecedor f2 = new Fornecedor("87.332.600/0001-35", "Josiane 5355554444", "Secos e Molhados S.A.");

		ProdutoO3L1 p1 = new ProdutoO3L1(1L, "Arroz", 100, 18.90, f1);
		ProdutoO3L1 p2 = new ProdutoO3L1(2L, "Feijão", 100, 8.90, f1);
		ProdutoO3L1 p3 = new ProdutoO3L1(3L, "Batata", 100, 2.90, f2);
		
		//calcula o total
		double total = p1.getPreco() * 50;
		//baixa o estoque
		p1.setQuantidade(p1.getQuantidade() - 50);
		Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2021, 5, 10, 10, 01), total, f1, p1);
		
		//calcula o total
		total = p2.getPreco() * 50;
		// baixa o estoque
		p2.setQuantidade(p1.getQuantidade() - 50);
		Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2021, 5, 8, 10, 01), total, f1, p2);
	
		//calcula o total
		total = p3.getPreco() * 20;
		// baixa o estoque
		p3.setQuantidade(p1.getQuantidade() - 50);
		Fornecimento fr3 = new Fornecimento(new GregorianCalendar(2021, 5, 2, 10, 01), total, f2, p3);
	
		List<Fornecimento> fornecimentos = new ArrayList<>();
		fornecimentos.add(fr1);
		fornecimentos.add(fr2);
		fornecimentos.add(fr3);
		System.out.print("\n***** Lista de Fornecimentos");
		System.out.println(fornecimentos);
		
		double totalFornecido = 0.0;
		for (int i = 0; i < fornecimentos.size(); i++) {
			totalFornecido += fornecimentos.get(i).getTotal();
		}
		System.out.print("\n***** Total Fornecido = " + NumberFormat.getCurrencyInstance().format(totalFornecido));
	}

}
