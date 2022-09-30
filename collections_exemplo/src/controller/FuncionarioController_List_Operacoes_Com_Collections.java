package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController_List_Operacoes_Com_Collections {
    public static void main(String[] args) {
        /* A classe Collections é uma classe utilitária que manipula coleções (qualquer tipo da interface Collection) */


        //Criando uma lista (Cria a lista vazia, depois popula a lista em um laço for)
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nList Criada");
        System.out.println(funcionariosList);

        //Método reverse (ordena em ordem inversa, pela hashcode (já que não foi estabelecido outro atributo como critério)
        Collections.reverse(funcionariosList);
        System.out.println("\nList em ordem inversa (utilizando o método reverse)");
        System.out.println(funcionariosList);

        //Método fill
        //Note que a List é (re) preenchida com um novo valor
        Collections.fill(funcionariosList, new Funcionario(1, "1", 1 * 1000));
        System.out.println("\nList (re) preenchida (utilizando o método fill)");
        System.out.println(funcionariosList);

        //Método copy (não utiize esse método, procure um melhor em ListCriarCopiar)
        List<Funcionario> funcionariosListCopy = new ArrayList<>();
        //Collections.copy(funcionariosListCopy, funcionariosList); //emite uma exceção java.lang.IndexOutOfBoundsException, pois a coleção de destino é menor que a de origen
        System.out.println("\nList copiada (utilizando o método copy)");
        System.out.println(funcionariosListCopy);

        //Método max e min (exige um tipo genérico para funcionar)
        //System.out.println("\nMax= " + Collections.max(funcionariosList));
        //System.out.println("\nMax= " + Collections.min(funcionariosList));
        //utilize Streams pra resolver esse problema
        funcionariosList.clear();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nColeção a ser pesquisada");
        System.out.println(funcionariosList);
        System.out.print("\nValor máximo na coleção (utilizando stream().max())");
        Optional fmax = funcionariosList.stream().max(Comparator.comparing(Funcionario::getSalario));
        if(fmax.isPresent()) System.out.println(fmax.get());
        System.out.print("\nValor mínimo na coleção (utilizando stream().min())");
        Optional fmin = funcionariosList.stream().min(Comparator.comparing(Funcionario::getSalario));
        if(fmin.isPresent()) System.out.println(fmin.get());
    }
}
