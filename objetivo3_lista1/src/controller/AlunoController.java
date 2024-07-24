package controller;

import java.util.Comparator;

import model.Aluno;
import model.Disciplina;

public class AlunoController {

	public static void main(String[] args) {
		
		//a
		Aluno a1 = new Aluno(1L, "Ana", "Silva");
		Aluno a2 = new Aluno(2L, "Rafael", "Santos");
		
		Disciplina d1 = new Disciplina(1L, "LPOO");
		Disciplina d2 = new Disciplina(2L, "PDM");

		//b
		a1.getDisciplinas().add(d1);
		a1.getDisciplinas().add(d2);
		a2.getDisciplinas().add(d1);
		a2.getDisciplinas().add(d2);

		//c
		System.out.println("\n***** Relatório de Disciplinas por Aluno *****");
		a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
		System.out.println("Aluno: " + a1.getNome() + ", Matrícula: " + a1.getMatricula());
		System.out.println(a1.getDisciplinas());
		System.out.println("---------------------------");
		a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
		System.out.println("Aluno: " + a1.getNome() + ", Matrícula: " + a1.getMatricula());
		System.out.println(a1.getDisciplinas());
	}

}
