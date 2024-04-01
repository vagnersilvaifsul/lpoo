package model;

public class TanqueV extends PersonagemV{

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public TanqueV() {
		super();
	}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public TanqueV(double x, double y) {
		super(x, y);
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public void desenhar() {
		System.out.println("Desenhou um tanque.");
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public String toString() {
		return "\nTanqueV [x=" + x + ", y=" + y + "]";
	}

}
