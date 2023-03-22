package model;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super();
	}

	public Cachorro(double x, double y) {
		super(x, y);
	}

	@Override
	public void desenhar() {
		System.out.print("\nDesenhou um Cachorro.");
	}

	@Override
	public String toString() {
		return "\nCachorroG [x=" + x + ", y=" + y + "]";
	}

}
