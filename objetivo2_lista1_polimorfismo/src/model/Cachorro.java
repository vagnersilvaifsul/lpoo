package model;

public class Cachorro extends Animal { //1a

	/*
		Ter mais de um contrutor é um tipo de polimorfismo, o de Sobrecarga (ou Overloading).
	 */
	public Cachorro() {}

	public Cachorro(double x, double y) {
		super(x, y); //reutiliza o construtor com dois argumentos da superclasse
	}

	@Override
	public void desenhar() {
		System.out.print("\nDesenhou um Cachorro.");
	}

	@Override
	public String toString() {
		return "\nCachorro [x=" + x + ", y=" + y + "]";
	}

}
