package model;

public class Cliente {
	//atributos
	private String cpf;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String cep;
	private String telefone;
	private String email;	
	
	//Métodos construtores
	public Cliente() {
		super();
	}

	public Cliente(String cpf, String nome, String sobrenome, String endereco, String cep, String telefone,
				   String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
	}

	//Métodos acessores
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

	@Override
	public String toString() {
		return "\nCliente [cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + ", endereco=" + endereco
				+ ", cep=" + cep + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}
