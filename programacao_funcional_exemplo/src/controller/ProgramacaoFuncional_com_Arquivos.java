package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/** Streams são sequências de elementos que suportam operações de agregação sequenciais e paralelas. **/
public class ProgramacaoFuncional_com_Arquivos {
    public static void main(String[] args) throws IOException {
        //Regex que corresponde a um ou mais caracteres de espaço em branco consecutivos
        Pattern pattern = Pattern.compile("\\s+");

        //conta ocorrências de cada palavra em um Stream<String> classificado por palavra
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir da fonte de dados (nesse caso um arquivo txt);
             2. Transforme os sinais de pontuação de cada linha em "" (isso os elimina);
             3. Transforme cada linha em uma stream de palavras;
             4. Agrupe as palavras dessa stream pela categoria indicada e conte as ocorrências das palavras.
         */
        Map<String, Long> wordCounts =
            Files.lines(Paths.get("programacao_funcional_exemplo/src/assets/data.txt")) //1
                .map(line -> line.replaceAll("(?!')\\p{P}", "")) //2
                .flatMap(line -> pattern.splitAsStream(line)) //3
                .collect(Collectors.groupingBy(String::toLowerCase, //4
                    TreeMap::new, Collectors.counting()));

        //exibir as palavras agrupadas por letra inicial
        System.out.print("\nQuantidade de ocorrências de uma palavra, agrupadas pela letra inicial das palavras");
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir da fonte de dados (o Map);
             2. Agrupe pelo caractere inicial das palavras;
             3. Percorra essa stream e imprima, agrupado pela letra inicial das palavras, cada palavra e a quantidade de ocorrências.
         */
        wordCounts.entrySet()
            .stream()//1
            .collect(
                Collectors.groupingBy(entry -> entry.getKey().charAt(0), //2
                    TreeMap::new, Collectors.toList()))
            .forEach((letter, wordList) -> //3
            {
                System.out.printf("%n%C%n", letter);
                wordList.stream().forEach(word -> System.out.printf(
                    "%13s: %d%n", word.getKey(), word.getValue()));
            });

        System.out.println("\nPalavras com mais ocorrências no texto");
        /* Como trata-se de programação funcional, lê-se assim:
             1. Crie um Steam a partir da fonte de dados (os valores de um map) e os trate como List (colete como List);
             2. Retorne o max da stream;
             3. Percorra essa stream e imprima as palavras com mais ocorrências no texto.
         */
        Long max =
            wordCounts.values() //1
                .stream().collect(Collectors.toList()) //1
                .stream().max(Long::compareTo).get(); //2
        wordCounts.forEach((k, v) -> { //3
            if(v.equals(max)){
                System.out.println(k + " = " + v);
            }
        });

    }
}
