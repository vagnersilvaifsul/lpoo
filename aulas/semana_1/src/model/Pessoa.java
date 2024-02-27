package model;

public class Pessoa {
    String nome;
    String cpf;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, int idade) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa() {
    }
}
