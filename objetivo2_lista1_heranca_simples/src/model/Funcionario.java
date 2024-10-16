package model;

/*
	Note que a classe Funcionario é "abstract".
	Isso significa que estamos bloqueando a criação de instâncias (objetos) de Funcionário.
	Em outras palavras, Funcionario é a abstração de suas classes filhas, nesse caso, Desenvolvedor e Gerente.

	Aqui estamos aplicando o conceito de ABSTRAÇÃO.
	A Abstração nos permite eliminar o código que se repetiria nas classes filhas, passando-o para a classe mãe.

 	Na UML dizemos que a clase Funcionario é o caso Genérico de Desenvolvedor e Gerente, ambas, especializações de Funcionario.
 */
public abstract class Funcionario { //Questão 1a
	protected String nome;
	protected double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	/*
		Aqui estamos utilizando o conceito de ABSTRAÇÃO novamente, só que agora em um método.
		Note que a aplicação do conceito em um método é diferente de uma classe.

		Um método é marcado como ABSTRACT quando se deseja que as filhas definam o algoritmo.
		Isso nasce do fato do algoritmo ser diferente em cada classe filha.

		Note que existem MÉTODOS ABSTRATOS E MÉTODOS CONCRETOS.

	 */
	//isso é um método abstrato, pois não tem algoritmo nele (termina com ; )
	public abstract double getBonus();

	//Isso é um método concreto, pois tem algoritmo nele (tem um bloco de código entre as {} )
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
