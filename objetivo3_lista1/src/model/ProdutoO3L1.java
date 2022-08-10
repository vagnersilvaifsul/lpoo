package model;

import java.text.NumberFormat;

public class ProdutoO3L1 {
	private long codigo;
	private String nome;
	private int quantidade;
	private double preco;
	private Fornecedor fornecedor;

	public ProdutoO3L1() {
		super();
	}

	public ProdutoO3L1(long codigo, String nome, int quantidade, double preco, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.fornecedor = fornecedor;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "\nProdutoL1 [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + NumberFormat.getCurrencyInstance().format(preco) + "]";
	}

}
