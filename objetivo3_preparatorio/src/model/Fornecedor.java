package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String cnpj;
    private String razaoSocial;
    private String email;
    private String telefone;

    //associações
    private List<Produto> produtos = new ArrayList<>();

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String razaoSocial, String email, String telefone, List<Produto> produtos) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
        this.produtos = produtos;
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "\nFornecedor{" +
            "cnpj='" + cnpj + '\'' +
            ", razaoSocial='" + razaoSocial + '\'' +
            ", email='" + email + '\'' +
            ", telefone='" + telefone + '\'' +
            ", produtos=" + produtos +
            '}';
    }
}
