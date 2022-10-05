package controller;

import java.util.stream.IntStream;

/**
 *  Streams são sequências de elementos que suportam operações de agregação sequenciais e paralelas.
 *
 *  Uma grande vantagem da Stream está no fato de não alterar os dados da Collection Original.
 *  Outra vantagem está no fato das Streams terem sido projetadas para tirar proveito da parelalidade das arquiteturas
 *  dos processadores atuais (dos vários cores que eles podem possuir).
 *
 *  Nesse exemplo é explorada a Interface IntStream a partir de um array de inteiros.
 *
 *  Há interfaces especializadas para operar long (LongStream) e double (DoubleStream), mas implementam as mesma operacões
 *  da interface IntStream. Em outras palavras, aprendendo as operações de IntStream você saberá operar LongStream e DoubleStream.
 *
 **/
public class ProgramacaoFuncional_com_IntStream {
    public static void main(String[] args) {
        //Cria um array de inteiros (de tipo primitivo int)
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7}; //note que criou com o tipo primitivo

        System.out.println("\n***************** Exemplos de Operações Terminais *****************");

        /** Exemplo de aplicação da operação terminal de iteração forEach **/
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Itere sobre esse Stream e faça o que se pede no Predicado (operação terminal - Imprima os valores de v na saída padrão);
         */
        System.out.println("\nExemplo de aplicação da operação terminal forEach:");
        IntStream.of(values) //1
            .forEach(v -> System.out.printf("%d ", v)); //2 - Usa a operação terminal para percorrer cada elemento para imprimi-lo)
        System.out.println();

        /** Exemplo de aplicação de operações terminais de Redução (count, min, max, average, sum e reduce) **/
        //Count
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Conte quantos elementos estão contidos nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal count:");
        System.out.printf("%nCount: %d%n", IntStream.of(values) //1
            .count()); //2

        //Min
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é o valor mínimo nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal min:");
        System.out.printf("\nMin: %d%n", IntStream.of(values) //1
            .min().getAsInt()); //2 (Como o min retorna um Optional (na verdade um tipo especializado OptionalInt) ele deve ser convertido para int

        //Max
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é o valor máximo nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal max:");
        System.out.printf("\nMax: %d%n", IntStream.of(values) //1
            .max().getAsInt()); //2 (Como o min retorna um Optional (na verdade um tipo especializado OptionalInt) ele deve ser convertido para int

        //Average
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é a média dos valor contidos nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal average:");
        System.out.printf("\nAverage: %.2f%n", IntStream.of(values) //1
            .average().getAsDouble()); //2 (Como o min retorna um Optional (na verdade um tipo especializado OptionalDouble) ele deve ser convertido para doble

        //Sum
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é a soma dos valores contidos nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal sum:");
        System.out.printf("\nSum: %d", IntStream.of(values) //1
            .sum()); //2
        System.out.printf("%nSum com range de 1 a 9 (soma os números inteiros de 1 ao 9): %d", IntStream.range(1, 9).sum());
        System.out.printf("%nSum com range de 1 a 10 (soma os números inteiros de 1 ao 10): %d%n", IntStream.rangeClosed(1, 10).sum());

        //Reduce
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é a soma dos valores contidos nessa Stream;

            Obs.: O exemplo trada da adição, mas poderia ser qualquer outra operação da artmética, desde que, redutível (reduce).
            Entendeu o poder da operação de redução Reduce? (ela extende o poder das operações redutíveis)
         */
        System.out.print("\nExemplos de aplicação da operação terminal reduce:");
        System.out.printf("\nReduce (Soma de todos valores da Collection): %d%n", IntStream.of(values) //1
            .reduce(0, Integer::sum)); //2

        System.out.print("\nO produto de todos os valores");
        System.out.printf("\nReduce (Produto dos valores): %,d%n", IntStream.of(values) //1
            .reduce(1, (x, y) -> x * y)); //2


        System.out.println("\n***************** Exemplos de Operações Intermediárias *****************");
        /*
        *   ATENÇÃO: Toda operação intermediária é inicializada por uma operação terminal.
        * */

        /** Exemplo de aplicação da operação intermediária filter e sorted **/
        //Filter e sorted
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Filtre a stream baseado no Predicado;
            3. Classifique a Stream em ordem crescente;
            4. Itere sobre esse Stream e imprima os valores contidos na Stream;
         */
        System.out.println("\nExemplo de aplicação da operação intermediária filter e sorted:");
        System.out.println("Saída ordenada para o filtro aplicado (somente valores pares)");
        IntStream.of(values) //1
            .filter(value -> value % 2 == 0) //2 (filtra os valores pares)
            .sorted() //3 (ordena esses valores em ordem crescente)
            .forEach(value -> System.out.printf("%d ", value)); //4 (itera sobre cada valor e o imprime na saída padrão)

        /** Exemplo de aplicação da operação intermediária Map **/
        //Map
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Filtre a stream baseado no Predicado;
            3. Transforme o resultado filtrado em outro valor;
            4. Classifique a Stream em ordem crescente;
            5. Itere sobre esse Stream e imprima os valores contidos na Stream;
         */
        System.out.println("\n\nExemplo de aplicação da operação intermediária Map (e filter, e sorted):");
        System.out.println("Saída ordenada para o Map aplicado (somente valores pares transformados em múltimplos de 10)");
        IntStream.of(values) //1
            .filter(value -> value % 2 == 0) //2 (filtra os valores pares)
            .map(value -> value * 10) //3 (transforma o número filtrado em um múltiplo de 10)
            .sorted() //4 (ordena esses valores em ordem crescente)
            .forEach(value -> System.out.printf("%d ", value)); //5 (itera sobre cada valor e o imprime na saída padrão)

        /** Exemplo de aplicação da operação intermediária distinct **/
        //distinct //TODO: Fazer essa operação e as demais

        System.out.println();
    }
}
