package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Cliente;
import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;
import model.Investidor;

public class FuncionarioController {

	public static void main(String[] args) {
		//Questão 1c
		Desenvolvedor dev1 = new Desenvolvedor("Elis", 2500.00);
		Desenvolvedor dev2 = new Desenvolvedor("João", 2500.00);
		Desenvolvedor dev3 = new Desenvolvedor("Mario", 2500.00);
		Desenvolvedor dev4 = new Desenvolvedor("José", 2500.00);
		Desenvolvedor dev5 = new Desenvolvedor("Júlia", 2500.00);
		Desenvolvedor dev6 = new Desenvolvedor("Paula", 2500.00);
		System.out.print("\n\nDesenvolvedores criados: ");
		System.out.print(dev1 + "" +  dev2 + dev3 + dev4 + dev5 + dev6);

		//Questão 1c
		Gerente ger1 = new Gerente("Ana", 4500.00, "ALUP11", 500);
		Gerente ger2 = new Gerente("Rafal", 4500.00, "ALUP11", 1000);
		Gerente ger3 = new Gerente("Aline", 4500.00, "ALUP11", 1000);
		Gerente ger4 = new Gerente("Talita", 4500.00, "ALUP11", 1000);
		Gerente ger5 = new Gerente("Paulo", 6500.00, "ALUP11", 1000);
		Gerente ger6 = new Gerente("Cris", 6500.00, "ALUP11", 2000);
		System.out.print("\n\nGerentes criados: ");
		System.out.print(ger1 + "" +  ger2 + ger3 + ger4 + ger5 + ger6);

		//Questão 1c
		Cliente cli1 = new Cliente(1, "João", "Dias", "ALUP11", 500);
		Cliente cli2 = new Cliente(2, "Tânia", "Pereira", "ALUP11", 1000);
		Cliente cli3 = new Cliente(3, "Mel", "Soares", "ALUP11", 1000);
		Cliente cli4 = new Cliente(4, "Luna", "Farias", "ALUP11", 1000);
		Cliente cli5 = new Cliente(5, "Maria", "Terra", "ALUP11", 1000);
		Cliente cli6 = new Cliente(6, "Pedro", "Santos", "ALUP11", 2000);

		//Questão 1c
		System.out.print("\n\nClientes criados: ");
		System.out.print(cli1 + "" +  cli2 + cli3 + cli4 + cli5 + cli6);


		//Questão 1d - para representar os funcionários
		List<Funcionario> funcionarios = new ArrayList<>();
		//Questão 1e
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

		//Questão 1d - para representar os investidores
		List<Investidor> investidores = new ArrayList<>();
		//Questão 1e
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

		//Questão 1f
		funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
		System.out.print("\n\nLista de funcionários da empresa: " + funcionarios);

		//Questão 1g
		System.out.print("\n\nLista de clientes da empresa:");
		investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed()); //primeiro ordena
		investidores.forEach(i -> { //depois localiza os clientes na coleção
			if(i instanceof Cliente) {
				System.out.print(i);
			}
		});

		//Questão 1h
		//a lista já está ordenada nesse ponto, é só imprimir a lista de investidores
		System.out.print("\n\nLista de investidores da empresa:" + investidores);


		//Questão 1i
		System.out.print("\n\nFuncionario (s) com maior salário: ");
		Funcionario f_maior_salario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario)); //primeiro determina o maior
		funcionarios.forEach(f -> { //depois comparar o maior com cada objeto da coleção
			if(f.getSalario() >= f_maior_salario.getSalario()) {
				System.out.print(f);
			}
		});

		//Questão 1j
		System.out.print("\n\nInvestidor (s) com maior número de cotas: ");
		Investidor i_maior_quantidade_acoes = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade)); //primeiro determina o maior
		investidores.forEach(i -> { //depois comparar o maior com cada objeto da coleção
			if(i.getQuantidade() >= i_maior_quantidade_acoes.getQuantidade()) {
				System.out.print(i);
			}
		});

	}

}//fim classe
