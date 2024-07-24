package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private List<Corrida> corridas = new ArrayList<>();
	
	public Usuario() {
	}
	
	public Usuario(long id, String nome, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<Corrida> getCorridas() {
		return corridas;
	}
	
	public void setCorridas(List<Corrida> corridas) {
		this.corridas = corridas;
	}

	@Override
	public String toString() {
		return "\nUsuario [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
	
}
