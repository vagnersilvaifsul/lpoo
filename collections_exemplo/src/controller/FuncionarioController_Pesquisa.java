package controller;

import model.Funcionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController_Pesquisa {
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
        System.out.println("\nPesquisa por força bruta, filtro pelo nome (nome=10)");
        funcionariosList.forEach(f -> {
            if(f.getNome().equalsIgnoreCase("10")){
                System.out.println("Localizou o funcionário: " + f);
            }
        });

        //Pesquisa otimizada (ver referência)

        //Utilizando Stream
        /* Note que, além de otimizada, essa pesquisa não corre o risco de alterar a Lista Original (pois utiliza um stream) */
        System.out.println("\nPesquisa Otimizada (utilizando stream().filter(), filtro pelo nome (nome=10)");
        Funcionario FuncionarioFind = funcionariosList.stream().filter(f -> f.getNome().equalsIgnoreCase("10")).findAny().orElse(null);
        System.out.println("Localizou o funcionário: " + FuncionarioFind);

        //Utilizando List
        /* Atente para o fato de o critério ser o do hashcode implementado na classe */
        System.out.print("\nPesquisa Otimizada (utilizando contains), filtro pelo objeto (nesse caso o critério é o hashcode implementado na classe Funcionario): ");
        System.out.println(funcionariosList.contains(new Funcionario(10, "10", 9.000)));
    }
}
