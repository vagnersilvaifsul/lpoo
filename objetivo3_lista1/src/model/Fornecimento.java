package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fornecimento {
	private Calendar data;
	private double total;
	private Fornecedor fornecedor;
	private ProdutoO3L1 produto;

	public Fornecimento() {
		super();
	}

	public Fornecimento(Calendar data, double total, Fornecedor fornecedor, ProdutoO3L1 produto) {
		super();
		this.data = data;
		this.total = total;
		this.fornecedor = fornecedor;
		this.produto = produto;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ProdutoO3L1 getProduto() {
		return produto;
	}

	public void setProduto(ProdutoO3L1 produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "\n\nFornecimento [data=" + calendarToString(data) + ", total=" + NumberFormat.getCurrencyInstance().format(total) + ", fornecedor=" + fornecedor + ", produto=" + produto
				+ "]";
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
