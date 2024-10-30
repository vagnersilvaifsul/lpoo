package model;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int id;
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Carro() {
    }
    // contrutor com a implementação de id.
    public Carro(String marca, String modelo, int anoFabricacao, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
