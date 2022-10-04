package model;

import java.text.NumberFormat;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	private String departamento;
	
	public Funcionario() {
		super();
	}
		
	public Funcionario(int id, String nome, double salario, String departamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/* ATENÇÃO: O critério do equals e hashcode foi modificado para salário */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Funcionario that = (Funcionario) o;

		return Double.compare(that.salario, salario) == 0;
	}

	@Override
	public int hashCode() {
		long temp = Double.doubleToLongBits(salario);
		return (int) (temp ^ (temp >>> 32));
	}

	@Override
	public String toString() {
		return "\nFuncionario{" +
			"id=" + id +
			", nome='" + nome + '\'' +
			", salario=" + salario +
			", departamento='" + departamento + '\'' +
			'}';
	}
}
