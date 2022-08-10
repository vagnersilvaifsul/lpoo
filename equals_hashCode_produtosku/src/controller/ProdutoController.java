package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ProdutoController {
    public static void main(String[] args) {
        Collection produtos = new ArrayList<>();

        System.out.println("\n##### Cadastro de produtos #####\n");

        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) {
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                Produto produto = new Produto(sku, nome);
                if (produtos.contains(produto)) {
                    System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado.");
                }

                System.out.print("Deseja adicionar mais algum produto? (s/n) ");

                continuar = entrada.nextLine();
            }
        }

        System.out.println("\nProdutos salvos:");
        produtos.forEach(System.out::println);

        System.out.println("Fim");
    }
}