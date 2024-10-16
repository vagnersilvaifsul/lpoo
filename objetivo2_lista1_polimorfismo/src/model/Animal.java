package model;

public abstract class Animal { //1a
	protected double x = 0.0;
	protected double y = 0.0;

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Animal() {}

	//Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
	public Animal(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void mover(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/*
		Como cada Animal é desenhado diferente (tem algoritmo diferente para desenhar),
		o método é marcado como abstract. Assim, as classes filhas irão definí-lo (colocar o algoritmo que desenha).
		Note que cada classe filha terá o seu próprio comportamento (algoritmo) para desenhar.
	 */
	public abstract void desenhar();
	
}
