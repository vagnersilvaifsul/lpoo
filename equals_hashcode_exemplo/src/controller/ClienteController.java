package controller;

import model.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteController {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cliente c1 = new Cliente(1L, "500.226.660-60", "Ana Paula", "Santos", "Rua das Flores, 10", "96060-090", "53955551111", "anapaula@email.com");
        //Cliente c2 = new Cliente(1L, "500.226.660-60", "Ana Paula", "Santos", "Rua das Flores, 10", "96060-090", "53955551111", "anapaula@email.com");
        Cliente c2 = new Cliente(1L, "490.670.060-84", "Rafael", "Silva", "Rua das Flores, 10", "96060-090", "53955552222", "rafael@email.com");
        //Cliente c2 = c1;
        //c2.setId(23L);
        System.out.println("\nOs objetos criados são:");
        System.out.println("C1= " + c1);
        System.out.println("C1 Class= " + c1.getClass().getSimpleName());
        System.out.println("C2= " + c2);
        System.out.println("C2 Class= " + c2.getClass().getSimpleName());
        System.out.println("\nc1 == c2? " + c2.equals(c1));
        System.out.println("\nc1 hashCode: " + c1.hashCode());
        System.out.println("\nc2 hashCode: " + c2.hashCode());

        //clone de um objeto
        Cliente c3 = (Cliente) c1.clone(); //clona o objeto em outra instância (para que isso aconteça a classe Cliente tem que implementar a interface Cloneable)
        System.out.println("\nc3 hashCode: " + c3.hashCode());
        System.out.println("\nc1 == c3? " + c1.equals(c3));
        System.out.println(c3.getId() + " " + c3.getNome() + " " + c3.getCpf());

        System.out.print("\nLista de objetos");
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(c1);
        clienteList.add(c2);
        clienteList.add(c3);
        System.out.println("\nList");
        System.out.println(clienteList);

        System.out.print("\nMap de objetos");
        Map<Integer, Cliente> clienteHashMap = new HashMap<>();
        clienteHashMap.put(c1.hashCode(), c1);
        clienteHashMap.put(c2.hashCode(), c2);
        clienteHashMap.put(c3.hashCode(), c3);
        System.out.println("\nMap");
        System.out.println(clienteHashMap);

    }
}