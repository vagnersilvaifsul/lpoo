package model;

public class Peixe extends Animal { //1a
	
	private double z = 0.0;

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Peixe() {}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Peixe(double x, double y) {
		super(x, y);
	}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Peixe(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public void desenhar() {
		System.out.print("\nDesenhou um Peixe.");
	}
	
	public void mover(double x, double y, double z) {
		super.mover(x, y); //reutiliza o método mover que está na superclasse
		this.z = z;
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public String toString() {
		return "\nPeixe [ x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
