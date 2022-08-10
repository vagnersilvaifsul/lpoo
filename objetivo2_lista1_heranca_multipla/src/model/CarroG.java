package model;

public class CarroG extends VeiculoG implements AutomovelG {

	private int capacidadePortaMalas;
	private String renavam;
	private String chassi;
	private String placa;
	
	
	
	public CarroG() {
		super();
	}	

	public CarroG(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas , String renavam, String chassi, String placa) {
		super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
		this.capacidadePortaMalas = capacidadePortaMalas;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}

	public int getCapacidadePortaMalas() {
		return capacidadePortaMalas;
	}

	public void setCapacidadePortaMalas(int capacidadePortaMalas) {
		this.capacidadePortaMalas = capacidadePortaMalas;
	}

	@Override
	public String getRenavam() {
		return renavam;
	}

	@Override
	public void setRenavam(String renavam) {
		this.renavam = renavam;

	}

	@Override
	public String getChassi() {
		return chassi;
	}

	@Override
	public void setChassi(String chassi) {
		this.chassi = chassi;

	}

	@Override
	public String getPlaca() {
		return placa;
	}

	@Override
	public void setPlaca(String placa) {
		this.placa = placa;

	}

	@Override
	public String toString() {
		return "\nCarroG [Capacidade do Porta Malas=" + capacidadePortaMalas + ", Renavam=" + renavam + ", Chassi=" + chassi
				+ ", Placa=" + placa + ", Numero de Eixos=" + getNumeroDeEixos() + ", Propulsao="
				+ getPropulsao() + ", Marca=" + getMarca() + ", Modelo=" + getModelo()
				+ ", Ano de Fabricacao=" + getAnoFabricacao() + "]";
	}

}
