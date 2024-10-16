package model;

//No diagrama UML o nome da classe está em itálico, logo, deve ser marcado como abstract
public abstract class Funcionario { //Questão 1a
	protected String nome;
	protected double salario;
	
	public Funcionario() {

	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
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
	
	public void setSalario(double salaario) {
		this.salario = salaario;
	}
	
	//No diagrama UML está em itálico, logo, deve ser marcado como abstract e finalizar com ;
	public abstract double getBonus();
}
