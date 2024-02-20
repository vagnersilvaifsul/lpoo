package model;

public class Navio extends Personagem {

    //a sobrecarga dos construtores permite a criação polimórfica de instâncias
    public Navio() {
        super();
    }

    //a sobrecarga dos construtores permite a criação polimórfica de instâncias
    public Navio(double x, double y) {
        super(x, y);
    }

    /*
        Sobrescreve o comportamento abstrato da superclasse. Note que
        aqui o comportemento é concreto, isto é, ele foi definido.
     */
    @Override
    public void desenhar(){
        System.out.println("\nDesenhou um Navio.");
    }

    /*
        Sobrescreve o comportamento da superclasse Personagem ou Object.
     */
    @Override
    public String toString() {
        return "\nNavio{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
