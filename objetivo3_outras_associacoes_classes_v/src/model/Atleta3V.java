package model;

import java.util.Calendar;

public class Atleta3V {
	private Long id;
	private String cpf;
	private String nome;
	private String sobrenome;
	private Calendar dataNascimento;
	
	public Atleta3V() {
		super();
	}

	public Atleta3V(Long id, String cpf, String nome, String sobrenome, Calendar dataNascimento) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "\nAtleta3V [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", dataNascimento=" + dataNascimento + "]";
	}
	
}
