package model;

public abstract class Veiculo { //Questão 1a
	private int numeroDeEixos;
	private String propulsao;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	public Veiculo() {
		super();
	}

	public Veiculo(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao) {
		super();
		this.numeroDeEixos = numeroDeEixos;
		this.propulsao = propulsao;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public int getNumeroDeEixos() {
		return numeroDeEixos;
	}

	public void setNumeroDeEixos(int numeroDeEixos) {
		this.numeroDeEixos = numeroDeEixos;
	}

	public String getPropulsao() {
		return propulsao;
	}

	public void setPropulsao(String propulsao) {
		this.propulsao = propulsao;
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
	
}
