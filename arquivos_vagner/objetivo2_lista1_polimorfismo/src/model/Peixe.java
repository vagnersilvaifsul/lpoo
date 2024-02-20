package model;

public class Peixe extends Animal {
	
	private double z = 0.0;

	public Peixe() {
		super();
	}

	public Peixe(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public Peixe(double x, double y) {
		super(x, y);
	}

	@Override
	public void desenhar() {
		System.out.print("\nDesenhou um Peixe.");
	}
	
	public void mover(double x, double y, double z) {
		super.mover(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "\nPeixeG [ x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
