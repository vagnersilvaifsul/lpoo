package model;

public class Caminhao extends Veiculo implements Automovel { //Questão 1a
	
	private int capacidadeDeCarga;
	private String renavam;
	private String chassi;
	private String placa;

	public Caminhao() {
		super();
	}

	public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa) {
		super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}
	
	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
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
		return "\nCaminhaoG [Capacidade de Carga=" + capacidadeDeCarga + ", Renavam=" + renavam + ", Chassi=" + chassi
				+ ", Placa=" + placa + ", Numero de Eixos=" + getNumeroDeEixos() + ", Propulsao="
				+ getPropulsao() + ", Marca=" + getMarca() + ", Modelo=" + getModelo()
				+ ", Ano de Fabricacao=" + getAnoFabricacao() + "]";
	}

}
