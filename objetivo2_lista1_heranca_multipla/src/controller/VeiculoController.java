package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Automovel;
import model.Bicicleta;
import model.Caminhao;
import model.Carro;
import model.Veiculo;

public class VeiculoController {
	public static void main(String[] args) {
		// 1
		// a int numeroDeEixos, String propulsao, String marca, String modelo, int
		// anoFabricacao, int tamanhoRoda, String chassi
		Bicicleta b1 = new Bicicleta(2, "humana", "Caloi", "Super aaa", 2021, 29, "aa123456");
		System.out.println(b1);

		// b int numeroDeEixos, String propulsao, String marca, String modelo, int
		// anoFabricacao, int capacidadePortaMalas , String renavam, String chassi, String placa
		Carro car1 = new Carro(2, "álcool/gasolina", "Fiat", "Uno", 2010, 180, "012345", "AAA12345", "IAA1234");
		System.out.println(car1);

		// c int numeroDeEixos, String propulsao, String marca, String modelo, int
		// anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa
		Caminhao cm1 = new Caminhao(5, "Diesel", "Scania", "CCC", 2012, 45, "043213", "AAA245FDE", "IAA6789");
		System.out.println(cm1);

		// 2
		Bicicleta b2 = new Bicicleta(2, "humana", "Velox", "bbb", 2021, 29, "BBB123456");
		Bicicleta b3 = new Bicicleta(2, "humana", "c", "ccc", 2019, 29, "CCC123456");
		Bicicleta b4 = new Bicicleta(2, "humana", "Velox", "ddd", 2018, 29, "DDD123456");
		Bicicleta b5 = new Bicicleta(2, "humana", "v", "eee", 2021, 29, "EEE123456");

		Carro car2 = new Carro(2, "álcool/gasolina", "Volkswagen", "Fox", 2012, 180, "312345", "BBB12345", "BBB1234");
		Carro car3 = new Carro(2, "álcool/gasolina", "Fiat", "Toro", 2020, 640, "512345", "CCC12345", "CCC1234");
		Carro car4 = new Carro(2, "álcool/gasolina", "Volkswagen", "Fox", 2012, 180, "312345", "DDD12345", "DDD1234");
		Carro car5 = new Carro(2, "álcool/gasolina", "Volkswagen", "Fox", 2012, 180, "312345", "EEE12345", "EEE1234");

		Caminhao cm2 = new Caminhao(5, "Diesel", "Mercedes", "1111", 2000, 25, "443213", "BB3245FDE", "BBB2134");
		Caminhao cm3 = new Caminhao(5, "Diesel", "Scania", "2310", 2020, 45, "043213", "CC3245FDE", "CCC2134");
		Caminhao cm4 = new Caminhao(5, "Diesel", "Scania", "2020", 2015, 45, "043213", "DD3245FDE", "DDD2134");
		Caminhao cm5 = new Caminhao(5, "Diesel", "Scania", "3040", 2019, 45, "043213", "EE3245FDE", "EEE2134");

		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(b1);
		veiculos.add(b2);
		veiculos.add(b3);
		veiculos.add(b4);
		veiculos.add(b5);
		veiculos.add(car1);
		veiculos.add(car2);
		veiculos.add(car3);
		veiculos.add(car4);
		veiculos.add(car5);
		veiculos.add(cm1);
		veiculos.add(cm2);
		veiculos.add(cm3);
		veiculos.add(cm4);
		veiculos.add(cm5);

		// a
		veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
		System.out.print("\n\nLista de VEÍCULOS cadastrados (por ano de fabricação): " + veiculos);

		// b
		System.out.print("\n\nLista de AUTOMOVEIS cadastrados (por ano de fabricação:) ");
		veiculos.forEach(v -> {
			if (v instanceof Automovel) {
				System.out.print(v);
			}
		});

		// c
		System.out.print("\n\nLista de BICICLETAS cadastrados (por ano de fabricação): ");
		veiculos.forEach(v -> {
			if (v instanceof Bicicleta) {
				System.out.print(v);
			}
		});

		// d
		System.out.print("\n\nLista de VEÍCULOS que a placa começa por I ou i: ");
		veiculos.forEach(v -> {
			if (v instanceof Automovel) {
				if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
					System.out.print(v);
				}
			}
		});

	}
}
