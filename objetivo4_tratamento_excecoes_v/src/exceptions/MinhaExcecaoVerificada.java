package exceptions;

/*
    Há uma diferença sutiu entre extender Exception ou RuntimeException.
    1. Quando se extende Exception é por que se quer que o compilador detecte a exceção em tempo de projeto.
    2. Quando se extende RuntimeException é por que se quer que o compilador não decete a exceção em tempo de projeto,
    mas durente a execução da aplicação.

    Resposta a questão 7: Sim, aqui está a implementação de uma classe de Exceção verificada.
 */
public class MinhaExcecaoVerificada extends Exception{
    public MinhaExcecaoVerificada(String msg) {
        super(msg);
    }
}
