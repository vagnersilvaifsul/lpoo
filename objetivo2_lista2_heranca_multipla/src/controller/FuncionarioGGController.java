package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.ClienteGG;
import model.DesenvolvedorGG;
import model.FuncionarioGG;
import model.GerenteGG;
import model.InvestidorGG;

public class FuncionarioGGController {

	public static void main(String[] args) {
		//a
		DesenvolvedorGG dev1 = new DesenvolvedorGG("Elis", 2500.00);
		DesenvolvedorGG dev2 = new DesenvolvedorGG("João", 2500.00);
		DesenvolvedorGG dev3 = new DesenvolvedorGG("Mario", 2500.00);
		DesenvolvedorGG dev4 = new DesenvolvedorGG("José", 2500.00);
		DesenvolvedorGG dev5 = new DesenvolvedorGG("Júlia", 2500.00);
		DesenvolvedorGG dev6 = new DesenvolvedorGG("Paula", 2500.00);
		System.out.print("\n\nDesenvolvedores criados: ");
		System.out.print(dev1 + "" +  dev2 + "" + dev3 + "" + dev4 + "" + dev5 + "" + dev6);
		
		//String nome, double salario, String ticker, int quantidade
		GerenteGG ger1 = new GerenteGG("Ana", 4500.00, "ALUP11", 500);
		GerenteGG ger2 = new GerenteGG("Rafal", 4500.00, "ALUP11", 1000);
		GerenteGG ger3 = new GerenteGG("Aline", 4500.00, "ALUP11", 1000);
		GerenteGG ger4 = new GerenteGG("Talita", 4500.00, "ALUP11", 1000);
		GerenteGG ger5 = new GerenteGG("Paulo", 6500.00, "ALUP11", 1000);
		GerenteGG ger6 = new GerenteGG("Cris", 6500.00, "ALUP11", 2000);
		System.out.print("\n\nGerentes criados: ");
		System.out.print(ger1 + "" +  ger2 + "" + ger3 + "" + ger4 + "" + ger5 + "" + ger6);
		
		//int id, String nome, String sobrenome, String ticker, int quantidade
		ClienteGG cli1 = new ClienteGG(1, "João", "Dias", "ALUP11", 500);
		ClienteGG cli2 = new ClienteGG(2, "Tânia", "Pereira", "ALUP11", 1000);
		ClienteGG cli3 = new ClienteGG(3, "Mel", "Soares", "ALUP11", 1000);
		ClienteGG cli4 = new ClienteGG(4, "Luna", "Farias", "ALUP11", 1000);
		ClienteGG cli5 = new ClienteGG(5, "Maria", "Terra", "ALUP11", 1000);
		ClienteGG cli6 = new ClienteGG(6, "Pedro", "Santos", "ALUP11", 2000);
		System.out.print("\n\nClientes criados: ");
		System.out.print(cli1 + "" +  cli2 + "" + cli3 + "" + cli4 + "" + cli5 + "" + cli6);
		
		
		//b
		List<FuncionarioGG> funcionarios = new ArrayList<>();
		funcionarios.add(dev1);
		funcionarios.add(dev2);
		funcionarios.add(dev3);
		funcionarios.add(dev4);
		funcionarios.add(dev5);
		funcionarios.add(dev6);
		funcionarios.add(ger1);
		funcionarios.add(ger2);
		funcionarios.add(ger3);
		funcionarios.add(ger4);
		funcionarios.add(ger5);
		funcionarios.add(ger6);
		System.out.print("\n\nColeção de Funcionários criada: " + funcionarios);
		
		List<InvestidorGG> investidores = new ArrayList<>();
		investidores.add(cli1);
		investidores.add(cli2);
		investidores.add(cli3);
		investidores.add(cli4);
		investidores.add(cli5);
		investidores.add(cli6);
		investidores.add(ger1);
		investidores.add(ger2);
		investidores.add(ger3);
		investidores.add(ger4);
		investidores.add(ger5);
		investidores.add(ger6);
		System.out.print("\n\nColeção de investidores criada: " + investidores);
		
		//c
		funcionarios.sort(Comparator.comparing(FuncionarioGG::getSalario).reversed());
		System.out.print("\n\nLista de funcionários da empresa: " + funcionarios);
		System.out.print("\n\nLista de clientes da empresa:");
		investidores.sort(Comparator.comparing(InvestidorGG::getQuantidade).reversed());
		investidores.forEach(i -> {
			if(i instanceof ClienteGG) {
				System.out.print(i);
			}
		});
		System.out.print("\n\nLista de investidores da empresa:" + investidores);
		
		
		//d
		System.out.print("\n\nFuncionario (s) com maior salário: ");
		FuncionarioGG f_maior_salario = Collections.max(funcionarios, Comparator.comparing(FuncionarioGG::getSalario));
		funcionarios.forEach(f -> {
			if(f.getSalario() >= f_maior_salario.getSalario()) {
				System.out.print(f);
			}
		});
		System.out.print("\n\nInvestidor (s) com maior quantidade de ações: ");
		InvestidorGG i_maior_quantidade_acoes = Collections.max(investidores, Comparator.comparing(InvestidorGG::getQuantidade));
		investidores.forEach(i -> {
			if(i.getQuantidade() >= i_maior_quantidade_acoes.getQuantidade()) {
				System.out.print(i);
			}
		});

	}

}//fim classe
