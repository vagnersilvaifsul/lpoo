package model;

public abstract class AnimalG {
	protected double x = 0.0;
	protected double y = 0.0;
	
	public AnimalG() {
		super();
	}

	public AnimalG(double x, double y) {
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
