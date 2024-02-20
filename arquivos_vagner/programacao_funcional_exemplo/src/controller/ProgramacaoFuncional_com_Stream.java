package controller;

import model.Funcionario;

import java.security.SecureRandom;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 *  Conteúdo: Streams (Fluxos no paradigma funcional).
 *
 *  Streams (fluxos) são sequências de elementos que suportam operações de agregação sequenciais e paralelas.
 *
 *  As operações de fluxo são divididas em operações intermediárias e terminais e são combinadas para formar
 *  pipelines de fluxo.
 *
 *  Fonte: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/stream/package-summary.html
 *
 *  Vantagens:
 *  1. Uma grande vantagem da Stream está no fato de não alterar os dados da Collection Original.
 *  2. Outra vantagem está no fato das Streams terem sido projetadas para tirar proveito da parelalidade das arquiteturas
 *  dos processadores atuais (dos vários cores que eles podem possuir).
 *
 *  Nesse exemplo é explorada a Interface Stream a partir de uma Collection (nesse exemplo, uma List).
 *
 *  Não só é explorada a interface Stream, mas, para tornar o exemplo mais próximo da realidade de sistemas baseados em CRUD,
 *  a Collection (uma List), representa uma coleção de objetos (no exemplo, de objetos da classe Funcionario).
 *
 *  Streams fazem parte da Programação Funcional.
 *  A grande vantagem da Programação Funcional é que ela está mais próxima das regras de negócio. Para tornar mais clara a
 *  aplicação desse raciocínio, os exemplos a seguir estão anotados pela seguinte observação:
 *      "Como trata-se de programação funcional, lê-se assim:"
 *  A ideia é demostrar com esta observação como a Programação Funcional está bem próxima da regra de negócio que ela resolve
 *  (em contraste com a Programação Procedural e a Programação Orientada a Objetos).
 **/
