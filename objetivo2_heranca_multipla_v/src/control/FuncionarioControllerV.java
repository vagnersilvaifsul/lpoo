package control;

import model.ClienteV;
import model.DesenvolvedorV;
import model.GerenteV;

public class FuncionarioControllerV {
	
	public static void main(String[] args) {
		DesenvolvedorV d1 = new DesenvolvedorV();
		
		GerenteV g1 = new GerenteV();
		
		ClienteV c1 = new ClienteV();
		
		//utilizando os comportamentos de Desenvolvedor
		d1.setSalario(1000.00);
		d1.setNome("Rafael");
		System.out.println(d1);
		
		g1.setSalario(2000.00);
		g1.setNome("Ana");
		g1.setTicker("TOTS3");
		g1.setQuantidade(1000);
		System.out.println(g1);
		
		c1.setId(1);
		c1.setNome("Aline");
		c1.setSobrenome("Santos");
		c1.setTicker("TOTS3");
		c1.setQuantidade(1000);
		System.out.println(c1);
	}
}