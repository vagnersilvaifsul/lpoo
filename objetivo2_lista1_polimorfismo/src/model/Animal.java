package model;

public abstract class Animal { //1a
	protected double x = 0.0;
	protected double y = 0.0;

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Animal() {}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Animal(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void mover(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void desenhar();
	
}
