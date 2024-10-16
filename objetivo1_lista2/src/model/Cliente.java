package model;

public class Cliente {
	//Atributos
	private int id; //atributo incluído no exercício 2
	private String cpf;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String cep;
	private String telefone;
	private String email;

	//Métodos construtores
	/*
		Note que é possível se utilizar da SOBRECARGA DE MÉTODO para se ter mais de uma forma de construção de objetos.
	 */

	//Construtor Padrão
	public Cliente() {
		super();
	}

	//Construtor Parametrizado (com TODOS os atributos da classe)
	public Cliente(int id, String cpf, String nome, String sobrenome, String endereco, String cep, String telefone, String email) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
	}

	//Construtor Parametrizado (com ALGUNS os atributos da classe)
	public Cliente(String cpf, String nome, String sobrenome) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	//Métodos Acessores (com C mesmo, de acesso)
	/*
		Os métodos acessores funcionam como uma camada de proteção para leitura e escrita dos valores dos atributos da classe.
		A boa prática de Engenharia de Software requer que os atributos sejam protegidos com private para as operações de leitura e escrita (ENCAPSULE).
		Assim, somente membros da própria classe, como os getters e setters, podem ter acesso aos atibutos (gerenciam o ENCAPSULAMENTO).
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Converte o Objeto em String
	/*
		O método toString() já vem no Java na classe Object. Ele é um conversor de Objeto para String.
		O que estamos fazendo aqui é reescrevê-lo, modificando o comportamento que ele tinha na classe Object.
		Ele é muito utilizado em operações de saída, como no console, pois, o System.out.println() requer uma string como parâmetro de saída.
	 */
	@Override
	public String toString() {
		return "\nCliente{" +
			"id=" + id +
			", cpf='" + cpf + '\'' +
			", nome='" + nome + '\'' +
			", sobrenome='" + sobrenome + '\'' +
			", endereco='" + endereco + '\'' +
			", cep='" + cep + '\'' +
			", telefone='" + telefone + '\'' +
			", email='" + email + '\'' +
			'}';
	}
}
