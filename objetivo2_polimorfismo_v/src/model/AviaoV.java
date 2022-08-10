package model;

public class AviaoV extends PersonagemV{

	private double z=0;
	
	public AviaoV() {
		super();
	}

	public AviaoV(double x, double y) {
		super(x, y);
	}
	
	public AviaoV(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public void mover(double x, double y, double z) {
		super.mover(x, y);
		this.z = z;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhou um avião");	
	}

	@Override
	public String toString() {
		return "\nAviaoV [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
	

}
