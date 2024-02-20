package model;

public abstract class PersonagemV {
	
	protected double x=0, y=0;
	
	public PersonagemV() {
		super();
	}

	public PersonagemV(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void mover(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void desenhar();

	@Override
	public String toString() {
		return "\n¬PersonagemV [x=" + x + ", y=" + y + "]";
	}
}
