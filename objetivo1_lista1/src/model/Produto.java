package model;

import java.text.NumberFormat;

public class Produto {
	private int id;
	private String nome;
	private double valor;
	private int estoque;
	
	//métodos constutores
	public Produto() {
		
	}

	public Produto(int id, String nome, double valor, int estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	//métodos acessores
	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		int novoEstoque = this.estoque + estoque;
		if(novoEstoque > 0) {
			this.estoque = estoque;
		}
	}

	@Override
	public String toString() {
		return "\nProduto_Lista1 [id=" + id + ", nome=" + nome + ", valor=" + NumberFormat.getCurrencyInstance().format(valor) + ", estoque=" + estoque + "]";
	}

}
