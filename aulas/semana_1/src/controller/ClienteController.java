package controller;

import model.Cliente;

public class ClienteController {
    public static void main(String[] args) {

        Cliente c2 = new Cliente("235.111.1..1.22", "falido", "silva", "dois", "121212-111", "()3266177", "hjhjh@jkhjkhk");
        c2.setNome("não falido");
        System.out.println(c2);
        System.out.println(c2.getCpf());
    }
}
