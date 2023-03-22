package controller;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.GregorianCalendar;

import model.Empresa;
import model.Funcionario;

public class EmpresaController {
	public static void main(String[] args) {
		//c
		Funcionario f1 = new Funcionario(1L, "420.345.860-93", "Ana", "Silva", LocalDate.of(2021, 2, 10));
		Funcionario f2 = new Funcionario(2L, "845.943.340-40", "Rafa", "Santos", LocalDate.of(2020, 2, 10));
		Funcionario f3 = new Funcionario(3L, "682.587.180-37", "Júlia", "Dias", LocalDate.of(2019, 2, 10));
		Funcionario f4 = new Funcionario(4L, "054.291.250-32", "Bárbara", "Torres", LocalDate.of(2018, 2, 10));
		Funcionario f5 = new Funcionario(5L, "483.382.190-70", "Danilela", "Ferreira", LocalDate.of(2017, 2, 10));
		Funcionario f6 = new Funcionario(6L, "635.875.980-96", "João", "Nogueira", LocalDate.of(2016, 2, 10));

		Empresa e1 = new Empresa("94.523.466/0001-15", "Dias e Dias Ltda", "Só Dias");
		Empresa e2 = new Empresa("80.481.384/0001-40", "Torres e Torres Ltda", "Só Torres");
		
		e1.getFuncionarios().add(f1);
		e1.getFuncionarios().add(f2);
		e1.getFuncionarios().add(f3);
		
		e2.getFuncionarios().add(f4);
		e2.getFuncionarios().add(f5);
		e2.getFuncionarios().add(f6);
		
		System.out.println("\n\nLista de Funcionários por Empresa (critério nome)");
		System.out.print("\nEmpresa " + e1.getNomeFantasia());
		e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
		System.out.println(e1);
		
		System.out.print("\nEmpresa " + e2.getNomeFantasia());
		e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
		System.out.println(e2);
		
		System.out.println("\n\nLista de Funcionários por Empresa (critério idade)");
		System.out.print("\nEmpresa " + e1.getNomeFantasia());
		e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
		System.out.println(e1);
		
		System.out.print("\nEmpresa " + e2.getNomeFantasia());
		e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
		System.out.println(e2);
		
	}
}
