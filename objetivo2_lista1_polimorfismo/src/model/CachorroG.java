package model;

public class CachorroG extends AnimalG {
	
	public CachorroG() {
		super();
	}

	public CachorroG(double x, double y) {
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
