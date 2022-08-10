package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private List<FuncionarioO3L1> funcionarios = new ArrayList<>();
	
	public Empresa() {
		super();
	}

	public Empresa(String cnpj, String razaoSocial, String nomeFantasia) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public List<FuncionarioO3L1> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioO3L1> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "\nEmpresa [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia
				+ ", funcionarios=" + funcionarios + "]";
	}

}
