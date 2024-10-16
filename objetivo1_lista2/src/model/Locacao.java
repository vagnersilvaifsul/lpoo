package model;

import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Locacao {
	//Atributos
	private int id; //atributo incluído no exercício 2
	private LocalDateTime dataLocacao;
	private LocalDateTime dataDevolucao;
	private int quilometragem;
	private double valorCalcao;
	private double valorLocacao;
	private boolean devolvido;

	//Métodos construtores
	/*
		Note que é possível se utilizar da SOBRECARGA DE MÉTODO para se ter mais de uma forma de construção de objetos.
	 */

	//Construtor Padrão
	public Locacao() {
		super();
	}

	//Construtor Parametrizado (com TODOS os atributos da classe)
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

	//Construtor Parametrizado (com ALGUNS os atributos da classe)
	public Locacao(Integer id, Boolean devolvido) {
		this.id = id;
		this.devolvido = devolvido;
	}

	//Métodos Acessores (com C mesmo, de acesso)
	/*
		Os métodos acessores funcionam como uma camada de proteção para leitura e escrita dos valores dos atributos da classe.
		A boa prática de Engenharia de Software requer que os atributos sejam protegidos com private para as operações de leitura e escrita (ENCAPSULE).
		Assim, somente membros da própria classe, como os getters e setters, podem ter acesso aos atibutos (gerenciam o ENCAPSULAMENTO).
	 */
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


	//Converte o Objeto em String
	/*
		O método toString() já vem no Java na classe Object. Ele é um conversor de Objeto para String.
		O que estamos fazendo aqui é reescrevê-lo, modificando o comportamento que ele tinha na classe Object.
		Ele é muito utilizado em operações de saída, como no console, pois, o System.out.println() requer uma string como parâmetro de saída.
	 */
	@Override
	public String toString() {
		return "\nLocacao [id=" + id + ", dataLocacao e horaLocacao=" + dataLocacao
				+ ", dataDevolucao e horaDevolucao=" + dataDevolucao + ", quilometragem="
				+ quilometragem + ", valorCalcao=" + NumberFormat.getCurrencyInstance().format(valorCalcao) + ", valorLocacao=" + NumberFormat.getCurrencyInstance().format(valorLocacao) + ", devolvido="
				+ devolvido + "]";
	}
}
