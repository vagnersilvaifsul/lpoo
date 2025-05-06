package controller;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CooperativaDeCreditoController {
    public static void main(String[] args) {
        //1c. Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos nos atributos dessas instâncias, e imprima esses objetos;
        ContaPoupanca cp1 = new ContaPoupanca(1000.00);
        ContaPoupanca cp2 = new ContaPoupanca(2000.00);
        ContaPoupanca cp3 = new ContaPoupanca(3000.00);

        ContaCorrente cc1 = new ContaCorrente(4000.00, 0);
        ContaCorrente cc2 = new ContaCorrente(5000.00, 0);
        ContaCorrente cc3 = new ContaCorrente(6000.00, 0);

        Cliente c1 = new Cliente("Ana", 0);
        Cliente c2 = new Cliente("Rafael", 0);
        Cliente c3 = new Cliente("Maria", 0);

        System.out.print("\n******* Questão 1c *******");
        System.out.print("\nObjetos criados:");
        System.out.println(cp1 + "" + cp2 + cp3 + cc1 + cc2 + cc3 + c1 + c2 + c3);

        //1d. Crie as coleções necessárias para expressar as contas registradas no sistema, bem como, os associados, depois imprima essas coleções;
        List<Conta> contas = new ArrayList<>(Arrays.asList(cp1, cp2, cp3, cc1, cc2, cc3)); //representa as contas cadastradas no sistema
        List<Associado> associados = new ArrayList<>(Arrays.asList(cc1, cc2, cc3, c1, c2, c3)); //representa os associados cadastrados no sistema
        System.out.print("\n******* Questão 1d *******");
        System.out.print("\nColeções criadas no sistema:");
        System.out.println(contas);
        System.out.println(associados);

        //1e. Movimente, pelo menos, uma conta poupança, realizando as seguintes operações: depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00. Imprima o objeto;
        cp1.deposita(1000.00);
        cp1.atualiza(5.00);
        cp1.saca(1000.00);
        System.out.print("\n******* Questão 1e *******");
        System.out.print("\nMovimento na Conta Poupança");
        System.out.println(cp1);

        //1f. Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito R$ 500,00; saque de R$ 400,00. Imprima o objeto;
        cc1.deposita(1000.00);
        cc1.atualiza(10.00);
        cc1.saca(1000.00);
        System.out.print("\n******* Questão 1f *******");
        System.out.print("\nMovimento na Conta Corrente:");
        System.out.println(cc1);

        //1g. Faça com que cada associado tenha as seguintes quantidades de cotas, nessa ordem: 100, 400, 600, 300, 600, 600, e imprima as coleções
        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        c1.setQdeCotas(300);
        c2.setQdeCotas(600);
        c3.setQdeCotas(600);
        System.out.print("\n******* Questão 1g *******");
        System.out.print("\nAssociados com as cotas atualizadas:");
        System.out.println(associados);

        //1h. A partir das coleções, imprima todos os associados, ordenados pelo critério de número de cotas, em ordem decrescente. E faça o programa calcular e imprimir os associados com o maior número de cotas no sistema;
        System.out.print("\n******* Questão 1h *******");
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.print("\nAssociados ordenados por quantidade de cotas:");
        System.out.println(associados);
        System.out.print("\nAssociados com o maior número de cotas:");
        Associado maxAssociado = associados.stream()
                .max(Comparator.comparing(Associado::getQdeCotas))
                .get();
        for(Associado associado : associados) {
            if(associado.getQdeCotas() >= maxAssociado.getQdeCotas()) {
                System.out.print(associado);
            }
        }

        //1i. A partir das coleções, imprima todas as contas cadastradas no sistema, ordenadas pelo critério saldo, em ordem decrescente. E, imprima todos associados que seja do tipo Associado e possua conta cadastrada no sistema, em qualquer ordem. Também faça o programa imprimir a lista de contas com maior saldo bancário.
        System.out.print("\n\n******* Questão 1i *******");
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nContas ordenadas por saldo:");
        System.out.println(contas);
        System.out.print("\nContas com o maior saldo:");
        Conta maxConta = contas.stream()
                .max(Comparator.comparing(Conta::getSaldo))
                .get();
        for(Conta conta : contas) {
            if(conta.getSaldo() >= maxConta.getSaldo()) {
                System.out.print(conta);
            }
        }
        System.out.print("\nImprima todos associados que seja do tipo Associado e possua conta cadastrada no sistema:");
        for(Associado associado : associados) {
            if(associado instanceof Conta){
                System.out.println(associado);
            }
        }
    }
}
