package controller;

import model.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

/** A interface Collection não possui métodos para ordenação, pois, algumas estruturas de dados que a implemtam
 * não permitem esse tipo de operação. Logo, cada implementação traz uma forma de sort.
 * Nesse exemplo as estruturas de dados podem ser divididas em:
 * 1. Coleções que PERMITEM ordenação;
 * 2. Coleções que NÃO PERMITEM ordenação.
 */
public class Collection_Ordenacao {
    public static void main(String[] args) {
        System.out.println("********* Trabalhando com a Interface Collection *********");

        /**** coleções que PERMITEM elementos repetidos ****/

        /** List (operando ArrayList como uma List) **/
        /* Permite ordenação */
        /* Contém duplicatas */

        //cria a List
        System.out.print("\n************************* Operando a interface List *************************");
        System.out.println("\nList Criada");
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println(funcionariosList);

        //Utilizando Stream para ordenação (Lambdas do Java 8+)
        /** A vantagem de utiilizar Stream está no fato de não alterar a Collecion original **/
        System.out.print("\n+++++++++++++++++++++++++ Utilizando Stream ++++++++++++++++++++++++++++++");
        System.out.print("\nUtilizando Stream para ordenação (Lambdas do Java 8+)");
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente)");
        System.out.println(funcionariosList.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));

        //utilizando a interface List para ordenação
        System.out.print("\n+++++++++++++++++++++++++ Utilizando List ++++++++++++++++++++++++++++++");
        System.out.print("\nUtilizando a classe List para ordenação");
        System.out.println("\nLista original");
        funcionariosList.sort(Comparator.comparing(Funcionario::getSalario));
        System.out.println(funcionariosList);
        System.out.println("\nUtilizando List para ordenação (critério salário, ordem decrescente) (note que nesse caso a lista passa a ficar ordenada no critério do Comparator)");
        funcionariosList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionariosList);

        //utilizando a classe Collections para ordenação
        //A classe Collections é uma classe utilitária do framework Collection
        System.out.print("\n+++++++++++++++++++++++++ Utilizando Collections ++++++++++++++++++++++++++++++");
        System.out.println("\nUma terceira forma de ordenar uma List (utilizando a classe Collections, critério salário, ordem crescente)");
        //Collections: Esta classe consiste exclusivamente em métodos estáticos que operam ou retornam coleções
        Collections.sort(funcionariosList, Comparator.comparing(Funcionario::getSalario));
        System.out.println(funcionariosList);


        /** Collection (o mais abstrado possível, tratando a ArrayList (que implementa a interface List) como uma Collecton nesse exemplo) **/
        //(operando ArrayList como uma Collection)
        /* Permite ordenação */
        /* Contém duplicatas */

        //Criação
        System.out.print("\n************************* Operando a interface Collection *************************");
        System.out.println("\nCollection Criada");
        Collection<Funcionario> funcionariosCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosCollection.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println(funcionariosCollection);

        //Utilizando Stream para ordenação (Lambdas do Java 8+)
        System.out.print("\n+++++++++++++++++++++++++ Utilizando Stream ++++++++++++++++++++++++++++++");
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente)");
        System.out.println(funcionariosCollection.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));

        //utilizando a interface List para ordenação
        //Como a interface Collection não tem método para ordenação, foi utilizado a técnica de downcast para pegar o método
        //sort da interface List (List implementa Collection, logo, essa é uma operação válida)
        //Em outras palavras, List é filha de Collection, logo, é possível realizar o downcast para utilizar um método de List.
        System.out.print("\n+++++++++++++++++++++++++ Utilizando List ++++++++++++++++++++++++++++++");
        System.out.println("\nUtilizando List para ordenação (note que nesse caso a lista passa a ficar ordenada no critério do Comparator)");
        System.out.println("\nColleciont na ordem crescente");
        ((List)funcionariosCollection).sort(Comparator.comparing(Funcionario::getSalario)); //coloca na ordem crescente os dados originais
        System.out.println(funcionariosCollection);
        System.out.println("\nColleciont na ordem decrescente");
        ((List)funcionariosCollection).sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionariosCollection);

        //utilizando a classe utilitária Collections (do framework Collections) para ordenação
        //A classe Collections é uma classe utilitária do framework Collection
        System.out.print("\n+++++++++++++++++++++++++ Utilizando Collections ++++++++++++++++++++++++++++++");
        System.out.println("\nUma terceira forma de ordenar uma Collection (utilizando a classe utilitária Collections), critério salário, ordem crescente");
        //Collections: Esta classe consiste exclusivamente em métodos estáticos que operam ou retornam coleções
        Collections.sort((List) funcionariosCollection, Comparator.comparing(Funcionario::getSalario));
        System.out.println(funcionariosCollection);

        /**** coleções que NÃO PERMITEM elementos repetidos ****/

        /** Map e HashMap **/
        /* Não permite ordenação */
        /* Não contém duplicatas */
        /* A vantagem nesse tipo de coleção é a velocidade para salvar dados e recuperar dados. Porém, não permitem ordenação */
        System.out.print("\n************************* Operando Map *************************");
        Map<Integer, Funcionario> funcionariosMap = new HashMap<>();
        System.out.println("\nMap criado");
        System.out.println(funcionariosMap);
        for (int i = 0; i < 10; i++) {
            funcionariosMap.put(i, new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nMap populado");
        System.out.println(funcionariosMap);
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente) \n*Operação inválida nesse tipo de estrutura de dados");
        //System.out.println(funcionariosMap.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList())); //operação inválida (por isso está comentado)


        /** Set **/
        /* Permite ordenação */
        /* Não contém duplicatas */

        //Criação
        System.out.print("\n************************* Operando Set *************************");
        Set<Funcionario> funcionariosSet = new HashSet<>();
        System.out.println("\nSet criado");
        System.out.println(funcionariosSet);
        for (int i = 0; i < 10; i++) {
            funcionariosSet.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        funcionariosSet.add(new Funcionario(1, String.valueOf(1), 1000));
        System.out.println("\nSet populado");
        System.out.println(funcionariosSet);

        //Tentando adicionar uma duplicata
        System.out.print("\n+++++++++++++++++++++++++ Tentando adicionar uma duplicata ++++++++++++++++++++++++++++++");
        System.out.println("\nTentativa de adicionar uma duplicata");
        System.out.println(funcionariosSet);

        //Utilizando Stream para ordenação (Lambdas do Java 8+)
        System.out.print("\n+++++++++++++++++++++++++ Utilizando Stream para orndenar um Set ++++++++++++++++++++++++++++++");
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente)");
        System.out.println(funcionariosSet.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));
        System.out.println("\nSet original");
        System.out.println(funcionariosSet);
    }
}
