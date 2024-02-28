package model;

public class Modelo {
	//Atributos
	private int id;
	private String descricao;

	//Métodos construtores
	public Modelo() {
		super();
	}
	public Modelo(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	public Modelo(String descricao) {
		this.descricao = descricao;
	}

	//Métodos Acessores (de acesso)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//Converte o Objeto em String
	@Override
	public String toString() {
		return "\nModelo_Lista2 [id=" + id + ", descricao=" + descricao + "]";
	}
	
}
