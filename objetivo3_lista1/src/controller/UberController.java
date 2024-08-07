package controller;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.*;

public class UberController {
	
	public static void main(String[] args) {
		//a
		Usuario u = new Usuario(1L, "Ana Dias", "ana@email.com", "5395551234");
		Motorista m = new Motorista(1L, "Rafael Silva", "rafa@email.com", "5395557654");
		Veiculo v = new Veiculo(1L, "III-1234", "d4rf6Ter#D", "Chevrolet", "Onix", 2023, m);
		
		Corrida c1 = new Corrida(1L, BigDecimal.valueOf(25.00), LocalDateTime.of(2024, 2, 10, 10, 1), LocalDateTime.of(2024, 5, 10, 10, 20), FormaDePagamento.cartaoDeCredito, Situacao.Faturada, u, m);
		Corrida c2 = new Corrida(2L, new BigDecimal("45.00"), LocalDateTime.of(2024, 8, 10, 8, 0), LocalDateTime.of(2024, 8, 10, 9, 15), FormaDePagamento.cartaoDeCredito, Situacao.Faturada, u, m);

		//b
		List<Corrida> corridas = new ArrayList<>();
		corridas.add(c1);
		corridas.add(c2);
		corridas.sort(Comparator.comparing(Corrida::getValor).reversed());
		System.out.print("\nTodas as corridas do usuário (ordem decrescente, critério valor da corrida) " + u.getNome());
		for (Corrida corrida : corridas) {
			if(corrida.getUsuario().equals(u)){
				System.out.println(corrida);
				System.out.print("----------------");
			}
		}

		//c
		corridas.sort(Comparator.comparing(Corrida::getDataInicio));
		System.out.print("\n\nTodas as corridas do motorista (ordem crescente, critério data de início da corrida) " + m.getNome());
		for (Corrida corrida : corridas) {
			if(corrida.getMotorista().equals(m)){
				System.out.println(corrida);
				System.out.print("----------------");
			}
		}

		//d
		BigDecimal totalDasCorridas = BigDecimal.ZERO;
		for (Corrida corrida : corridas) {
			if(corrida.getMotorista().equals(m)){
				totalDasCorridas = totalDasCorridas.add(corrida.getValor());
			}
		}
		System.out.print("\n\nTotal de todas as corridas do motorista "
			+ m.getNome()
			+ " = "
			+ NumberFormat.getCurrencyInstance().format(totalDasCorridas));

	}
}
