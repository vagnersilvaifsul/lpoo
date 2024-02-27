public class Cliente {
    String cpf;
    String nome;
    String sobrenome;
    String endereco;
    String cep;
    String telefone;
    String email;

    public Cliente(String cpf, String nome, String sobrenome, String endereco, String cep, String telefone, String email){
        this.cep = cep;
        this.nome = nome;
        this.email = email;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Cliente() {

    }
}
