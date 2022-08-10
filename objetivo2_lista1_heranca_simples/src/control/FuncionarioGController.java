package control;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import model.DesenvolvedorG;
import model.DesenvolvedorJuniorG;
import model.DesenvolvedorPlenoG;
import model.DesenvolvedorSeniorG;
import model.FuncionarioG;
import model.GerenteDesenvolvimentoG;
import model.GerenteG;
import model.GerenteGeralG;

public class FuncionarioGController {
	
	private static double total_folha_com_bonus = 0.0;
	private static double total_folha_sem_bonus = 0.0;

	public static void main(String[] args) {
		//1
		DesenvolvedorG dev1 = new DesenvolvedorSeniorG();
		DesenvolvedorG dev2 = new DesenvolvedorSeniorG("Ana", 3500.00);
		GerenteG ger1 = new GerenteGeralG(); //a questão 2 altera isso
		GerenteG ger2 = new GerenteDesenvolvimentoG("Rafael", 4500.00); //a questão 2 altera isso
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
		//1. Não é possível criar instâncias da classe FuncionarioG porquê ela é abastrata.
		//2. Nas classes de modelo, onde o domínio do problema está sendo modelado. No controller se
		//evita colocar regras de negócios do domínio do problema.
		
		//2.
		//cria mais 16 Desenvolvedores
		DesenvolvedorG dev3 = new DesenvolvedorSeniorG("Elis", 3500.00);
		DesenvolvedorG dev4 = new DesenvolvedorSeniorG("João", 3500.00);
		DesenvolvedorG dev5 = new DesenvolvedorSeniorG("Mario", 3500.00);
		DesenvolvedorG dev6 = new DesenvolvedorSeniorG("José", 3500.00);
		DesenvolvedorG dev7 = new DesenvolvedorPlenoG("Júlia", 2500.00);
		DesenvolvedorG dev8 = new DesenvolvedorPlenoG("Paula", 2500.00);
		DesenvolvedorG dev9 = new DesenvolvedorPlenoG("Rafaela", 2500.00);
		DesenvolvedorG dev10 = new DesenvolvedorPlenoG("Denise", 2500.00);
		DesenvolvedorG dev11 = new DesenvolvedorPlenoG("Carlos", 2500.00);
		DesenvolvedorG dev12 = new DesenvolvedorPlenoG("Tomaz", 2500.00);
		DesenvolvedorG dev13 = new DesenvolvedorJuniorG("Cíntia", 1800.00);
		DesenvolvedorG dev14 = new DesenvolvedorJuniorG("Glória", 1800.00);
		DesenvolvedorG dev15 = new DesenvolvedorJuniorG("Caio", 1800.00);
		DesenvolvedorG dev16 = new DesenvolvedorJuniorG("Roberto", 1800.00);
		DesenvolvedorG dev17 = new DesenvolvedorJuniorG("Clara", 1800.00);
		DesenvolvedorG dev18 = new DesenvolvedorJuniorG("Mel", 1800.00);
		
		//adiciona os funcionários a uma coleção do tipo List, assim facilita os cáculos
		List<FuncionarioG> funcionarios = new ArrayList<>();
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
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
		
		//cáculo da folha salarial sem bônus
		funcionarios.forEach(f -> {
			total_folha_sem_bonus += f.getSalario();
		});
		System.out.println("\n\n******* Total da Folha SEM Bônus *******");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_sem_bonus));
		
		//cáculo do valor do bônus e do salário bruto de cada funcionário
		System.out.println("\n\n******* Salário bruto, bônus e salário de cada funcionário *******");
		funcionarios.forEach(f -> {
			double salarioBruto = f.getSalario() + f.getBonus();
			System.out.println("\nFuncionário: " + f.getNome());
			System.out.println("Cargo: " + f.getClass());
			System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
			System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
			System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
			
		});
		
		//cálculo do salário com o reajuste de 5%
		total_folha_com_bonus = 0.0;
		funcionarios.forEach(f -> {
			double novoSalario = f.getSalario() + (f.getSalario() * 0.05);
			f.setSalario(novoSalario);
			total_folha_com_bonus += f.getSalario() + f.getBonus();
		});
		System.out.println("\n\n******* Total da Nova Folha COM Bônus *******");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));

	}

}
