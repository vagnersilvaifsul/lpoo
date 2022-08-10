package controller;

import model.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1L, "500.226.660-60", "Ana Paula", "Santos", "Rua das Flores, 10", "96060-090", "53955551111", "anapaula@email.com");
        c1.setId(1L);
        Cliente c2 = new Cliente(2L, "490.670.060-84", "Rafael", "Silva", "Rua das Flores, 10", "96060-090", "53955552222", "rafael@email.com");
        //Cliente c2 = c1;
        c2.setId(1L);
        System.out.println("\nOs objetos criados são:");
        System.out.println("C1= " + c1);
        System.out.println("C2= " + c2);
        System.out.println("\nc1 == c2? " + c2.equals(c1));
        System.out.println("\nc2 hashCode: " + c1.hashCode());
        System.out.println("\nc1 hashCode: " + c2.hashCode());

//        List<Cliente> clienteList = new ArrayList<>();
//        clienteList.add(c1);
//        clienteList.add(c2);
//        System.out.println("\nList");
//        System.out.println(clienteList);
//
//        Map<Long, Cliente> clienteHashMap = new HashMap<>();
//        clienteHashMap.put(c1.getId(), c1);
//        clienteHashMap.put(c2.getId(), c2);
//        System.out.println("\nMap");
//        System.out.println(clienteHashMap);

    }
}