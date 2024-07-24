package controller;

import java.time.LocalDate;
import java.util.Comparator;

import model.Empresa;
import model.Funcionario;

public class EmpresaController {
	public static void main(String[] args) {
		//c
		Funcionario f1 = new Funcionario(1L, "420.345.860-93", "Ana", "Silva", LocalDate.of(2021, 2, 10));
		Funcionario f2 = new Funcionario(2L, "845.943.340-40", "Rafa", "Santos", LocalDate.of(2020, 2, 10));

		Empresa e1 = new Empresa("94.523.466/0001-15", "Dias e Dias Ltda", "Só Dias");
		
		e1.getFuncionarios().add(f1);
		e1.getFuncionarios().add(f2);
		
		System.out.println("\n\nLista de Funcionários por Empresa (critério nome)");
		System.out.print("\nEmpresa " + e1.getNomeFantasia());
		e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
		System.out.println(e1);
	}
}
