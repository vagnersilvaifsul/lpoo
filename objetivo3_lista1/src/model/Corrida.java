package model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Corrida {
	private long id;
	private String tipoPagamento;
	private String detalhesPagamento;
	private LocalDateTime dataInicio;
	private double preco;
	private Usuario usuario;
	private Motorista motorista;

	public Corrida() {
		super();
	}

	public Corrida(long id, String tipoPagamento, String detalhesPagamento, LocalDateTime dataInicio, double preco,
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

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
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
				+ ", dataInicio=" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataInicio) + ", preco=" + preco + ", usuario=" + usuario + ", motorista="
				+ motorista + "]";
	}
}
