package model;

public class Passaro extends Animal { //1a
	
	private double z = 0.0;

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Passaro() {}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Passaro(double x, double y) {
		super(x, y);
	}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Passaro(double x, double y, double z) {
		super(x, y); //reutiliza o construtor com dois argumentos da superclasse
		this.z = z;
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public void desenhar() {
		System.out.print("\nDesenhou um Pássaro.");
	}
	
	public void mover3D(double x, double y, double z) {
		super.mover(x, y); //reutiliza o método mover que está na superclasse
		this.z = z;
	}

	@Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
	public String toString() {
		return "\nPassaro [ x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
