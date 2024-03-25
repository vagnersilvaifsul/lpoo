package model;

public class Cliente implements Investidor { //Questão 1a
	private int id;
	private String nome;
	private String sobrenome;
	private String ticker;
	private int quantidade;
	
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String sobrenome, String ticker, int quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ticker = ticker;
		this.quantidade = quantidade;
	}
	
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
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String getTicker() {
		return ticker;
	}
	
	@Override
	public void setTicker(String ticker) {
		this.ticker = ticker;		
	}
	
	@Override
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;	
	}
	@Override
	public String toString() {
		return "\nClienteV [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", ticker=" + ticker
				+ ", quantidade=" + quantidade + "]";
	}
	
	
	
}
