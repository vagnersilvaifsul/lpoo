package model;

public abstract class Animal { //1a
	protected double x = 0.0;
	protected double y = 0.0;

	/*
		Ter mais de um contrutor é um tipo de polimorfismo, o de Sobrecarga (ou Overloading).
	 */
	public Animal() {}

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
