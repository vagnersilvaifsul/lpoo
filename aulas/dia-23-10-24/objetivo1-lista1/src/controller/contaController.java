package controller;
import model.Conta;

public class contaController {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta(
                0
        );

        // visualização dos primeiros objetos.
        System.out.println(c1);
        System.out.println(c2);
        // usando o getters e setters.
        c1.setSaldo(23698);
        c1.setId(1);
        c2.setSaldo(1000);
        c2.setId(2);

        System.out.println("\n PRINT DEPOIS DOS SETTERS \n");
        System.out.println(
                "Carro{ ID = " + c1.getId() + '\'' +
                        "marca='" + c1.getSaldo() +
                        '}');
        System.out.println(
                "Carro{ ID = " + c2.getId() + '\'' +
                        "marca='" + c2.getSaldo() +
                        '}');



    }
}
