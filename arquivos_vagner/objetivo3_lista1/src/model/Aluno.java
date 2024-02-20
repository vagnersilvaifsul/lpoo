package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private long matricula;
	private String nome;
	private String sobrenome;
	private List<Disciplina> disciplinas = new ArrayList<>();	
	
	public Aluno() {
		super();
	}

	public Aluno(long matricula, String nome, String sobrenome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "\nAluno [matricula=" + matricula + ", nome=" + nome + ", sobrenome=" + sobrenome + ", disciplinas="
				+ disciplinas + "]";
	}
	
}
