package model;

import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Locacao {
	//Atributos
	private int id;
	private LocalDateTime dataLocacao;
	private LocalDateTime dataDevolucao;
	private int quilometragem;
	private double valorCalcao;
	private double valorLocacao;
	private boolean devolvido;

	//Métodos construtores
	public Locacao() {
		super();
	}
	public Locacao(Integer id, LocalDateTime dataLocacao, LocalDateTime dataDevolucao, Integer quilometragem,
				   Double valorCalcao, Double valorLocacao, Boolean devolvido) {
		this.id = id;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.quilometragem = quilometragem;
		this.valorCalcao = valorCalcao;
		this.valorLocacao = valorLocacao;
		this.devolvido = devolvido;
	}
	public Locacao(Integer id, Boolean devolvido) {
		this.id = id;
		this.devolvido = devolvido;
	}

	//Métodos Acessores (de acesso)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(LocalDateTime dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	public double getValorCalcao() {
		return valorCalcao;
	}
	public void setValorCalcao(double valorCalcao) {
		this.valorCalcao = valorCalcao;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	public boolean isDevolvido() {
		return devolvido;
	}
	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}

	@Override
	public String toString() {
		return "\nLocacao [id=" + id + ", dataLocacao e horaLocacao=" + dataLocacao
				+ ", dataDevolucao e horaDevolucao=" + dataDevolucao + ", quilometragem="
				+ quilometragem + ", valorCalcao=" + NumberFormat.getCurrencyInstance().format(valorCalcao) + ", valorLocacao=" + NumberFormat.getCurrencyInstance().format(valorLocacao) + ", devolvido="
				+ devolvido + "]";
	}
}
