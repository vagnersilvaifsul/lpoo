package controller;

import model.Funcionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        //forEach
        //Realiza o processamento em cada elemento em um fluxo (por exemplo, exibir cada elemento).
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Itere sobre esse Stream e faça o que se pede no Predicado (operação terminal - Imprima os valores de v na saída padrão);
         */
        System.out.print("\nExemplo de aplicação da operação terminal forEach:");
        values.stream() //1
            .forEach(v -> System.out.print(v)); //2 - Usa a operação terminal para percorrer cada elemento para imprimi-lo)
        System.out.println();

        /** Exemplo de aplicação de operações terminais de Redução (count, min, max, average, sum e reduce) **/
        System.out.println("\n***Exemplo de aplicação de operações terminais de Redução (count, min, max, average, sum e reduce)***");
        //count
        //Retorna o número de elementos no fluxo.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Conte quantos elementos estão contidos nessa Stream;
         */
        System.out.print("Exemplo de aplicação da operação terminal count: ");
        System.out.print(values.stream() //1
            .count()); //2

        //min
        //Localiza o menor valor em um fluxo numérico.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Determine qual é o valor mínimo nessa Stream;
         */
        System.out.print("\n\nExemplo de aplicação da operação terminal min:");
        System.out.print(values.stream() //1
            .min(Comparator.comparing(Funcionario::getSalario)).get()); //2 (o get retorna o valor do Optional, um Funcionario)

        //max
        ////Localiza o maior valor em um fluxo numérico.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Determine qual é o valor máximo nessa Stream;
         */
        System.out.print("\n\nExemplo de aplicação da operação terminal max:");
        System.out.print(values.stream() //1
            .max(Comparator.comparing(Funcionario::getSalario)).get()); //2 (o get retorna o valor do Optional, um Funcionario)

        //average
        //Calcula a média dos elementos em um fluxo numérico.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Transforme o objeto em double (só o atributo, mas é uma conversão, ok?)
            3. Determine qual é a média dos valor contidos nessa Stream (transformada por Map);
         */
        System.out.print("\n\nExemplo de aplicação da operação terminal average:");
        /* Obs.: Com estamos lidando com objetos da classe Funcionário, antes de calcular a média tem que converter o objeto
        *  em double na Stream.
        * */
        System.out.print(values.stream() //1
            .mapToDouble(f -> f.getSalario()) //2 (Faz um Map do atributo salário para double)
            .average()); //3 (Calcula a média)

        //sum
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Transforme o objeto em double (só o atributo, mas é uma conversão, ok?)
            3. Determine qual é a soma dos valores contidos nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal sum:");
        System.out.print(values.stream() //1
            .mapToDouble(d -> d.getSalario()) //2
            .sum()); //3
        System.out.println("\nSum com range");
        System.out.print(values.stream() //1
            .mapToDouble(f -> f.getSalario()) //2
            .sum()); //3

        //reduce
        //Reduz os elementos de uma coleção a um único valor usando uma função de acumulação associativa (por exemplo, uma lambda que soma dois elementos).
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Transforme o objeto em double (só o atributo, mas é uma conversão, ok?)
            3. Determine qual é a soma dos valores contidos nessa Stream;

            Obs.: O exemplo trada da adição, mas poderia ser qualquer outra operação da artmética, desde que, redutível (reduce).
            Entendeu o poder da operação de redução Reduce? (ela extende o poder das operações redutíveis)
         */
        System.out.print("\nExemplos de aplicação da operação terminal reduce:");
        System.out.println("\nReduce (Soma de todos valores da Collection): " + values.stream() //1
            .mapToDouble(f -> f.getSalario()) //2
            .reduce(0, Double::sum)); //3

        System.out.println("\nReduce (Produto de todos valores da Collection): " + values.stream() //1
            .mapToDouble(f -> f.getSalario()) //2
            .reduce(1, (x, y) -> x * y)); //3 (ao invés de soma, determinou o produto)

        //collect
        //Cria uma nova coleção dos elementos contendo os resultados das operações anteriores do fluxo.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Coleta a stream para uma List.
         */
        System.out.print("\nExemplos de aplicação da operação terminal collect:");
        System.out.println(values.stream() //1
            .collect(Collectors.toList())); //2

        //toArray
        //Cria um array contendo os resultados das operações anteriores do fluxo.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Coleta a stream para um Array.
         */
        System.out.print("\nExemplos de aplicação da operação terminal toArray:");
        Object[] array = values.stream() //1
            .toArray(size -> new Object[size]);//2
        Arrays.stream(array).forEach(System.out::print); //para imprimir utilizou stream e a operação terminal forEach

        //builder
        System.out.println("\nExemplos de aplicação da operação terminal builder:");
        // Using Stream builder()
        Stream.Builder<String> builder = Stream.builder();
        // Adding elements in the stream of Strings
        Stream<String> stream = builder.add("Geeks").build();
        // Displaying the elements in the stream
        stream.forEach(System.out::println);


        System.out.println("\n\n***************** Exemplos de Operações Intermediárias *****************");
        /*
         *   ATENÇÃO: Toda operação intermediária é inicializada por uma operação terminal.
         * */

        /** Exemplo de aplicação da operação intermediária filter e sorted **/
        //filter e sorted
        //filter: Resulta em um fluxo contendo apenas os elementos que atendem uma condição.
        //sorted: Resulta em um fluxo em que os elementos estão em ordem classificada. O novo fluxo tem o mesmo número de elementos que o fluxo original.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Filtre a stream baseado no Predicado;
            3. Classifique a Stream em ordem crescente;
            4. Itere sobre esse Stream e imprima os valores contidos na Stream;
         */
        System.out.print("\nExemplo de aplicação da operação intermediária filter e sorted:");
        values.stream() //1
            .filter(f -> f.getSalario() > 2000.00) //2 (filtra os valores) Experimente aplicar outro filtro
            .sorted(Comparator.comparing(Funcionario::getSalario)) //3 (ordena esses valores em ordem crescente)
            .forEach(System.out::print); //4 (itera sobre cada valor e o imprime na saída padrão)

        /** Exemplo de aplicação da operação intermediária Map **/
        //map
        //Resulta em um fluxo em que cada elemento do fluxo original é mapeado para um novo valor (possivelmente de um tipo diferente, mas não necessariamente).
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Filtre a stream baseado no Predicado;
            3. Transforme o resultado filtrado em outro valor;
            4. Classifique a Stream em ordem crescente;
            5. Itere sobre esse Stream e imprima os valores contidos na Stream;
         */
        System.out.println("\n\nExemplo de aplicação da operação intermediária Map:");
        values.stream() //1
            .filter(f -> f.getSalario() > 2000.00) //2 (filtra os valores)
            .map(f -> f.getSalario() + (f.getSalario() * 0.10) ) //3 (transforma o número filtrado - aplicando um aumento de 10%)
            .sorted() //4 (ordena esses valores em ordem crescente)
            .forEach(v -> System.out.printf("%,.2f%n", v)); //5 (itera sobre cada valor e o imprime na saída padrão)

        /** Exemplo de aplicação da operação intermediária Distinct **/
        //distinct
        //Resulta em um fluxo que contém somente os elementos únicos.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Elimina as duplicatas (com a aplicaçãso de distinct);
            3. Classifique a Stream em ordem crescente;
            4. Coleta a stream para uma List;
         */
        System.out.print("\nExemplo de aplicação da operação distinct:");
        //Alterando a Collection original para que ela contenha dados repetidos (salários repetidos nesse exemplo)
        /*ATENÇÃO: Note que as Streams tem o poder de alterar o valor original da Collection (apenas procura-se evitar se utilizar desse artifício,
        * deixando a Collection original immutable).
        */
        List<Funcionario> finalValues = values;
        values.stream().filter(f -> {
            if (f.getSalario() > 7000.00) {
                finalValues.get(finalValues.indexOf(f)).setSalario(2000.00); //substitui os salarios de 8.000, 9.000 e 10.000 por 2.000
            }
            return true;
        }).collect(Collectors.toList());
        System.out.println("\nColeção original adptada (inseridos salários repetidos na Collection)" + values);
        System.out.println("\nSaída após a aplicação da operação intermediária Distintict:");
        System.out.println(
            values.stream() //1
            .distinct() //2 (Note que a classe Funcionário foi modificada para que equals e hasdcode funcione pelo atributo salário)
            .sorted(Comparator.comparing(f -> f.getSalario())) //3
            .collect(Collectors.toList())); //4
        System.out.print("\nRetornando a Collection ao dados originais");
        values = getFuncionarioCollection(); //retorna os dados originais

        /** Exemplo de aplicação da operação intermediária Limit **/
        //limit
        //Resulta em um fluxo com o número especificado de elementos a partir do início do fluxo original.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Recupere da coleção 3 objetos (com a aplicaçãso de Limit);
            3. Coleta a stream para uma List.
         */
        System.out.print("\nExemplo de aplicação da operação Limit:");
        System.out.println(values.stream() //1
            .limit(3) //2
            .collect(Collectors.toList())); //3

        /** Exemplo de aplicação da operação intermediária skip **/
        //skip
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Recupere da coleção objetos os objetos após o terceiro (com a aplicaçãso de skip);
            3. Coleta a stream para uma List;
         */
        System.out.print("\nExemplo de aplicação da operação skip:");
        System.out.println(values.stream() //1
            .skip(3) //2
            .collect(Collectors.toList())); //3


        System.out.println("\n\n***************** Exemplos de Operações de Pesquisa (Operações Terminais de Pesquisa) *****************");
        /*
         *   ATENÇÃO:
         *      1. Toda operação terminal inicializa a stream.
         * */

        /** Exemplo de aplicação da operação intermediária findFirst **/
        //findFirst
        //Localiza o primeiro elemento no fluxo com base nas operações intermediárias anteriores; termina imediatamente o processamento do pipeline do fluxo depois que esse elemento é encontrado.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Filtra os dados pelo critério do Predicado;
            3. Busca a primeira ocorrência e para a busca;
         */
        System.out.print("\nExemplo de aplicação da operação findFirst:");
        System.out.println(values.stream() //1
            .filter(f -> f.getSalario() == 5000.00) //2
            .findFirst().get()); //3 (Como devolve um Optional tem que extrair dele o Funcionário com  o get)

        /** Exemplo de aplicação da operação intermediária findAny **/
        //findAny
        //Localiza qualquer elemento no fluxo com base nas operações intermediárias anteriores; termina imediatamente o processamento do pipeline do fluxo depois que esse elemento é encontrado.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Filtra os dados pelo critério do Predicado;
            3. Busca uma ocorrência na Collection e para a busca;
         */
        System.out.print("\nExemplo de aplicação da operação findAny:");
        System.out.println(values.stream() //1
            .filter(f -> f.getSalario() == 5000.00) //2
            .findAny().get()); //3 (Como devolve um Optional tem que extrair dele o Funcionário com  o get)
        values = getFuncionarioCollection(); //volta a coleção para os valores originais

        /** Exemplo de aplicação da operação intermediária anyMatch **/
        //anyMatch
        //Determina se quaisquer elementos no fluxo correspondem a uma condição especificada; termina imediatamente o processamento do pipeline do fluxo se um elemento corresponde.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Localiza o objeto pelo critério do Predicado;
         */
        System.out.print("\nExemplo de aplicação da operação anyMatch: ");
        System.out.println(values.stream() //1
            .anyMatch(f -> f.getSalario() == 5000.00)); //2

        /** Exemplo de aplicação da operação intermediária allMatch **/
        //allMatch
        //Determina se todos os elementos no fluxo correspondem a uma condição especificada.
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir da Collection (origem de dados);
             2. Localiza o objeto pelo critério do Predicado.
         */
        System.out.print("\nExemplo de aplicação da operação allMatch: ");
        System.out.println(values.stream() //1
            .allMatch(f -> f.getSalario() == 5000.00)); //2

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
