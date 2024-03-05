package model;

public class Carro {
	//Atributos
	private int id;
	private String marca;
	private String modelo;
	private int anoFabricacao;

	//Métodos construtores
	public Carro() {
		super();
	}
	public Carro(int id, String marca, String modelo, int anoFabricacao) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	public Carro(int id, String marca, String modelo) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
	}

	//Métodos Acessores (de acesso)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	//Converte o Objeto em String
	@Override
	public String toString() {
		return "\nCarro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + "]";
	}
	
}
