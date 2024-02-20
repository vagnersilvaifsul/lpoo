package model;

public class Tanque extends Personagem {

    //a sobrecarga dos construtores permite a criação polimórfica de instâncias
    public Tanque() {
        super();
    }

    //a sobrecarga dos construtores permite a criação polimórfica de instâncias
    public Tanque(double x, double y) {
        super(x, y);
    }

    /*
        Sobrescreve o comportamento abstrato da superclasse. Note que
        aqui o comportemento é concreto, isto é, ele foi definido.
     */
    @Override
    public void desenhar(){
        System.out.println("\nDesenhou um Tanque.");
    }

    /*
        Sobrescreve o comportamento da superclasse Personagem ou Object.
     */
    @Override
    public String toString() {
        return "\nTanque{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
