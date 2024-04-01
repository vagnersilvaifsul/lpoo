package model;

public class Peixe extends Animal { //1a
	
	private double z = 0.0;

	/*
		Ter mais de um contrutor é um tipo de polimorfismo, o de Sobrecarga (ou Overloading).
	 */
	public Peixe() {}
	
	public Peixe(double x, double y) {
		super(x, y);
	}

	public Peixe(double x, double y, double z) {
		super(x, y); //reutiliza o construtor com dois argumentos da superclasse
		this.z = z;
	}

	@Override
	public void desenhar() {
		System.out.print("\nDesenhou um Peixe.");
	}
	
	public void mover(double x, double y, double z) {
		super.mover(x, y); //reutiliza o método mover que está na superclasse
		this.z = z;
	}

	@Override
	public String toString() {
		return "\nPeixe [ x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
