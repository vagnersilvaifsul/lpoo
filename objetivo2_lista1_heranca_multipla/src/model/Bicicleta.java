package model;

public class Bicicleta extends Veiculo {

	private int tamanhoRoda;
	private String chassi; //de int para string na implementação
	
	public Bicicleta(int tamanhoRoda, String chassi) {
		super();
		this.tamanhoRoda = tamanhoRoda;
		this.chassi = chassi;
	}
	
	public Bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int tamanhoRoda, String chassi) {
		super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
		this.tamanhoRoda = tamanhoRoda;
		this.chassi = chassi;
	}
	
	public int getTamanhoRoda() {
		return tamanhoRoda;
	}
	
	public void setTamanhoRoda(int tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	@Override
	public String toString() {
		return "\nBicicleta [Tamanho da roda=" + tamanhoRoda + ", Chassi=" + chassi + ", Numero de Eixos="
				+ getNumeroDeEixos() + ", Propulsão=" + getPropulsao() + ", Marca=" + getMarca()
				+ ", Modelo=" + getModelo() + ", Ano de Fabricacao=" + getAnoFabricacao() + "]";
	}

}
