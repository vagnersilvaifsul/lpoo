package model;

//Como a Questão 2 especializa os Gerentes, esta classe deveria ser marcada com abstract.
//Isso não foi feito para poder manter a resposta da Questão 1.
public class Gerente extends Funcionario { //Questão 1a
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	//Na Questão 2 poderia ser marcado como abstract, deixando para as classes especializadas resolver esse cálculo
	@Override
	public double getBonus(){
		return getSalario() * 0.20;
	} //Questão 1f

	@Override
	public String toString() {
		return "\nGerente{Nome=" + super.getNome() + " Salário=" + super.getSalario() + "}";
	}
}
