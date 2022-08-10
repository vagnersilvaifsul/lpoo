package control;

import java.util.Comparator;

import model.Aluno;
import model.Disciplina;

public class AlunoController {

	public static void main(String[] args) {
		
		//b
		Aluno a1 = new Aluno(1L, "Ana", "Silva");
		Aluno a2 = new Aluno(2L, "Rafael", "Santos");
		
		Disciplina d1 = new Disciplina(1L, "LPOO");
		Disciplina d2 = new Disciplina(2L, "PDM");
		Disciplina d3 = new Disciplina(3L, "TADS");
		
		a1.getDisciplinas().add(d1);
		a1.getDisciplinas().add(d2);
		
		a2.getDisciplinas().add(d1);
		a2.getDisciplinas().add(d2);
		a2.getDisciplinas().add(d3);
		
		System.out.println("\n\n---- Questão b ----");
		System.out.print("\nDisciplinas por aluno");
		a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
		System.out.println(a1);
		a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
		System.out.println(a2);
		
		//desfazendo as matriculas de a2
		a2.getDisciplinas().clear();
		System.out.print("\nReimpressão de Disciplinas por aluno");
		a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
		System.out.println(a1);
		a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
		System.out.println(a2);
		
	}

}
