package model;

public abstract class FuncionarioV {
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salaario) {
		this.salario = salaario;
	}
	
	public abstract double getBonus();
	
	
}
