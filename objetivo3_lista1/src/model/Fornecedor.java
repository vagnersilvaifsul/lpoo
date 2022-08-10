package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	private String cnpj;
	private String contato;
	private String nome;
	private List<ProdutoO3L1> produtos = new ArrayList<>();
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String cnpj, String contato, String nome) {
		super();
		this.cnpj = cnpj;
		this.contato = contato;
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ProdutoO3L1> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoO3L1> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "\nFornecedor [cnpj=" + cnpj + ", contato=" + contato + ", nome=" + nome + "]";
	}
	
	
	
}
