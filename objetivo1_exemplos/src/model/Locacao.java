package model;

import java.util.Calendar;

public class Locacao {
	private Calendar dataLocacao;
	private Calendar dataDevolucao;
	private Integer quilometragem;
	private Double valorCalcao;
	private Double valorLocacao;
	private Boolean devolvido;
	
	public Locacao() {
		super();
	}

	public Locacao(Calendar dataLocacao, Calendar dataDevolucao, Integer quilometragem, Double valorCalcao,
			Double valorLocacao, Boolean devolvido) {
		super();
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.quilometragem = quilometragem;
		this.valorCalcao = valorCalcao;
		this.valorLocacao = valorLocacao;
		this.devolvido = devolvido;
	}

	public Calendar getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Calendar dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Double getValorCalcao() {
		return valorCalcao;
	}

	public void setValorCalcao(Double valorCalcao) {
		this.valorCalcao = valorCalcao;
	}

	public Double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public Boolean getDevolvido() {
		return devolvido;
	}

	public void setDevolvido(Boolean devolvido) {
		this.devolvido = devolvido;
	}

	@Override
	public String toString() {
		return "Locacao [dataLocacao=" + dataLocacao + ", dataDevolucao=" + dataDevolucao + ", quilometragem="
				+ quilometragem + ", valorCalcao=" + valorCalcao + ", valorLocacao=" + valorLocacao + ", devolvido="
				+ devolvido + "]";
	}
	
}
