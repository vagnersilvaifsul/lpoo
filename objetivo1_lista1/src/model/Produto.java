package model;

import java.text.NumberFormat;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double valor;
	private int estoque;
	
	//métodos constutores
	public Produto() {
		
	}

	public Produto(int id, String nome, String descricao, double valor, int estoque) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.estoque = estoque;
	}

	//métodos acessores


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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "\nProduto{" +
			"id=" + id +
			", nome='" + nome + '\'' +
			", descricao='" + descricao + '\'' +
			", valor=" + valor +
			", estoque=" + estoque +
			'}';
	}
}
