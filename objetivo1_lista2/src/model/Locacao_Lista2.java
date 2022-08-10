package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Locacao_Lista2 {
	private Integer id;
	private Calendar dataLocacao;
	private Calendar dataDevolucao;
	private Integer quilometragem;
	private double valorCalcao;
	private double valorLocacao;
	private Boolean devolvido;
	
	public Locacao_Lista2() {
		super();
	}

	public Locacao_Lista2(Integer id, Calendar dataLocacao, Calendar dataDevolucao, Integer quilometragem,
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

	public String getDataLocacao() { //note que o retorno desse get não é um calendar (já facilitou para o controller)
		return calendarToString(dataLocacao);
	}

	public void setDataLocacao(Calendar dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public String getDataDevolucao() { //note que o retorno desse get não é um calendar (já facilitou para o controller)
		return calendarToString(dataDevolucao);
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

	public Boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(Boolean devolvido) {
		this.devolvido = devolvido;
	}

	@Override
	public String toString() {
		return "\nLocacao_Lista2 [id=" + id + ", dataLocacao e horaLocacao=" + calendarToString(dataLocacao)
				+ ", dataDevolucao e horaDevolucao=" + calendarToString(dataDevolucao) + ", quilometragem="
				+ quilometragem + ", valorCalcao=" + NumberFormat.getCurrencyInstance().format(valorCalcao) + ", valorLocacao=" + NumberFormat.getCurrencyInstance().format(valorLocacao) + ", devolvido="
				+ devolvido + "]";
	}
	
	//métodos utilitários para conversão de Calendar para String formatada
	private static String calendarToString(Calendar data) {
		if(data != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
			return sdf.format(data.getTime());
		}
		return "00/00/0000 00:00";
	}

}
