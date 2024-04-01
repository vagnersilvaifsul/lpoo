package model;

public class Navio extends Personagem {

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Navio() {
        super();
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Navio(double x, double y) {
        super(x, y);
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public void desenhar(){
        System.out.println("\nDesenhou um Navio.");
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public String toString() {
        return "\nNavio{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
