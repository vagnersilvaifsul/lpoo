package exception;

public class NaoPossuiNumeroDeTelefone extends RuntimeException{
    public NaoPossuiNumeroDeTelefone(String message) {
        super(message);
    }
}
