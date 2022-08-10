package control;

import java.util.InputMismatchException;

public class TratamentoExcecoesV {

	public static void main(String[] args) {

		// Divisão por Zero
		System.out.println(10/0);

		// NullPointerException (Ponteiro Nulo)
//		Conta4V conta1 = null;//new Conta4V();
//		System.out.println(conta1.toString());

		// analisando a Pilha de exceção
		//comportamento1(); // chamada de método

	}

	private static void comportamento1() {
		comportamento2(); // chamada de método
	}

	private static void comportamento2() {
		// Divisão por Zero
		//System.out.println(10/0); //lança a exceção
		// System.out.println("Executou todas as chamadas.");

//		InputMismatchException exception = new InputMismatchException();
//		throw exception;

		
		//throwException();	

		
		mythrowException();
		

	}

	// Exemplo de Tipo prórpio de Exceção
	// lança uma exceção verificada de uma classe criada pelo programador
	private static void mythrowException() {
		try { //try-catch é um único comando, deve vir juntos
			System.out.println("Tentou executar o bloco try, mas lança a MinhaExcecao");
			throw new MinhaExcecao(); // gera a exceção
		} catch (MinhaExcecao e) { // pega a exceção lançada no bloco try
			e.printStackTrace(); //imprime a stack de exceção
		} finally { // executa em qualquer caso, seja resultado da execução do try ou do catch
			System.err.println("Finally executado em mythrowException()");
		}
	}

	// lança uma exceção verificada.
	/*
	 * Segundo Deitel (2010), todas as classes que são herdadas da classe Exception,
	 * mas não direta ou indiretamente da classe RuntimeException, são consideradas
	 * exceções verificadas.
	 */
	private static void throwException() {
		// throw an exception and immediately catch it
		try {
			
		} catch (Exception exception) { // catch exception thrown in try
			System.err.println("Exceção tratata no bloco catch de throwException()");
			throw exception; // rethrow for further processing
		} finally { // executes regardless of what occurs in try...catch
			System.err.println("Finally executado em  throwException()");
		}

		// code here would not be reached; would cause compilation errors

	}

}// fim classe TratamentoExcecoesV

class MinhaExcecao extends Exception {
	public MinhaExcecao() {
		super("Meu problema ... forcei um na minha classe");
	}
}

//Classe utilizada para demonstrar o NullPointerException
class Conta4V {
	private Double saldo = 0.0;

	public Conta4V() {
		super();
	}

	public Conta4V(Double saldo) {
		super();
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nConta [saldo=" + saldo + "]";
	}

}
