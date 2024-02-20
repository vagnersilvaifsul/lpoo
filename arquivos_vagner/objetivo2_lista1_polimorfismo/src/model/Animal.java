package model;

public abstract class Animal {
	protected double x = 0.0;
	protected double y = 0.0;
	
	public Animal() {
		super();
	}

	public Animal(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void mover(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void desenhar();
	
}
