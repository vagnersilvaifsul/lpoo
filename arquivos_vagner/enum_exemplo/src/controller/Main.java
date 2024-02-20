package controller;

import model.Estado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estados presentes no Enum Estado:");
        for(Estado estadoEnum : Estado.values()){
            System.out.println(estadoEnum);
        }
    }
}
