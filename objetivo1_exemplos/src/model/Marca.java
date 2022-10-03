package model;

public class Marca {
	private String descricao;

	public Marca() {
		super();
	}

	public Marca(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Marca [descricao=" + descricao + "]";
	}
	
}
