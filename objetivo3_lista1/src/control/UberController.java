package control;

import java.text.NumberFormat;
import java.util.Comparator;
import java.util.GregorianCalendar;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.VeiculoO3L1;

public class UberController {
	
	public static void main(String[] args) {
		//d
		Usuario u = new Usuario(1L, "Ana Dias", "ana@email.com", "5395551234");
		VeiculoO3L1 v = new VeiculoO3L1(1L, "Chevrolet Onix Plus", "III4321", 2021);
		Motorista m = new Motorista(1L, "Rafael Silva", "rafa@email.com", "5395557654", v);
		
		Corrida c1 = new Corrida(1L, "Pix", "token Pix AcsTRDHF", new GregorianCalendar(2021, 5, 10, 10, 01), 25.00, u, m);
		Corrida c2 = new Corrida(1L, "Pix", "token Pix mKJH43eF", new GregorianCalendar(2021, 2, 19, 22, 01), 25.00, u, m);
		
		//parte 1
		System.out.print("\n***** Corridas por Usuário");
		u.getCorridas().add(c1);
		u.getCorridas().add(c2);
		u.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
		System.out.println(u.getCorridas());
		
		//parte 2
		System.out.print("\n***** Corridas por motorista");
		m.getCorridas().add(c1);
		m.getCorridas().add(c2);
		m.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
		System.out.println(m.getCorridas());
		
		
		//parte 3
		System.out.print("\n***** Total das corridas do motorista " + m.getClass() + "= ");
		double acum = 0.0;
		for (int i = 0; i < m.getCorridas().size(); i++) {
			acum += m.getCorridas().get(i).getPreco();	
		}
		System.out.println(NumberFormat.getCurrencyInstance().format(acum));
		
		
	}
}
