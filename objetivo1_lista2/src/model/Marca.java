package model;

public class Marca {
	private int id;
	private String descricao;

	public Marca() {
		super();
	}

	public Marca(int id, String descricao) {
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
		return "\nMarca_Lista2 [id=" + id + ", descricao=" + descricao + "]";
	}
	
}
