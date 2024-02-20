package model;

public class Veiculo {
	private long id;
	private String tipo;
	private String placa;
	private int anoFabricacao;
	private Motorista motorista;
	
	public Veiculo() {
		super();
	}

	public Veiculo(long id, String tipo, String placa, int anoFabricacao) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	@Override
	public String toString() {
		return "\nVeiculo [id=" + id + ", tipo=" + tipo + ", placa=" + placa + ", anoFabricacao=" + anoFabricacao
				+ ", motorista=" + motorista + "]";
	}

}
