package model;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private Long id;
	private String nome;
	private String uf;
	private List<Atleta>  atletas = new ArrayList<>();
	
	public Time() {
		super();
	}

	public Time(Long id, String nome, String uf, List<Atleta> atletas) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.atletas = atletas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "\nTime3V [id=" + id + ", nome=" + nome + ", uf=" + uf + ", atletas=" + atletas + "]";
	}
	
}
