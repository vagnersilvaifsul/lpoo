package model;

public class NavioV extends PersonagemV{
	
	public NavioV() {
		super();
	}

	public NavioV(double x, double y) {
		super(x, y);
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhou um navio.");
		
	}

	@Override
	public String toString() {
		return "\nNavioV [x=" + x + ", y=" + y + "]";
	}
	
	

}
