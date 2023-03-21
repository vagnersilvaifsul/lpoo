package controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import model.Desenvolvedor;
import model.DesenvolvedorJunior;
import model.DesenvolvedorPleno;
import model.DesenvolvedorSenior;
import model.Funcionario;
import model.GerenteDesenvolvimento;
import model.Gerente;
import model.GerenteGeral;

public class FuncionarioController {
	
	private static double total_folha_com_bonus = 0.0;
	private static double total_folha_sem_bonus = 0.0;

	public static void main(String[] args) {
		//1
		Desenvolvedor dev1 = new DesenvolvedorSenior();
		Desenvolvedor dev2 = new DesenvolvedorSenior("Ana", 3500.00);
		Gerente ger1 = new GerenteGeral(); //a questão 2 altera isso
		Gerente ger2 = new GerenteDesenvolvimento("Rafael", 4500.00); //a questão 2 altera isso
		System.out.print("Lista de Funcionários");
		System.out.println(dev1 + "" + dev2 + "" + ger1 + "" + ger2);
		//alterando os objetos
		dev1.setNome("Maria");
		dev1.setSalario(3500.00);
		ger1.setNome("Silvia");
		ger1.setSalario(6500.00);
		System.out.print("\nLista de Funcionários atualizada");
		System.out.println(dev1 + "" + dev2 + "" + ger1 + "" + ger2);
		
		//Respostas as questões escritas
		//1. Não é possível criar instâncias da classe Funcionario porquê ela é abastrata.
		//2. Nas classes de modelo, onde o domínio do problema está sendo modelado. No controller se
		//evita colocar regras de negócios do domínio do problema.
		
		//2.
		//cria mais 16 Desenvolvedores
		Desenvolvedor dev3 = new DesenvolvedorSenior("Elis", 3500.00);
		Desenvolvedor dev4 = new DesenvolvedorSenior("João", 3500.00);
		Desenvolvedor dev5 = new DesenvolvedorSenior("Mario", 3500.00);
		Desenvolvedor dev6 = new DesenvolvedorSenior("José", 3500.00);
		Desenvolvedor dev7 = new DesenvolvedorPleno("Júlia", 2500.00);
		Desenvolvedor dev8 = new DesenvolvedorPleno("Paula", 2500.00);
		Desenvolvedor dev9 = new DesenvolvedorPleno("Rafaela", 2500.00);
		Desenvolvedor dev10 = new DesenvolvedorPleno("Denise", 2500.00);
		Desenvolvedor dev11 = new DesenvolvedorPleno("Carlos", 2500.00);
		Desenvolvedor dev12 = new DesenvolvedorPleno("Tomaz", 2500.00);
		Desenvolvedor dev13 = new DesenvolvedorJunior("Cíntia", 1800.00);
		Desenvolvedor dev14 = new DesenvolvedorJunior("Glória", 1800.00);
		Desenvolvedor dev15 = new DesenvolvedorJunior("Caio", 1800.00);
		Desenvolvedor dev16 = new DesenvolvedorJunior("Roberto", 1800.00);
		Desenvolvedor dev17 = new DesenvolvedorJunior("Clara", 1800.00);
		Desenvolvedor dev18 = new DesenvolvedorJunior("Mel", 1800.00);
		
		//adiciona os funcionários a uma coleção do tipo List, assim facilita os cáculos
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(ger1);
		funcionarios.add(ger2);
		funcionarios.add(dev1);
		funcionarios.add(dev2);
		funcionarios.add(dev3);
		funcionarios.add(dev4);
		funcionarios.add(dev5);
		funcionarios.add(dev6);
		funcionarios.add(dev7);
		funcionarios.add(dev8);
		funcionarios.add(dev9);
		funcionarios.add(dev10);
		funcionarios.add(dev11);
		funcionarios.add(dev12);
		funcionarios.add(dev13);
		funcionarios.add(dev14);
		funcionarios.add(dev15);
		funcionarios.add(dev16);
		funcionarios.add(dev17);
		funcionarios.add(dev18);
		System.out.print("\n\nFunionários cadastrados na empresa\n" + funcionarios);
		
		//cáculo da folha salarial com bônus
		funcionarios.forEach(f -> {
			total_folha_com_bonus += f.getSalario() + f.getBonus();
		});
		System.out.println("\n\n******* Total da Folha COM Bônus *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(NumberFormat.getCurrencyInstance().format(funcionarios.stream().mapToDouble(f -> f.getSalario() + f.getBonus()).sum()));
		
		//cáculo da folha salarial sem bônus
		funcionarios.forEach(f -> {
			total_folha_sem_bonus += f.getSalario();
		});
		System.out.println("\n\n******* Total da Folha SEM Bônus *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_sem_bonus));
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(NumberFormat.getCurrencyInstance().format(funcionarios.stream().mapToDouble(f -> f.getSalario()).sum()));
		
		//cáculo do valor do bônus e do salário bruto de cada funcionário
		System.out.print("\n\n******* Salário bruto, bônus e salário de cada funcionário *******");
		funcionarios.forEach(f -> {
			double salarioBruto = f.getSalario() + f.getBonus();
			System.out.println("\nFuncionário: " + f.getNome());
			System.out.println("Cargo: " + f.getClass().getSimpleName());
			System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
			System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
			System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
			
		});
		
		//cálculo do salário com o reajuste de 5%
		total_folha_com_bonus = 0.0;
		funcionarios.forEach(f -> {
			f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
			total_folha_com_bonus += f.getSalario() + f.getBonus();
		});
		System.out.println("\n\n******* Total da Nova Folha COM Bônus *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
//		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
//		System.out.println(
//			NumberFormat.getCurrencyInstance().format(
//				funcionarios.stream().mapToDouble(f -> {
//					f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
//					return f.getSalario() + f.getBonus();
//				}).sum()
//			)
//		);
	}

}
