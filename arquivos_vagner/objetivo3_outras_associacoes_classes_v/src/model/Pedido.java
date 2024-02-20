package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {
	private Long id;
	private String formaPagamento;
	private String estado;
	private Calendar dataCriacao;
	private Calendar dataModificacao;
	private Double totalPedido;
	private Boolean situacao;
	//ligação entre as classes Pedido x Cliente
	Cliente cliente;
	//composição com a classe ItemPedido
	List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		super();
	}

	public Pedido(Long id, String formaPagamento, String estado, Calendar dataCriacao, Calendar dataModificacao,
				  Double totalPedido, Boolean situacao, Cliente cliente, List<ItemPedido> itens) {
		super();
		this.id = id;
		this.formaPagamento = formaPagamento;
		this.estado = estado;
		this.dataCriacao = dataCriacao;
		this.dataModificacao = dataModificacao;
		this.totalPedido = totalPedido;
		this.situacao = situacao;
		this.cliente = cliente;
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Calendar getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(Double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "\nPedido3V [id=" + id + ", formaPagamento=" + formaPagamento + ", estado=" + estado + ", dataCriacao="
				+ dataCriacao + ", dataModificacao=" + dataModificacao + ", totalPedido=" + totalPedido + ", situacao="
				+ situacao + ", cliente=" + cliente + ", itens=" + itens + "]";
	}
		
}
