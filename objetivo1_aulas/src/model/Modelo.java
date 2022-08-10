package model;

public class Modelo {
	private String descricao;

	public Modelo() {
		super();
	}

	public Modelo(String descricao) {
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
		return "Modelo [descricao=" + descricao + "]";
	}
	
}
