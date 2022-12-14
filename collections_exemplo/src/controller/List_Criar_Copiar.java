package controller;

import model.Funcionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O framework Collection contém muitas estruturas de dados genéricas predefinidas
 * Uma coleção é uma estrutura de dados — na realidade, um objeto — que pode armazenar referências a outros objetos.
 * **/

//List é uma das estruturas de dados de Collecion que mais utilizaremos
public class List_Criar_Copiar {
    public static void main(String[] args) throws CloneNotSupportedException{
        //List
        /* Permite ordenação */
        /* Contém duplicatas */

        /* Criação de Listas */

        //Criando uma lista (Cria a lista vazia, depois popula a lista em um laço for)
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println("\nList Criada");
        System.out.println(funcionariosList);
        System.out.println("\nTamanho da lista criada: " + funcionariosList.size());
        System.out.println("\nEsvaziando a lista...");
        funcionariosList.clear();
        System.out.println("\nTamanho da lista esvaziada: " + funcionariosList.size());

        //Criando uma lista com tamanho inicial definido
        System.out.println("\nCriando uma lista de tamanho definido");
        funcionariosList = new ArrayList<>(3);
        System.out.println("\nList Criada com tamanho 3");
        for (int i = 0; i < 3; i++) { //experimente colocar i < 10 para ver o resultado
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println(funcionariosList);
        funcionariosList.clear();

        //Criando uma lista com valores previamente definidos
        System.out.println("\nCriando uma lista com valores definidos");
        funcionariosList = Arrays.asList(
            new Funcionario(1, String.valueOf(1), 1 * 1000),
            new Funcionario(2, String.valueOf(2), 2 * 1000),
            new Funcionario(3, String.valueOf(3), 3 * 1000)
        );
        System.out.println(funcionariosList);


        //copianto listas na construção
        System.out.println("\nCopiando listas (o que o Java faz é simplesmente copiar a referência de uma lista para outra");
        List<Funcionario> funcionariosListCopy = new ArrayList<>(funcionariosList);
        System.out.println(funcionariosListCopy);
        System.out.println("\nHashcode de funcionariosListCopy: " + funcionariosListCopy.hashCode());
        System.out.println("Hashcode de funcionariosList: " + funcionariosList.hashCode());

        //copiando listas com addAll (cuidado, esse método faz um append dos objetos)
        System.out.println("\nCopiando listas (o addAll faz um append (anexa os objetos da lista fonte), nesse caso ele cria uma nova lista e adiciona os elementos");
        funcionariosListCopy.addAll(funcionariosList);
        System.out.println(funcionariosListCopy);
        System.out.println("\nHashcode de funcionariosListCopy: " + funcionariosListCopy.hashCode());
        System.out.println("Hashcode de funcionariosList: " + funcionariosList.hashCode());

        //copiando listas com List.copyOf
        System.out.println("\nCopiando listas com copyOf do Java 10");
        funcionariosListCopy = List.copyOf(funcionariosList);
        System.out.println(funcionariosListCopy);
    }
}
