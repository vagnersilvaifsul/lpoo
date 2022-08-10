package model;

import java.util.ArrayList;
import java.util.List;

public class Time3V {
	private Long id;
	private String nome;
	private String uf;
	private List<Atleta3V>  atletas = new ArrayList<>();
	
	public Time3V() {
		super();
	}

	public Time3V(Long id, String nome, String uf, List<Atleta3V> atletas) {
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

	public List<Atleta3V> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta3V> atletas) {
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "\nTime3V [id=" + id + ", nome=" + nome + ", uf=" + uf + ", atletas=" + atletas + "]";
	}
	
}
