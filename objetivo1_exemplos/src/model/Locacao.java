package model;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Locacao {
	private Integer id;
	private LocalDateTime dataLocacao;
	private LocalDateTime dataDevolucao;
	private Integer quilometragem;
	private double valorCalcao;
	private double valorLocacao;
	private Boolean devolvido;
	
	public Locacao() {
		super();
	}

	public Locacao(Integer id, LocalDateTime dataLocacao, LocalDateTime dataDevolucao, Integer quilometragem,
                   Double valorCalcao, Double valorLocacao, Boolean devolvido) {
		super();
		this.id = id;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.quilometragem = quilometragem;
		this.valorCalcao = valorCalcao;
		this.valorLocacao = valorLocacao;
		this.devolvido = devolvido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataLocacao() { //note que o retorno desse get não é um calendar (já facilitou para o controller)
		return dataLocacao;
	}

	public void setDataLocacao(LocalDateTime dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public LocalDateTime getDataDevolucao() { //note que o retorno desse get não é um calendar (já facilitou para o controller)
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
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

	public Boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(Boolean devolvido) {
		this.devolvido = devolvido;
	}

	@Override
	public String toString() {
		return "\nLocacao [id=" + id + ", dataLocacao e horaLocacao=" + dataLocacao == null ? DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataLocacao) : null
				+ ", dataDevolucao e horaDevolucao=" + dataDevolucao == null ? DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataDevolucao) : null+ ", quilometragem="
				+ quilometragem + ", valorCalcao=" + NumberFormat.getCurrencyInstance().format(valorCalcao) + ", valorLocacao=" + NumberFormat.getCurrencyInstance().format(valorLocacao) + ", devolvido="
				+ devolvido + "]";
	}
}
