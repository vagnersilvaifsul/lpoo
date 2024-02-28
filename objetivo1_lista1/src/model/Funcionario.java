package model;

import java.text.NumberFormat;

public class Funcionario {
	//Atributos
	private int id;
	private String nome;
	private double salario;

	//Métodos Construtores
	public Funcionario() {
		super();
	}
		
	public Funcionario(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	//Métodos Acessores (de acesso)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Converte o Objeto em String
	@Override
	public String toString() {
		return "\nFuncionario [id=" + id + ", nome=" + nome + ", salario=" + NumberFormat.getCurrencyInstance().format(salario) + "]";
	}
	
}
