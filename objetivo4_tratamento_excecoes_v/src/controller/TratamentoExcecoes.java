package controller;

import exceptions.MinhaExcecaoNaoVerificada;
import exceptions.MinhaExcecaoVerificada;

public class TratamentoExcecoes {

	public static void main(String[] args) {

		/*
			Para entender o mecanismo de exceções procure responder as seguintes questões: (Baseado em: DEITEL, Paul J.; DEITEL, Harvey M. Java: como programar. 10. ed. Páginas 347-371. São Paulo: Pearson, 2010.
			1. O que é uma exceção? (Uma exceção é uma indicação de um problema que ocorre durante a execução de um programa.)
			2. Quando uma aplicação gera uma exceção?
			3. O que é a Pilha de Exceção?
			4. Qual é a organização do SDK do Java para responder as exceções: Vide https://apnp.ifsul.edu.br/pluginfile.php/1246698/mod_resource/content/1/Excecoes_Java2.jpg ou https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html
			5. O que é exceção detectada em tempo de projeto? (São as exceções filhas de Exception)
			6. O que é exceção detectada em tempo de execução? (São as exceções filhas de RuntimeException)
			7. Posso criar minhas próprias classes de exceção? (Sim, basta extender Exception ou RuntimeException, ou qualquer classe de exceção do SDK do Java)
			8. O que acontece com a execução da aplicação quando é lançada uma exceção (no Java)?
		 */
		/*
		 	Segundo Deitel (2010), todas as classes que são herdadas da classe Exception,
		 	mas não direta ou indiretamente da classe RuntimeException, são consideradas
		 	EXCEÇÕES VERIFICADAS.
		 */

		// Resposta a questão 2: Quando há uma Divisão por Zero, por exemplo.
		//System.out.println(10/0);

		// Resposta a questão 2: Quando há uma referência para um objeto com ponteiro NULL, por exemplo.
//		Conta conta1 = null;//new Conta4V();
//		System.out.println(conta1.toString());

		//Resposta a questão 3: Quando o método main() chama outro método, o metodo1(), o main() é empilhado na Pilha de Execução
		//medodo1(); //chamada de método, empilha o main() na Pilha de Execução

	}

	private static void medodo1() {
		metodo2(); //chamada o metodo2, e empilha o medodo1() na Pilha de Execução

		//lança uma exceção NÃO verificada
		//mythrowExceptionNaoVerificada(); //chama o método para testar esse tipo de exceção

		//lança uma exceção VERIFICADA
//        try {
//            mythrowExceptionVerificada(); //chama o método para testar esse tipo de exceção
//        } catch (MinhaExcecaoVerificada e) {
//            e.printStackTrace();
//        } finally {
//			System.out.println("O código que estiver no bloco finally sempre é executado. Independernte se houve ou não exceção.");
//		}
    }

	private static void metodo2() {
		System.out.println(10/0); //lança uma exceção EM TEMPO DE EXECUÇÃO

//		System.out.println("Executou todas as chamadas.");

		// Resposta a questão 2: Quando há um erro de input no terminal, por exemplo.
//		InputMismatchException exception = new InputMismatchException("Menssagem de exceção");


	}

	// lança uma exceção NÃO verificada
	private static void mythrowExceptionNaoVerificada() {
		throw new MinhaExcecaoNaoVerificada("Estoque insuficiente"); // gera a exceção
	}

	// lança uma exceção VERIFICADA
	private static void mythrowExceptionVerificada() throws MinhaExcecaoVerificada {
		throw new MinhaExcecaoVerificada("Estoque insuficiente"); // gera a exceção
	}

}// fim classe TratamentoExcecoesV
