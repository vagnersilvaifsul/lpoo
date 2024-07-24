package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
	private long id;
	private String cpf;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;

	public Funcionario() {
	}

	public Funcionario(long id, String cpf, String nome, String sobrenome, LocalDate dataNascimento) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "\nFuncionario [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", dataNascimento=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNascimento) + "]";
	}
}
