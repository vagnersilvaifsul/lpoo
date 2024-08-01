package controller;

import exceptions.MinhaExcecaoNaoVerificada;
import exceptions.MinhaExcecaoVerificada;

import java.util.Scanner;

public class TratamentoExcecoes {

	public static void main(String[] args) {

		/*
			Para entender o mecanismo de exceções procure responder as seguintes questões: (Baseado em: DEITEL, Paul J.; DEITEL, Harvey M. Java: como programar. 10. ed. Páginas 347-371. São Paulo: Pearson, 2010.
			1. O que é uma exceção? (Uma exceção é uma indicação de um problema que ocorre durante a execução de um programa.)
			2. Quando uma aplicação gera uma exceção? (As exceções são lançadas (isto é, a exceção ocorre) quando um método detecta um problema e é incapaz de tratá-lo.)
			3. O que é a Pilha de Rastreamento de Exceção?
			4. Qual é a organização do SDK do Java para responder as exceções? O SDK do Java já traz um conjunto de exceções que podem ser lançadas? Vide https://apnp.ifsul.edu.br/pluginfile.php/1246698/mod_resource/content/1/Excecoes_Java2.jpg ou https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html
			5. O que é Exceção Verificda em tempo de projeto? (São as exceções filhas de Exception, também conhecidas como EXCEÇÕES VERIFICADAS pelo compilador.)
			6. O que é Exceção NÃO Verificada em tempo de projeto? (São as exceções filhas de RuntimeException, ou de tempo de execução, também conhecidas como Exceções NÃO Verificadas pelo compilador.)
			7. Posso criar minhas próprias classes de exceção? (Sim, basta extender Exception ou RuntimeException, ou qualquer classe filha de Exception ou RuntimeException do SDK do Java)
			8. O que acontece com a execução da aplicação quando é lançada uma exceção (no Java)? (A execução da aplicação é interrompida. Mas, no Java, há casos que ela pode continuar em excecução, depende de como se trata a esceção.)
			9. Qual o papel do comando try-catch e o try-catch-finally? Tratar exceções verificadas (obrigatório) ou exceções não verificadas (opcional).
			10. Qual o papel da cláusula throws? Indicar que um método lança determinada exceção em seu bloco interno (basta separar as exceções por vírgula para indicar mais de uma).
			11. Qual o papel da cláusula throw? Lançar uma exceção, como, new MinhaExcecao("Uma mensagem aqui").
			12. É possível capturar mais de uma exceção em um bloco try-catch? Sim, inserindo duas clásulas catch após um bloco try, ou utilizando o | para separar os argumentos do catch
		 */
		/*
		 	Segundo Deitel (2010), todas as classes que são herdadas da classe Exception,
		 	mas não direta ou indiretamente da classe RuntimeException, são consideradas
		 	EXCEÇÕES VERIFICADAS.
		 	Segundo Deitel (2010), todas as classes que são herdadas da classe RuntimeException,
		 	direta ou indiretamente, são consideradas EXCEÇÕES NÃO VERIFICADAS.
		 */

		//Resposta a questão 2: Quando há uma Divisão por Zero, por exemplo.
		System.out.println(10/0);

		//Resposta a questão 2: Ou, quando há uma referência para um objeto com ponteiro NULL, por exemplo.
//		Conta conta1 = null;//new Conta4V();
//		System.out.println(conta1.toString());

		//Resposta a questão 3: Quando o método main() chama outro método, o metodo1(), o main() é empilhado na Pilha de Execução.
		//E, quando o metodo1() encontra um problema para sua execução ele lança uma Exceção, passando a Pilha de Execução a ser chamada de Pilha de Rastreamento de Exceção, ou simplesmente Pilha de Rastreamento
//		medodo1(); //chamada de método, empilha o main() na Pilha de Execução

	}

	private static void medodo1() {
//		metodo2(); //chamada o metodo2, e empilha o medodo1() na Pilha de Execução

		//lança uma Exceção NÃO Verificada
//		mythrowExceptionNaoVerificada(); //chama o método para testar esse tipo de exceção

		//lança uma Exceção VERIFICADA
		//Resposta a questão 9: demonstra o uso do try-catch-finally
//        try {
//            mythrowExceptionVerificada(); //chama o método para testar esse tipo de exceção
//        } catch (MinhaExcecaoVerificada e) {
//            e.printStackTrace();
//        } finally {
//			System.out.println("O código que estiver no bloco finally sempre é executado. Independernte se houve ou não exceção.");
//		}

		//Resposta a questão 12: demonstra a captura de mais de uma exceção que pode ser lançada em um mesmo bloco try
//        try {
//			mythrowExceptionNaoVerificada(); //chama o método para testar esse tipo de exceção
//			mythrowExceptionVerificada(); //chama o método para testar esse tipo de exceção
//        } catch (MinhaExcecaoVerificada | MinhaExcecaoNaoVerificada e) {
//            throw e.printStackTrace();
//        } finally {
//			System.out.println("O código que estiver no bloco finally sempre é executado. Independernte se houve ou não exceção.");
//		}
    }

	private static void metodo2() {
		System.out.println(10/0); //lança uma exceção EM TEMPO DE EXECUÇÃO

//		System.out.println("Executou todas as chamadas.");

		// Resposta a questão 2: Quando há um erro de input no terminal, por exemplo.
//		Scanner entrada = new Scanner(System.in);
//		int numero = entrada.nextInt(); //experimente colocando uma letra no lugar de um número para lançar a exceção

	}

	// Resposta a questão 6: lança uma Exceção NÃO verificada
	/*
		Observe que a classe MinhaExcecaoNaoVerificada extende RuntimeException.
	 */
	private static void mythrowExceptionNaoVerificada() {
		throw new MinhaExcecaoNaoVerificada("Minha Exceção NÃO Verificada foi lançada."); // //Resposta a questão 11: a cláusula throw lança a exceção
	}

	// Resposta a questão 5:lança uma Exceção VERIFICADA
	/*
		Observe que a classe MinhaExcecaoVerificada extende Exception.
		Observe que o método mythrowExceptionVerificada() é acompanhado pela cláusula throws. Essa cláudula indica
		que esse método lança exceção da classe MinhaExcecaoVerificada em seu corpo.
		Um detalhe importante. A cláusula throws pode indicar mais de uma exceção, basta separá-las por vírgula.
	 */
	private static void mythrowExceptionVerificada() throws MinhaExcecaoVerificada { //Resposta a questão 10
		throw new MinhaExcecaoVerificada("Minha EXCEÇÃO VERIFICADA foi lançada."); // a cláusula throw lança a exceção
	}

}// fim classe TratamentoExcecoesV
