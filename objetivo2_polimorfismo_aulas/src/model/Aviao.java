package model;

public class Aviao extends Personagem {

    private double z=0;

    //a sobrecarga dos construtores permite a criação polimórfica de instâncias
    public Aviao() {
        super();
    }

    //a sobrecarga dos construtores permite a criação polimórfica de instâncias
    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    /*
        Sobrescreve o comportamento abstrato da superclasse. Note que
        aqui o comportemento é concreto, isto é, ele foi definido.
     */
    @Override
    public void desenhar(){
        System.out.println("\nDesenhou um Aviao.");
    }

    //Esse comportamento só existe nessa subclasse, notem que eu reutilizei no nome, mover, mas a assinatura é diferente.
    //Logo, isso é uma sobrecarga de método, não uma sobrescrita.
    public void mover(double x, double y, double z){
        System.out.println("Moveu um Aviao3D.");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /*
        Sobrescreve o comportamento da superclasse Personagem ou Object.
     */
    @Override
    public String toString() {
        return "\nAviao{" +
                "  x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
