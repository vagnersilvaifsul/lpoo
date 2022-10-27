package controller;

import model.Funcionario;

import java.util.*;
import java.util.stream.Stream;

/** Demonstra o uso das operacoes da interface Collection **/
public class Collection_operacoes {
    public static void main(String[] args) {

        /** Vamos utilizar uma ArrayList para realizar as operações da interface Collection **/
        //Criando uma Collection (Cria a Collection vazia, depois popula a Collection em um laço for)
        Collection<Funcionario> funcionarios = getFuncionarioCollection();

        //Método add
        funcionarios.add(new Funcionario(100, String.valueOf(100), 100 * 1000));
        System.out.println("\nCollection depois de add");
        System.out.println(funcionarios);

        //Método addAll
        //para representar essa operação vamos criar e popular outra Collection
        Collection<Funcionario> newList = Arrays.asList(
            new Funcionario(101, String.valueOf(101), 101 * 1000),
            new Funcionario(102, String.valueOf(102), 102 * 1000),
            new Funcionario(103, String.valueOf(103), 103 * 1000)
        );
        System.out.println("\nNova Collection");
        System.out.println(newList);
        funcionarios.addAll(newList); //note que addAll faz um append (anexa a nova Collection)
        System.out.println("\nCollection depois de addAll");
        System.out.println(funcionarios);

        //Método clear
        System.out.println("\nCollection atual");
        System.out.println(funcionarios);
        //esvazinado a Collection
        funcionarios.clear();
        System.out.println("\nCollection depois da operação clear");
        System.out.println(funcionarios);

        //Método contains
        funcionarios = getFuncionarioCollection(); //recriando e repopulando a Collection
        System.out.println("\nCollection recriada e repopulada");
        System.out.println(funcionarios);
        System.out.println("\nContém o Funcionário de id=1?");
        //note que o algoritmo não estabeleceu um critério, logo, ele vai utilizar o hashcode para efeitos de comparação
        //Nesse caso, será o atributo id, pois o método hashcode foi implementado na classe Funcionário com esse critério
        System.out.println(funcionarios.contains(new Funcionario(1, String.valueOf(1), 1000)));

        //Método containsAll
        //para representar essa operação vamos criar e popular outra Collection
        newList = Arrays.asList(
            new Funcionario(1, String.valueOf(1), 1000),
            new Funcionario(2, String.valueOf(2), 2* 1000),
            new Funcionario(3, String.valueOf(3), 3 * 1000) //experimente mudar o id para 3000. Qual o resultado de containsAll? (false)
        );
        System.out.println("\nNova Collection");
        System.out.println(newList);
        System.out.println("\nContém todos os funcionários listados acima?");
        System.out.println(funcionarios.containsAll(newList));

        //Método equals
        System.out.println("\nEssas coleções são iguais (usa o hashcode para comparar)?");
        System.out.println(funcionarios.equals(newList));

        //Método hashCode
        System.out.println("\nHashcode da Collection?");
        System.out.println(funcionarios.hashCode());
        System.out.println(newList.hashCode());

        //Método isEmpty
        System.out.println("\nA coleção está vazia?");
        System.out.println(funcionarios.isEmpty());
        funcionarios.clear();
        System.out.println(funcionarios.isEmpty());

        //Método Iterator
        /** Um Iterator é um objeto que aponta para cada entrada da Collection **/
        funcionarios = getFuncionarioCollection(); //recria a Collection (tinhamos esvaziado com o clear :-) )
        Iterator<Funcionario> iterator = funcionarios.iterator(); //retorna o Iterator
        System.out.print("\nColeção impressa com o uso de Iterator");
        while (iterator.hasNext()) { //enquanto houver elementos na Collection
            System.out.print(iterator.next()); //imprime esse elemento
        }

        //Método remove
        Funcionario f = new Funcionario(1, String.valueOf(1), 1000);
        funcionarios.remove(f);
        System.out.println("\n\nObjeto a ser removido: " + f);
        System.out.print("\nCollection depois da remoção");
        System.out.println("\n" + funcionarios);

        //Método removeAll (remove os objetos de uma coleção em outra coleção, desde que eles estejam nessa outra coleção. Usa o hashcode para realizar essa operação)
        funcionarios = getFuncionarioCollection(); //recria a Collection
        Collection listToRemove = getFuncionarioCollection(); //cria uma outra Collection com os mesmos dados de funcionarios
        f = new Funcionario(2, String.valueOf(2), 2 * 1000);
        listToRemove.remove(f); //remove o Funcionario de id=2 da listToRemove
        funcionarios.removeAll(listToRemove); //remove todos os objetos de listToRemove da Collection funcionarios
        System.out.println("\nCollecton depois de removeAll");
        System.out.println(funcionarios); //só premaneceu o f na coleção funcionarios

        //Método removeIf
        funcionarios = getFuncionarioCollection(); //recria a Collection
        funcionarios.removeIf(func -> func.getSalario() == 3000);
        System.out.println("\nCollecton depois de removeIf (critério para remoção salário=3000");
        System.out.println(funcionarios);

        //Método retainAll (inverso de removeAll. Retém apenas os que estão na Collection de critério)
        funcionarios = getFuncionarioCollection(); //recria a Collection
        Collection listToRetain = getFuncionarioCollection(); //cria uma outra Collection com os mesmos dados de funcionarios
        f = new Funcionario(2, String.valueOf(2), 2 * 1000);
        listToRetain.remove(f); //remove o Funcionario de id=2 da listToRemove
        funcionarios.retainAll(listToRetain); //retém todos os objetos de listToRetain da Collection funcionarios
        System.out.println("\nCollecton depois de retainAll");
        System.out.println(funcionarios); //só premaneceu o f na coleção funcionarios

        //Método size
        System.out.println("\nTamanho da Collecton (uso do método size()");
        System.out.println(funcionarios.size());

        //Método stream (stream faz parte do conteúdo de Lambdas no Java. Ele foi introduzido no Java 8. Veja o módulo streams)
        System.out.println("\nStream retornada (um objeto do tipo Stream)"); //vai retornar o toString da classe Object
        Stream<Funcionario> stream = funcionarios.stream();
        System.out.println(stream);

        //Método toArray (Retorna um Array de objetos)
        //Há mais duas aplicações de toArray. Uma para retornar a partir de um "provided generator". Outra para retornar a partir de um arrayBase (tipo containsAll)
        //Essas outras duas aplicações foram suprimidas. Se quiser detalhes acesse a documentação do Java.
        Object[] array = funcionarios.toArray();
        System.out.println("\nArray retornado");
        System.out.println(Arrays.toString(array));
        System.out.print("\nElemento de indice 0 no array");
        System.out.println(array[0]);

        //Método forEach
        System.out.print("\nCollection impressa com o uso de forEach");
        funcionarios.forEach(funcionario -> System.out.println(funcionario));
    }

    private static Collection<Funcionario> getFuncionarioCollection() {
        Collection<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionarios.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nCollection Criada");
        System.out.println(funcionarios);
        return funcionarios;
    }
}
