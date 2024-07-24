package model;

public class Disciplina {
	private long codigo;
	private String nome;
	
	public Disciplina() {
	}

	public Disciplina(long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nDisciplina [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
}
