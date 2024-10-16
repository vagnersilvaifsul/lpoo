package model;

public class Cliente implements Associado{
    private String nome;
    private int qdeCotas;

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int getQdeCotas() {
        return this.qdeCotas;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                '}';
    }
}
