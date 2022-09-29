package controller;

import model.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class FuncionarioController {
    public static void main(String[] args) {
        System.out.println("********* Trabalhando com a Interface Collection *********");

        /**** coleções que PERMITEM elementos repetidos ****/

        //List
        /* Permite ordenação */
        /* Contém duplicatas */
        System.out.println("\nList Criada");
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println(funcionariosList);
        System.out.println("\nLista original");
        System.out.println(funcionariosList);
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente)");
        System.out.println(funcionariosList.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));
        System.out.println("\nLista original");
        System.out.println(funcionariosList);
        System.out.println("\nUtilizando List para ordenação (critério salário, ordem decrescente) (note que nesse caso a lista passa a ficar ordenada no critério do Comparator)");
        funcionariosList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionariosList);
        System.out.println("\nLista original (alterada pela ordenação por List)");
        System.out.println(funcionariosList);

        //Collection (o mais abstrado possível, tratando a Collection como List nesse exemplo)
        /* Permite ordenação */
        /* Contém duplicatas */
        System.out.println("\nCollection Criada");
        Collection<Funcionario> funcionariosCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosCollection.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println(funcionariosCollection);
        System.out.println("\nCollection original");
        System.out.println(funcionariosCollection);
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente)");
        System.out.println(funcionariosCollection.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));
        System.out.println("\nCollection original");
        System.out.println(funcionariosCollection);
        System.out.println("\nUtilizando List para ordenação (critério salário, ordem decrescente) (note que nesse caso a lista passa a ficar ordenada no critério do Comparator)");
        ((List)funcionariosCollection).sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionariosCollection);
        System.out.println("\nCollection original (alterada pela ordenação por List)");
        System.out.println(funcionariosCollection);
        System.out.println("\nUma terceira forma de ordenar uma Collection (utilizando Collections");
        //Collections: Esta classe consiste exclusivamente em métodos estáticos que operam ou retornam coleções
        Collections.sort((List) funcionariosCollection, Comparator.comparing(Funcionario::getSalario));
        System.out.println(funcionariosCollection);

        /**** coleções que NÃO PERMITEM elementos repetidos ****/

        //Map e HashMap
        /* Não permite ordenação */
        /* Não contém duplicatas */
        /* A vantagem nesse tipo de coleção é a velocidade para salvar dados e recuperar dados */
        Map<Integer, Funcionario> funcionariosMap = new HashMap<>();
        System.out.println("\nMap original");
        System.out.println(funcionariosMap);
        for (int i = 0; i < 10; i++) {
            funcionariosMap.put(i, new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println("\nMap populado");
        System.out.println(funcionariosMap);
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente) *Operação inválida nesse tipo de estrutura de dados");
        //System.out.println(funcionariosMap.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));


        //Set
        /* Permite ordenação */
        /* Não contém duplicatas */
        Set<Funcionario> funcionariosSet = new HashSet<>();
        System.out.println("\nSet original");
        System.out.println(funcionariosSet);
        for (int i = 0; i < 10; i++) {
            funcionariosSet.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        funcionariosSet.add(new Funcionario(1, String.valueOf(1), 1 * 1000));
        System.out.println("\nSet populado");
        System.out.println(funcionariosSet);
        System.out.println("\nTentativa de adicionar uma duplicata");
        System.out.println(funcionariosSet);
        System.out.println("\nSet original");
        System.out.println(funcionariosSet);
        System.out.println("\nUtilizando um Stream para ordenação (critério salário, ordem decrescente)");
        System.out.println(funcionariosSet.stream().sorted(Comparator.comparing(Funcionario::getSalario).reversed()).collect(Collectors.toList()));
        System.out.println("\nSet original");
        System.out.println(funcionariosSet);
    }
}
