package model;

public class TanqueV extends PersonagemV{
	
	public TanqueV() {
		super();
	}

	public TanqueV(double x, double y) {
		super(x, y);
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhou um tanque.");
	}

	@Override
	public String toString() {
		return "\nTanqueV [x=" + x + ", y=" + y + "]";
	}

}
