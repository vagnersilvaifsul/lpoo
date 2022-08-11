import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@SuppressWarnings({"DanglingJavadoc", "MismatchedQueryAndUpdateOfCollection", "RedundantArrayCreation", "OptionalGetWithoutIsPresent"})
public class Main {
    public static void main(String[] args) {

        /***** O Básico sobre Streams *****/

        /*  Cada elemento na coleção deve ser computado antes que possa ser adicionado à coleção. Enquanto um
            Stream é conceitualmente um pipeline, no qual os elementos são calculados sob demanda.
            As operações de fluxo são intermediárias ou terminais. As operações do terminal retornam um
            resultado de um determinado tipo e as operações intermediárias retornam o próprio fluxo para que
            possamos encadear vários métodos em uma linha para realizar a operação em várias etapas.
        */

        //sequência de elementos de uma fonte. Neste caso a fonte é um literal de uma coleção de literais inteiros
        System.out.println("\n\nStream de uma coleção de literais inteiros");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(v -> System.out.print(v + " "));

        //Stream de matriz
        System.out.println("\n\nStream de matriz");
        Stream<Integer> streamM = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamM.forEach(v -> System.out.print(v + " "));

        //Stream de uma list
        System.out.println("\n\nStream de uma list");
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> streamL = list.stream();
        streamL.forEach(v -> System.out.print(v + " "));

        //Stream.generate() or Stream.iterate()
        System.out.println("\n\nStream.generate() or Stream.iterate()");
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
        randomNumbers.limit(20).forEach(v -> System.out.print(v + " "));

        //Stream of String chars or tokens
        System.out.println("\n\nStream of String chars or tokens");
        IntStream streamChars = "12345_abcdefg".chars();
        streamChars.forEach(v -> System.out.print(v + " "));
        System.out.println("\nSplit");
        Stream<String> streamSplit = Stream.of("A$B$C".split("\\$"));
        streamSplit.forEach(v -> System.out.print(v + " "));

        //Colete elementos de fluxo para uma lista
        System.out.println("\n\nColete elementos de fluxo para uma lista");
        List<Integer> listInt = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            listInt.add(i);
        }
        Stream<Integer> streamList = listInt.stream();
        System.out.println(listInt);
        //.filter(predicado).collect(coleção)
        List<Integer> evenNumbersList = streamList.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);

        //Colete elementos de fluxo para um array
        System.out.println("\n\nColete elementos de fluxo para um array");
        List<Integer> listA = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            listA.add(i);
        }
        Stream<Integer> streamA = list.stream();
        Integer[] evenNumbersArr = streamA.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumbersArr));

        /***** Operações de fluxo *****/
        System.out.println("\n\nOperações de fluxo");
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        //operações intermediárias
        /*  As operações intermediárias retornam o próprio fluxo para que você possa encadear várias
            chamadas de métodos em uma linha. */

        // Stream.filter()
        System.out.println("\nStream.filter()");
        memberNames.stream().filter((s) -> s.startsWith("A"))
            .forEach(System.out::println); //encadeia o forEach depois de aplicar o predicado em filter

        //Stream.map()
        System.out.println("\nStream.map()");
        memberNames.stream().filter((s) -> s.startsWith("A"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

        //Stream.sorted()
        System.out.println("\nStream.sorted()");
        memberNames.stream().sorted()
            .map(String::toUpperCase)
            .forEach(o -> System.out.print(o + " "));

        //Operação terminal
        /*  As operações de terminal retornam um resultado de um determinado tipo após o processamento de todos
            os elementos de fluxo. */

        //Stream.forEach()
        System.out.println("\n\nStream.forEach()");
        memberNames.forEach(o -> System.out.print(o + " "));

        //Stream.collect()
        System.out.println("\n\nStream.collect()");
        List<String> memNamesInUppercase = memberNames.stream().sorted()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.print(memNamesInUppercase);

        //Stream.match()
        System.out.println("\n\nStream.match()");
        boolean matchedResult = memberNames.stream()
            .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);     //true

        matchedResult = memberNames.stream()
            .allMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);     //false

        matchedResult = memberNames.stream()
            .noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);     //false

        //Stream.count()
        System.out.println("\n\nStream.count()");
        long totalMatched = memberNames.stream()
            .filter((s) -> s.startsWith("A"))
            .count();
        System.out.println(totalMatched);     //2

        //Stream.reduce()
        /*  O reduce()método realiza uma redução nos elementos do fluxo com a função dada. O resultado é uma
            Optional retenção do valor reduzido.
         */
        System.out.println("\n\nStream.reduce()");
        Optional<String> reduced = memberNames.stream()
            .reduce((s1,s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);

        /***** Short-circuit Operations *****/
        /*  Embora as operações de fluxo sejam executadas em todos os elementos dentro de uma coleção que
            satisfaça um Predicado, geralmente é desejável interromper a operação sempre que um elemento
            correspondente for encontrado durante a iteração.
         */

        //Stream.anyMatch()
        System.out.println("\n\nStream.anyMatch()");
        boolean matched = memberNames.stream()
            .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matched);    //true

        //Stream.findFirst()
        System.out.println("\n\nStream.findFirst()");
        String firstMatchedName = memberNames.stream()
            .filter((s) -> s.startsWith("L"))
            .findFirst()
            .get();
        System.out.println(firstMatchedName);    //Lokesh

        /***** Parallel Streams *****/
        /*  Portanto, é importante encorajar expressões idiomáticas que sejam tanto sequenciais quanto
            paralelas. Isso é facilitado mudando o foco para descrever QUAL computação deve ser executada, em
            vez de COMO ela deve ser realizada.
            O Parallel Streams pode ser aplicado em qualquer dos exemplos acima.
         */

        //parallelStream
        System.out.println("\n\nParallel Streams");
        List<Integer> listPs = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            listPs.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> streamPs = listPs.parallelStream();
        List<Integer> evenNumbersArrPs = streamPs.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersArrPs);


        /************** Principais funções do Stream **************/

        //findAny()
        System.out.println("\n\nfindAny()");
        Stream.of("one", "two", "three", "four")
            .filter(v -> v.equals("fourt"))
            .findAny()
            .ifPresent(System.out::println);

        //findAny() em parallel stream
        Stream.of("one", "two", "three", "four")
            .parallel()
            .filter(v -> v.equals("fourt"))
            .findAny()
            .ifPresent(System.out::println);
    }
}
