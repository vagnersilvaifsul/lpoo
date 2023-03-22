package controller;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.GregorianCalendar;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

public class UberController {
	
	public static void main(String[] args) {
		//d
		Usuario u = new Usuario(1L, "Ana Dias", "ana@email.com", "5395551234");
		Veiculo v = new Veiculo(1L, "Chevrolet Onix Plus", "III4321", 2021);
		Motorista m = new Motorista(1L, "Rafael Silva", "rafa@email.com", "5395557654", v);
		
		Corrida c1 = new Corrida(1L, "Pix", "token Pix AcsTRDHF", LocalDateTime.of(2021, 5, 10, 10, 01), 25.00, u, m);
		Corrida c2 = new Corrida(1L, "Pix", "token Pix mKJH43eF", LocalDateTime.of(2021, 2, 19, 22, 01), 25.00, u, m);
		
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
		System.out.print("\n***** Total das corridas do motorista " + m.getNome() + "= ");
		System.out.println(NumberFormat.getCurrencyInstance().format(
			m.getCorridas().stream()
				.mapToDouble(c -> c.getPreco())
				.sum()));

	}
}
