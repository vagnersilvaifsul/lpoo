package model;

import java.text.NumberFormat;

public class Automovel {
	//Atributos
	private String renavan;
	private String placa;
	private String cor;
	private int num_rodas;
	private String combustivel;
	private int quilometragem;
	private String chassi;
	private double valor_locacao;

	//Métodos construtores
	/*
		Note que é possível se utilizar da SOBRECARGA DE MÉTODO para se ter mais de uma forma de construção de objetos.
	 */

	//Construtor Padrão
	public Automovel() {
		super();
	}

	//Construtor Parametrizado (com TODOS os atributos da classe)
	public Automovel(String renavan, String placa, String cor, Integer num_rodas, String combustivel,
					 Integer quilometragem, String chassi, Double valor_locacao) {
		super();
		this.renavan = renavan;
		this.placa = placa;
		this.cor = cor;
		this.num_rodas = num_rodas;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
		this.chassi = chassi;
		this.valor_locacao = valor_locacao;
	}

	//Construtor Parametrizado (com ALGUNS os atributos da classe)
	public Automovel(String placa, String cor) {
		this.placa = placa;
		this.cor = cor;
	}

	//Métodos Acessores (com C mesmo, de acesso)
	/*
		Os métodos acessores funcionam como uma camada de proteção para leitura e escrita dos valores dos atributos da classe.
		A boa prática de Engenharia de Software requer que os atributos sejam protegidos com private para as operações de leitura e escrita (ENCAPSULE).
		Assim, somente membros da própria classe, como os getters e setters, podem ter acesso aos atibutos (gerenciam o ENCAPSULAMENTO).
	 */
	public String getRenavan() {
		return renavan;
	}
	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNum_rodas() {
		return num_rodas;
	}
	public void setNum_rodas(int num_rodas) {
		this.num_rodas = num_rodas;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public double getValor_locacao() {
		return valor_locacao;
	}
	public void setValor_locacao(double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	//Converte o Objeto em String
	/*
		O método toString() já vem no Java na classe Object. Ele é um conversor de Objeto para String.
		O que estamos fazendo aqui é reescrevê-lo, modificando o comportamento que ele tinha na classe Object.
		Ele é muito utilizado em operações de saída, como no console, pois, o System.out.println() requer uma string como parâmetro de saída.
	 */
	@Override
	public String toString() {
		return "\nVeiculo [renavan=" + renavan + ", placa=" + placa + ", cor=" + cor + ", num_rodas=" + num_rodas
				+ ", combustivel=" + combustivel + ", quilometragem=" + quilometragem + ", chassi=" + chassi
				+ ", valor_locacao=" + NumberFormat.getCurrencyInstance().format(valor_locacao) + "]";
	}
	
}
