package model;

public abstract class PersonagemV {
	
	protected double x=0, y=0;

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public PersonagemV() {
		super();
	}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
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

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public String toString() {
		return "\n¬PersonagemV [x=" + x + ", y=" + y + "]";
	}
}
