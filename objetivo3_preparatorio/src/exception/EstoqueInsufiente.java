package exception;

public class EstoqueInsufiente extends RuntimeException {
    public EstoqueInsufiente(String mensagem) {
        super(mensagem);
    }
}
