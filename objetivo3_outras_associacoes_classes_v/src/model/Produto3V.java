package model;

public class Produto3V {

	private Long id;
	private String nome;
	private String descricao;
	private Double valor;
	private Boolean situacao;
	
	public Produto3V() {
		super();
	}

	public Produto3V(Long id, String nome, String descricao, Double valor, Boolean situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "\nProduto3V [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor
				+ ", situacao=" + situacao + "]";
	}
	
	
}
