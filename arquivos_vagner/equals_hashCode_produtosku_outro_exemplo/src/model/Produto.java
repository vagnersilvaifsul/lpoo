package model;

public class Produto {
    private String sku;
    private String nome;

    public Produto() {
    }

    public Produto(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return sku.equals(produto.sku);
    }

    @Override
    public int hashCode() {
        return sku.hashCode();
    }

    @Override
    public String toString() {
        return "Produto [sku=" + sku + ", nome=" + nome + "]";
    }
}
