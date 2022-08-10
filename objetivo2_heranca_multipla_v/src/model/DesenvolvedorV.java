package model;

public class DesenvolvedorV extends FuncionarioV {

	@Override
	public double getBonus() {
		return this.getSalario() * 0.05;
	}

	@Override
	public String toString() {
		return "\nDesenvolvedorV [getBonus()=" + getBonus() + ", getNome()=" + getNome() + ", getSalario()="
				+ getSalario() + "]";
	}
	
	

}
