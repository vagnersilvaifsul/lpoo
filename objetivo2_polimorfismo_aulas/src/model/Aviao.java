package model;

public class Aviao extends Personagem {

    private double z=0;

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Aviao() {
        super();
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
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

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public String toString() {
        return "\nAviao{" +
                "  x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
