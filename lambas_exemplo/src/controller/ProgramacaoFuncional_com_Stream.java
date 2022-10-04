package controller;

import model.Funcionario;

import java.util.*;
import java.util.stream.IntStream;

/**
 *  Uma grande vantagem da Stream está no fato de não alterar os dados da Collection Original.
 *  Outra vantagem está no fato das Streams terem sido projetadas para tirar proveito da parelalidade das arquiteturas
 *  dos processadores atuais (dos vários cores que eles podem possuir).
 *
 *  Nesse exemplo é explorada a Interface Stream a partir de uma Collection (nesse exemplo, uma List).
 *
 *  Não só é explorada a interface Stream, mas, para tornar o exemplo mais próximo da realidade de sistemas baseados em CRUD,
 *  a Collection (uma List), representa uma coleção de objetos (no exemplo, de objetos da classe Funcionario).
 **/
public class ProgramacaoFuncional_com_Stream {
    public static void main(String[] args) {
        //Cria uma Collection do tipo List de inteiros (de tipo Empacotador de Integer)
        /* Obs.: Toda Collection só aceita tipos Empacotadores de tipos primitivos */
        List<Funcionario> values= getFuncionarioCollection();

        System.out.println("\n***************** Exemplos de Operações Terminais *****************");

        /** Exemplo de aplicação da operação terminal de iteração forEach **/
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Itere sobre esse Stream e faça o que se pede no Predicado (operação terminal - Imprima os valores de v na saída padrão);
         */
        System.out.print("\nExemplo de aplicação da operação terminal forEach:");
        values.stream() //1
            .forEach(v -> System.out.print(v)); //2 - Usa a operação terminal para percorrer cada elemento para imprimi-lo)
        System.out.println();

        /** Exemplo de aplicação de operações terminais de Redução (count, min, max, average, sum e reduce) **/
        System.out.println("\n***Exemplo de aplicação de operações terminais de Redução (count, min, max, average, sum e reduce)***");
        //Count
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Conte quantos elementos estão contidos nessa Stream;
         */
        System.out.print("Exemplo de aplicação da operação terminal count: ");
        System.out.print(values.stream() //1
            .count()); //2

        //Min
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é o valor mínimo nessa Stream;
         */
        System.out.print("\n\nExemplo de aplicação da operação terminal min:");
        System.out.print(values.stream() //1
            .min(Comparator.comparing(Funcionario::getSalario)).get()); //2 (o get retorna o valor do Optional, um Funcionario)

        //Max
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Determine qual é o valor máximo nessa Stream;
         */
        System.out.print("\n\nExemplo de aplicação da operação terminal max:");
        System.out.print(values.stream() //1
            .max(Comparator.comparing(Funcionario::getSalario)).get()); //2 (o get retorna o valor do Optional, um Funcionario)

        //Average
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Transforme o objeto em double (só o atributo, mas é uma conversão, ok?)
            3. Determine qual é a média dos valor contidos nessa Stream (transformada por Map);
         */
        System.out.print("\n\nExemplo de aplicação da operação terminal average:");
        /* Obs.: Com estamos lidando com objetos da classe Funcionário, antes de calcular a média tem que converter o objeto
        *  em double na Stream.
        * */
        System.out.print(values.stream() //1
            .mapToDouble(d -> d.getSalario()) //2 (Faz um Map do atributo salário para double)
            .average()); //3 (Calcula a média)

        //Sum
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir do array (origem de dados);
            2. Transforme o objeto em double (só o atributo, mas é uma conversão, ok?)
            3. Determine qual é a soma dos valores contidos nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal sum:");
        System.out.print(values.stream() //1
            .mapToDouble(d -> d.getSalario()) //2
            .sum()); //3
        System.out.println("\nSum com range");
        System.out.print(values.stream() //1
            .mapToDouble(d -> d.getSalario()) //2
            .sum()); //3

        //TODO: continuar com as demais operações

        System.out.println();
    }

    private static List<Funcionario> getFuncionarioCollection() {
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nList Criada");
        System.out.println(funcionariosList);
        return funcionariosList;
    }
}
