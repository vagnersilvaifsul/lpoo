package controller;

import model.Funcionario;

import java.util.*;

public class Collection_Pesquisa {
    public static void main(String[] args) {
        //List
        /* Permite ordenação */
        /* Contém duplicatas */
        System.out.println("\nList Criada");
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            funcionariosList.add(new Funcionario(i+1, String.valueOf(i+1), i * 1000));
        }
        System.out.println(funcionariosList);

        //Pesquisa por força bruta
        /* Esse é o método que eu não aconselho, pois, no pior caso (desse exemplo), toda lista será percorrida para localizar o objeto */
        System.out.print("\n************************* Pesquisa por força bruta em uma List *************************");
        System.out.println("\nPesquisa por força bruta, filtro pelo nome (nome=10)");
        funcionariosList.forEach(f -> {
            if(f.getNome().equalsIgnoreCase("10")){
                System.out.println("Localizou o funcionário: " + f);
            }
        });

        //Pesquisa otimizada (ver referência)

        //Utilizando Stream (Lambdas do Java 8+)
        /* Note que, além de otimizada, essa pesquisa não corre o risco de alterar a Lista Original (pois utiliza um stream) */
        System.out.print("\n************************* Pesquisa otimizada com Stream (Lambdas) em uma List *************************");
        System.out.println("\nPesquisa Otimizada (utilizando stream().filter(), filtro pelo nome (nome=10)");
        Funcionario FuncionarioFind = funcionariosList.stream().filter(f -> f.getNome().equalsIgnoreCase("10")).findAny().orElse(null);
        System.out.println("Localizou o funcionário: " + FuncionarioFind);

        //Utilizando a interface Collection
        /* Atente para o fato de o critério ser o do hashcode implementado na classe */
        System.out.print("\n************************* Pesquisa otimizada com o método contains da interface Collection em uma List *************************");
        System.out.print("\nPesquisa Otimizada (utilizando contains da interface Collection), filtro pelo objeto (nesse caso o critério é o hashcode implementado na classe Funcionario): ");
        System.out.println(funcionariosList.contains(new Funcionario(10, "10", 9.000)));

        //Pesquisa em Map
        /* A vantagem nesse tipo de coleção é a velocidade para salvar dados e recuperar dados. */
        System.out.print("\n************************* Operando Map *************************");
        Map<Integer, Funcionario> funcionariosMap = new HashMap<>();
        System.out.println("\nMap criado");
        System.out.println(funcionariosMap);
        for (int i = 0; i < 10; i++) {
            funcionariosMap.put(i+1, new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nMap populado");
        System.out.println(funcionariosMap);
        System.out.println("\nPesquisa de funcionario de chave 9"); //pesquisa pela chave
        System.out.println(funcionariosMap.get(9)); //devolve o valor

        //Pesquisa em Set
        System.out.print("\n************************* Operando Set *************************");
        Set<Funcionario> funcionariosSet = new HashSet<>();
        System.out.println("\nSet criado");
        System.out.println(funcionariosSet);
        for (int i = 0; i < 10; i++) {
            funcionariosSet.add(new Funcionario(i+1, String.valueOf(i+1), (i+1) * 1000));
        }
        System.out.println("\nSet populado");
        System.out.println(funcionariosSet);
        System.out.print("\n+++++++++++++++++++++++++ Pesquisa pelo método contains da interface Collection ++++++++++++++++++++++++++++++");
        System.out.println("\nPesquisa pelo funcionario de id=3 (utiliza o hashcode para pesquisar, nesse caso o id)"); //pesquisa pela chave
        System.out.println(funcionariosSet.contains(new Funcionario(3, String.valueOf(3), 3 * 1000))); //devolve um booleno

        //Eu recomento essa técnica!!!!!!
        System.out.print("\n+++++++++++++++++++++++++ Pesquisa usando Stream (Lambda) ++++++++++++++++++++++++++++++");
        System.out.print("\nTécnica recomendada pelo professor");
        System.out.print(funcionariosSet.stream()
            .filter(o -> o.getNome().equals("3"))
            .findAny().get());

        System.out.print("\n\n+++++++++++++++++++++++++ Pesquisa pelo objeto, utilizando força bruta ++++++++++++++++++++++++++++++");
        //ou utilizar força bruta (técnica não recomendada)
        funcionariosSet.forEach(fs -> {
            Funcionario f = (new Funcionario(3, String.valueOf(3), 3 * 1000));
            if(fs.equals(f)){
                System.out.println(f);
            }
        });

        //se quiser retornar o objeto de um Set você pode convertê-lo noutra estrutura, como:
        System.out.print("\n+++++++++++++++++++++++++ Pesquisa pelo objeto, utilizando a técnica de conversão em List ++++++++++++++++++++++++++++++");
        List<Funcionario> list = new ArrayList<>(funcionariosSet);
        System.out.println(list.get(2)); //o índice 2 retorna o objeto de id=3
    }
}
