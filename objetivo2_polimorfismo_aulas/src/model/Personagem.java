package model;

public abstract class Personagem {

    protected double x=0, y=0;

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Personagem() {
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Personagem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y){
        System.out.println("Moveu um Personagem2D.");
    	this.x = x;
        this.y = y;
    }

    /*
        Por que o projetista marcou esse comportamento como abstract?
        Por que cada personagem deve ser desenhado nas subclasses.
        O projetista quer que tenha um comportamento desenhar() na API,
        e deixou para as classes específicas definir como se faz isso.
     */
    public abstract void desenhar();

    /*
        Sobrescreve o comportamento da superclasse Object.
     */
    @Override
    public String toString() {
        return "Personagem{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