public class ProgramacaoFuncional_com_Stream {
    public static void main(String[] args) {
        //Cria uma Collection do tipo List de Funcionarios
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
            .forEach(System.out::println); //2 - Usa a operação terminal para percorrer cada elemento para imprimi-lo)
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
            2. Transforme o objeto em double
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
            2. Transforme o objeto em double
            3. Determine qual é a soma dos valores contidos nessa Stream;
         */
        System.out.print("\nExemplo de aplicação da operação terminal sum:");
        System.out.print(values.stream() //1
            .mapToDouble(d -> d.getSalario()) //2
            .sum()); //3

        //reduce
        //Reduz os elementos de uma coleção a um único valor usando uma função de acumulação associativa (por exemplo, uma lambda que soma dois elementos).
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Transforme o objeto em double
            3. Determine qual é a soma dos valores contidos nessa Stream (em outras palavras: Reduza os valores a soma);

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

        /** Exemplo de aplicação da operação terminal collect **/
        //collect
        //Cria uma nova coleção dos elementos contendo os resultados das operações anteriores do fluxo.
        //Obs.: Mais adiante, nesse mesmo arquivo, você verá outros exemplos de Collectors.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Colete essa stream para uma List.
         */
        System.out.print("\nExemplos de aplicação da operação terminal collect:");
        System.out.println(values.stream() //1
            .collect(Collectors.toList())); //2

        System.out.println("\n\n***************** Exemplos Avançado de Operações Terminais Collect *****************");
        //Collectors.groupingBy
        //Faz o agrupamento dos objetos contidos na stream (baseado em um critério)
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir da Collection (origem de dados);
             2. Agrupe por departamento;
             3. Percorra a coleção para realizar a operação de impressão.
         */
        System.out.print("\nExemplo de aplicação da operação Collectors.groupingBy: ");
        Map<String, List<Funcionario>> groupedPorDepartmento =
            values.stream() //1
                .collect(Collectors.groupingBy(Funcionario::getDepartamento)); //2 Collectors.groupingBy devolve um Map
        groupedPorDepartmento.forEach((departamento, funcionariosPorDepartamento) -> { //3
            System.out.print("\n\nDEPARTAMENTO: " + departamento);
            funcionariosPorDepartamento.forEach(  f -> System.out.printf("%s", f)); //3
        });

        //Collectors.counting()
        //Conta a quantidade em cada agrupamento
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir da Collection (origem de dados);
             2. Agrupe por departamento e conte a quantidade de funcionários em cada um deles;
             3. Percorra a coleção para realizar a operação de impressão.
         */
        System.out.print("\n\nExemplo de aplicação da operação Collectors.counting: \n");
        Map<String, Long> empregadosPorDepartmento =
            values.stream() //1
                .collect(Collectors.groupingBy(Funcionario::getDepartamento, Collectors.counting())); //2 Collectors.groupingBy devolve um Map
        empregadosPorDepartmento
            .forEach((departamento, count) -> System.out.printf("%s contém %d empregado(s)%n", departamento, count)); //3


        /** Exemplo de aplicação da operação terminal toArray **/
        //toArray
        //Cria um array contendo os resultados das operações anteriores do fluxo.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Colete a stream para um Array.
         */
        System.out.print("\nExemplos de aplicação da operação terminal toArray:");
        Object[] array = values.stream() //1
            .toArray(size -> new Object[size]);//2
        Arrays.stream(array).forEach(System.out::print); //para imprimir utilizou stream e a operação terminal forEach

        /** Exemplo de aplicação da operação builder **/
        //builder
        //Cria uma stream utilizando o padrão de projeto buider.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Percorra a Stream para realizar a operação de impressão.
         */
        System.out.print("\n\nExemplos de aplicação da operação builder:");
        Stream.Builder<Funcionario> builder = Stream.builder(); // utilizando builder()
        Stream<Funcionario> stream = builder.add(new Funcionario(3, String.valueOf(3), 3 * 1000, "desenvolvimento")).build(); //adicionando elementos a stream
        stream.forEach(System.out::println);

        /** Exemplo de aplicação da operação empty **/
        //empty
        //Cria uma stream vazia
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam vazia;
            2. Percorra a Stream para realizar a operação de impressão.
         */
        System.out.print("\n\nExemplos de aplicação da operação empty (imprime a stream vazia):");
        Stream<String> myStream = Stream.empty();
        myStream.forEach(System.out::println); //imprime a stream vazia


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
            .forEach(v -> System.out.printf("%,.2f%n", v)); //5 (itera sobre cada valor e o imprima na saída padrão)

        /** Exemplo de aplicação da operação intermediária Distinct **/
        //distinct
        //Resulta em um fluxo que contém somente os elementos únicos.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir da Collection (origem de dados);
            2. Elimina as duplicatas (com a aplicaçãso de distinct);
            3. Classifique a Stream em ordem crescente;
            4. Colete a stream para uma List;
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
            3. Colete a stream para uma List.
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
            3. Colete a stream para uma List;
         */
        System.out.print("\nExemplo de aplicação da operação skip:");
        System.out.println(values.stream() //1
            .skip(3) //2
            .collect(Collectors.toList())); //3

        /** Exemplo de aplicação da operação intermediária concat **/
        //concat
        //Concatena streams.
        /* Como trata-se de programação funcional, lê-se assim:
            1. Crie um Steam a partir das Collections concatenadas (origem de dados);
            2. Percorra a Stream para realizar a operação de impressão.
         */
        System.out.print("\n\nExemplos de aplicação da operação terminal concat:");
        System.out.print("\nCriando outra lista (com os mesmos dados)");
        List<Funcionario> values2 = getFuncionarioCollection();
        Stream.concat(values.stream(), values2.stream()) //1
            .forEach(System.out::print); //2


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


        System.out.println("\n\n***************** Exemplo: Gerando fluxos de valores aleatórios inteiros (Random) *****************");
        //random.ints
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir de um gerador de números aleatórios que represente as seis faces de um dado (origem de dados);
             2. Colete a frequencia que apareceu cada face do dado.
             3. Percorra a stream e imprima a frequência que cada face apareceu na rodada.
         */
        SecureRandom random = new SecureRandom();
        // rolando um dado de 6 faces 6.000.000 vezes e resumindo os resultados
        System.out.println("Rolando o dado ... agurade");
        System.out.printf("%-6s%s%n", "Face", "Frequência");
        random.ints(6_000_000, 1, 7) //1 (ints gera um IntStream)
            .boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) //2 (boxed faz a conversão de int para Integer, já que o Map exige um integer)
            .forEach((face, frequency) -> //3
                System.out.printf("%-6d%,d%n", face, frequency));


        System.out.println();
    }

    private static List<Funcionario> getFuncionarioCollection() {
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000, "Desenvolvimento"));
            } else {
                funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000, "Administrativo"));
            }
        }
        System.out.println("\nList Criada");
        System.out.println(funcionariosList);
        return funcionariosList;
    }
}
