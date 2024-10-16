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

	public static void main(String[] args) {
		System.out.println("\n\n******** Questão 1 ********");

		//1a. está no pacote model

		//1b. está na organização dos pacotes do projeto

		//1c. Crie, no mínimo, duas instâncias de cada classe deste diagrama (das possíveis) em um controlador específico. Tenha o cuidado de criar estas instâncias de diferentes formas, ou seja, utilize construtores padrão e parametrizado;
		Desenvolvedor d1 = new Desenvolvedor(); //uso do construtor padrão
		Desenvolvedor d2 = new Desenvolvedor("Silvia", 1000.00); //uso do construtor parametrizado
		Gerente g1 = new Gerente(); //uso do construtor padrão
		Gerente g2 = new Gerente("Ana", 3000.00);  //uso do construtor parametrizado

		//1d. Imprima os objetos que você criou;
		System.out.println("******** Questão 1d ********");
		System.out.print("Funcionário criados:");
		System.out.println(d1 + "" + d2 + " " + g1 + " " + g2);

		//1e. Altere o estado desses objetos, tenha o cuidado de atribuir valores válidos aos atributos, e imprima-os;
		//aqui só alterei o estado dos objetos que foram construídos com o construtor padrão (pois o parametrizado já inicializa com valores válidos)
		d1.setNome("Tiago");
		d1.setSalario(1000.00);
		g1.setNome("Rafael");
		g1.setSalario(3000.00);
		System.out.println("******** Questão 1e ********");
		System.out.print("\nFuncionário depois de alterá-los com getters e setters:");
		System.out.println(d1 + " " + d2 + " " + g1 + " " + g2);


		//1f. Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra: para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os
		System.out.print("\nBônus de cada funcionário:");
		System.out.print(d1);
		System.out.println(" Bônus= " + d1.getBonus());
		System.out.print(d2);
		System.out.println(" Bônus= " + d2.getBonus());
		System.out.print(g1);
		System.out.println(" Bônus= " + g1.getBonus());
		System.out.print(g2);
		System.out.println(" Bônus= " + g2.getBonus());


		//1g. Responda as seguintes questões (coloque suas respostas como comentário no controlador):
		//1g.i Não é possível criar instâncias da classe Funcionario porque ela é abstrata.
		//1g.ii Nas classes de modelo Gerente e Desenvolvedor, onde o domínio do problema está sendo modelado. No controller se
		//evita colocar regras de negócios do domínio do problema.


		//Questão 2
		System.out.println("\n\n******** Questão 2 ********");

		//2a. Suponha que os funcionários apresentados no diagrama de classes abaixo fazem parte de uma empresa, então, crie uma coleção de objetos para representar a estrutura de funcionários dessa empresa;
		/*
			Note que o tipo de dado manipulado é o tipo da superclasse, Funcionario, pois
			a coleção deve aceitar qualquer tipo específico, como Gerente e Desenvolvedor e suas especializações.
		 */
		List<Funcionario> funcionarios = new ArrayList<>(); //Questão 2a

		//2b. Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18 desenvolvedores.
		//cria os gerentes
		//2i
		Gerente ger1 = new GerenteGeral("Ana Júlia", 6500.00);
		//2ii
		Gerente ger2 = new GerenteDesenvolvimento("Rafael", 4500.00);

		//cria mais 18 Desenvolvedores
		//2iii
		Desenvolvedor dev1 = new DesenvolvedorSenior("Beatriz", 3500.00);
		Desenvolvedor dev2 = new DesenvolvedorSenior("Ana", 3500.00);
		Desenvolvedor dev3 = new DesenvolvedorSenior("Elis", 3500.00);
		Desenvolvedor dev4 = new DesenvolvedorSenior("João", 3500.00);
		Desenvolvedor dev5 = new DesenvolvedorSenior("Mario", 3500.00);
		Desenvolvedor dev6 = new DesenvolvedorSenior("José", 3500.00);
		//2iii
		Desenvolvedor dev7 = new DesenvolvedorPleno("Júlia", 2500.00);
		Desenvolvedor dev8 = new DesenvolvedorPleno("Paula", 2500.00);
		Desenvolvedor dev9 = new DesenvolvedorPleno("Rafaela", 2500.00);
		Desenvolvedor dev10 = new DesenvolvedorPleno("Denise", 2500.00);
		Desenvolvedor dev11 = new DesenvolvedorPleno("Carlos", 2500.00);
		Desenvolvedor dev12 = new DesenvolvedorPleno("Tomaz", 2500.00);
		//2iii
		Desenvolvedor dev13 = new DesenvolvedorJunior("Cíntia", 1800.00);
		Desenvolvedor dev14 = new DesenvolvedorJunior("Glória", 1800.00);
		Desenvolvedor dev15 = new DesenvolvedorJunior("Caio", 1800.00);
		Desenvolvedor dev16 = new DesenvolvedorJunior("Roberto", 1800.00);
		Desenvolvedor dev17 = new DesenvolvedorJunior("Clara", 1800.00);
		Desenvolvedor dev18 = new DesenvolvedorJunior("Mel", 1800.00);

		//adiciona os funcionários na coleção (2b)
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
		System.out.print("Funionários cadastrados na empresa\n" + funcionarios);

		//2c. Calcule e imprima qual é a folha salarial dessa empresa, COM bônus;
		//Método imperativo (como vocês aprenderam em Lógica e Programação)
		double total_folha_com_bonus = 0.0;
		for (Funcionario funcionario : funcionarios) { //forEach (percorre toda coleção de objetos)
			total_folha_com_bonus += funcionario.getSalario() + funcionario.getBonus();
		}
		System.out.println("\n\n******* Total da Folha COM Bônus *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));

		//Método funcional (note que faz a mesma coisa, mas utilizando outra técnica de programação)
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(
			NumberFormat.getCurrencyInstance().format( //Formata para a configuração regional R$
				funcionarios.stream() //1. Cria um fluxo para a estrutura de dados
					.mapToDouble(f -> f.getSalario() + f.getBonus()) //2. Converte de Funcionario para Double
					.sum())); //3. Faz a soma (como acumulador)

		//2d. Calcule e imprima qual é a folha salarial dessa empresa, SEM bônus;
		//Método imperativo (como vocês aprenderam em Lógica e Programação)
		double total_folha_sem_bonus = 0.0;
		for (Funcionario funcionario : funcionarios) {
			total_folha_sem_bonus += funcionario.getSalario();
		}
		System.out.println("\n\n******* Total da Folha SEM Bônus *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_sem_bonus));

		//Método funcional (note que faz a mesma coisa, mas utilizando outra técnica de programação)
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(NumberFormat.getCurrencyInstance().format( //Formata para a configuração regional R$
			funcionarios.stream() //1. Cria um fluxo para a estrutura de dados
				.mapToDouble(f -> f.getSalario()) //2. Converte de Funcionario para Double
				.sum())); //3. Faz a soma (como acumulador)

		//2e. Calcule e imprima o valor do bônus e o salário bruto de cada um dos funcionários dessa empresa;
		System.out.print("\n\n******* Salário bruto, bônus e salário de cada funcionário *******");
		//Método imperativo
		for(Funcionario f : funcionarios) {
			double salarioBruto = f.getSalario() + f.getBonus();
			System.out.println("\nFuncionário: " + f.getNome());
			System.out.println("Cargo: " + f.getClass().getSimpleName());
			System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
			System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
			System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
		}

		//Método funcional (note que faz a mesma coisa, mas utilizando outra técnica de programação)
		funcionarios.forEach(f -> {
			double salarioBruto = f.getSalario() + f.getBonus();
			System.out.println("\nFuncionário: " + f.getNome());
			System.out.println("Cargo: " + f.getClass().getSimpleName());
			System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
			System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
			System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
			
		});

		//2f. Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários, independente de cargo, tenham um reajuste salarial de 5%.
		//Método imperativo
		total_folha_com_bonus = 0.0;
		for(Funcionario f : funcionarios){
			f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
			total_folha_com_bonus += f.getSalario() + f.getBonus();
		}
		System.out.println("\n\n******* Total da Nova Folha COM Reajuste *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));

		//Método funcional (note que faz a mesma coisa, mas utilizando outra técnica de programação)
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(
			NumberFormat.getCurrencyInstance().format( //Formata para a configuração regional R$
				funcionarios.stream() //1. Cria um fluxo para a estrutura de dados
					.mapToDouble(f -> {
						f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
						return f.getSalario() + f.getBonus();
					}) //2. Converte de Funcionario para Double
					.sum() //3. Faz a soma (como acumulador)
			)
		);
	}

}
