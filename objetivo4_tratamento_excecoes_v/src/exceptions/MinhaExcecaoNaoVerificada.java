package exceptions;

/*
    Há uma diferença sutiu entre extender Exception ou RuntimeException.
    1. Quando se extende Exception é por que se quer que o compilador detecte a exceção em tempo de projeto.
    2. Quando se extende RuntimeException é por que se quer que o compilador não decete a exceção em tempo de projeto,
    mas durente a execução da aplicação.
 */
public class MinhaExcecaoNaoVerificada extends RuntimeException{
    public MinhaExcecaoNaoVerificada(String msg) {
        super(msg);
    }
}
