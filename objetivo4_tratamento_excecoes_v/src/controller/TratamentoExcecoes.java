package controller;

import exceptions.MinhaExcecao;
import model.Conta;

import java.util.InputMismatchException;

public class TratamentoExcecoes {

	public static void main(String[] args) {

		// Divisão por Zero
		//System.out.println(10/0);

		// NullPointerException (Ponteiro Nulo)
//		Conta conta1 = null;//new Conta4V();
//		System.out.println(conta1.toString());

		// analisando a Pilha de exceção
		comportamento1(); // chamada de método

	}

	private static void comportamento1() {
		comportamento2(); // chamada de método
	}

	private static void comportamento2() {
		// Divisão por Zero
//		System.out.println(10/0); //lança a exceção
//		System.out.println("Executou todas as chamadas.");

//		InputMismatchException exception = new InputMismatchException("Menssagem de exceção");
//		throw exception;

		
		//throwException();


		mythrowException();


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
			// Divisão por Zero
			//System.out.println("qualquer coisa");
			System.out.println(10/0); //lança a exceção
		} catch (Exception e) { // catch exception thrown in try
			System.err.println("Exceção tratata no bloco catch de throwException()");
			e.printStackTrace();
		} finally { // executes regardless of what occurs in try...catch
			System.out.println("Finally executado em  throwException()");
		}

		// code here would not be reached; would cause compilation errors

	}

	// Exemplo de Tipo prórpio de Exceção
	// lança uma exceção verificada de uma classe criada pelo programador
	private static void mythrowException() {
		try {
			throw new MinhaExcecao("Estoque insuficiente"); // gera a exceção
		} catch (MinhaExcecao e) {
			e.printStackTrace();
		} finally { // executes regardless of what occurs in try...catch
			System.out.println("Finally executado em  throwException()");
		}
	}

}// fim classe TratamentoExcecoesV
