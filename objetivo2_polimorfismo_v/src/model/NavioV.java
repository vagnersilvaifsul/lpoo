package model;

public class NavioV extends PersonagemV{

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public NavioV() {
		super();
	}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public NavioV(double x, double y) {
		super(x, y);
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public void desenhar() {
		System.out.println("Desenhou um navio.");
		
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public String toString() {
		return "\nNavioV [x=" + x + ", y=" + y + "]";
	}
	
	

}
