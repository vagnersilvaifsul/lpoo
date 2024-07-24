package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Corrida {
	private Long id;
	private BigDecimal valor;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private FormaDePagamento formaDePagamento;
	private Situacao situacao;
	private Usuario usuario;
	private Motorista motorista;

	public Corrida() {
	}

	public Corrida(long id, BigDecimal valor, LocalDateTime dataInicio, LocalDateTime dataFim, FormaDePagamento formaDePagamento, Situacao situacao, Usuario usuario, Motorista motorista) {
		this.id = id;
		this.valor = valor;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.formaDePagamento = formaDePagamento;
		this.situacao = situacao;
		this.usuario = usuario;
		this.motorista = motorista;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
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
		return "\nCorrida{" +
			"id=" + id +
			", valor=" + valor +
			", dataInicio=" + dataInicio +
			", dataFim=" + dataFim +
			", formaDePagamento=" + formaDePagamento +
			", situacao=" + situacao +
			", usuario=" + usuario +
			", motorista=" + motorista +
			'}';
	}
}
