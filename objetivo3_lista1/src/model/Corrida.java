package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Corrida {
	private long id;
	private String tipoPagamento;
	private String detalhesPagamento;
	private Calendar dataInicio;
	private double preco;
	private Usuario usuario;
	private Motorista motorista;

	public Corrida() {
		super();
	}

	public Corrida(long id, String tipoPagamento, String detalhesPagamento, Calendar dataInicio, double preco,
			Usuario usuario, Motorista motorista) {
		super();
		this.id = id;
		this.tipoPagamento = tipoPagamento;
		this.detalhesPagamento = detalhesPagamento;
		this.dataInicio = dataInicio;
		this.preco = preco;
		this.usuario = usuario;
		this.motorista = motorista;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getDetalhesPagamento() {
		return detalhesPagamento;
	}

	public void setDetalhesPagamento(String detalhesPagamento) {
		this.detalhesPagamento = detalhesPagamento;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	@Override
	public String toString() {
		return "\n\nCorrida [id=" + id + ", tipoPagamento=" + tipoPagamento + ", detalhesPagamento=" + detalhesPagamento
				+ ", dataInicio=" + calendarToString(dataInicio) + ", preco=" + preco + ", usuario=" + usuario + ", motorista="
				+ motorista + "]";
	}

	// métodos utilitários para conversão de Calendar para String formatada
	private static String calendarToString(Calendar data) {
		if (data != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
			return sdf.format(data.getTime());
		}
		return "00/00/0000 00:00";
	}

}
