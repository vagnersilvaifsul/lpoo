package model;

public class Modelo {
	private int id;
	private String descricao;

	public Modelo() {
		super();
	}

	public Modelo(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

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

	@Override
	public String toString() {
		return "\nModelo_Lista2 [id=" + id + ", descricao=" + descricao + "]";
	}
	
}
