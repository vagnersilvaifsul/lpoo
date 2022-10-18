package model;

public class Cliente extends Object implements Cloneable{
	//atributos
	private Long id;
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

	public Cliente(Long id, String cpf, String nome, String sobrenome, String endereco, String cep, String telefone, String email) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
	}

	//Métodos acessores
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

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//
//		Cliente cliente = (Cliente) o;
//
//		return id.equals(cliente.id);
//	}
//
//	@Override
//	public int hashCode() {
//		return id.hashCode();
//	}

	//	@Override
//	public String toString() {
//		return "Cliente{" +
//			"id=" + id +
//			", cpf='" + cpf + '\'' +
//			", nome='" + nome + '\'' +
//			", sobrenome='" + sobrenome + '\'' +
//			", endereco='" + endereco + '\'' +
//			", cep='" + cep + '\'' +
//			", telefone='" + telefone + '\'' +
//			", email='" + email + '\'' +
//			'}';
//	}


	@Override
	public String toString() {
		return getClass().getName() + '@' + hashCode();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
