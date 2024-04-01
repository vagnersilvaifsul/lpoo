package controller;

public class CoercaoDeTipo {
    private static void conversor(double valor){
        System.out.println(valor);
    }

    public static void main(String[] args) {
    /*
        As operações abaixo só são possíveis porque o método conversor() aceita
        o tipo double, que possui mais bits que os demais tipos utilizados.
     */
        conversor(3.14);  //converte um literal do tipo double
        conversor((byte) 1);    //converte um literal do tipo byte em double
        conversor((short) 2);   //converte um literal do tipo short em dounle
        conversor('a');   //converte um literal do tipo char em double
        conversor(3);     //converte um literal do tipo int em double
        conversor(4L);    //converte um literal do tipo long em double
        conversor(3.14F); //converte um literal do tipo float em double
    }
}
