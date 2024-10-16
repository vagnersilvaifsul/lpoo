package model;

public class Cachorro extends Animal { //1a
	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Cachorro() {}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Cachorro(double x, double y) {
		super(x, y); //reutiliza o construtor com dois argumentos da superclasse
	}

	@Override //Polimorfismo Universal (ou sobreescrita)
	public void desenhar() {
		System.out.print("\nDesenhou um Cachorro.");
	}

	@Override //Polimorfismo Universal (ou sobreescrita)
	public String toString() {
		return "\nCachorro [x=" + x + ", y=" + y + "]";
	}

}
