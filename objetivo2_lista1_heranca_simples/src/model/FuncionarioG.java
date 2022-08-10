package model;

public abstract class FuncionarioG {
	private String nome;
	private double salario;
	
	public FuncionarioG() {
		super();
	}

	public FuncionarioG(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract double getBonus();
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
