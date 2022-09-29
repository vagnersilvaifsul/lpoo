package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.AutomovelG;
import model.BicicletaG;
import model.CaminhaoG;
import model.CarroG;
import model.VeiculoG;

public class VeiculoControllerG {
	public static void main(String[] args) {
		// 1
		// a int numeroDeEixos, String propulsao, String marca, String modelo, int
		// anoFabricacao, int tamanhoRoda, String chassi
		BicicletaG b1 = new BicicletaG(2, "humana", "Caloi", "Super aaa", 2021, 29, "aa123456");
		System.out.println(b1);

		// b int numeroDeEixos, String propulsao, String marca, String modelo, int
		// anoFabricacao, int capacidadePortaMalas , String renavam, String chassi, String placa
		CarroG car1 = new CarroG(2, "álcool/gasolina", "Fiat", "Uno", 2010, 180, "012345", "AAA12345", "IAA1234");
		System.out.println(car1);

		// c int numeroDeEixos, String propulsao, String marca, String modelo, int
		// anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa
		CaminhaoG cm1 = new CaminhaoG(5, "Diesel", "Scania", "CCC", 2012, 45, "043213", "AAA245FDE", "IAA6789");
		System.out.println(cm1);

		// 2
		BicicletaG b2 = new BicicletaG(2, "humana", "Velox", "bbb", 2021, 29, "BBB123456");
		BicicletaG b3 = new BicicletaG(2, "humana", "c", "ccc", 2019, 29, "CCC123456");
		BicicletaG b4 = new BicicletaG(2, "humana", "Velox", "ddd", 2018, 29, "DDD123456");
		BicicletaG b5 = new BicicletaG(2, "humana", "v", "eee", 2021, 29, "EEE123456");

		CarroG car2 = new CarroG(2, "álcool/gasolina", "Volkswagen", "Fox", 2012, 180, "312345", "BBB12345", "BBB1234");
		CarroG car3 = new CarroG(2, "álcool/gasolina", "Fiat", "Toro", 2020, 640, "512345", "CCC12345", "CCC1234");
		CarroG car4 = new CarroG(2, "álcool/gasolina", "Volkswagen", "Fox", 2012, 180, "312345", "DDD12345", "DDD1234");
		CarroG car5 = new CarroG(2, "álcool/gasolina", "Volkswagen", "Fox", 2012, 180, "312345", "EEE12345", "EEE1234");

		CaminhaoG cm2 = new CaminhaoG(5, "Diesel", "Mercedes", "1111", 2000, 25, "443213", "BB3245FDE", "BBB2134");
		CaminhaoG cm3 = new CaminhaoG(5, "Diesel", "Scania", "2310", 2020, 45, "043213", "CC3245FDE", "CCC2134");
		CaminhaoG cm4 = new CaminhaoG(5, "Diesel", "Scania", "2020", 2015, 45, "043213", "DD3245FDE", "DDD2134");
		CaminhaoG cm5 = new CaminhaoG(5, "Diesel", "Scania", "3040", 2019, 45, "043213", "EE3245FDE", "EEE2134");

		List<VeiculoG> veiculos = new ArrayList<>();
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
		veiculos.sort(Comparator.comparing(VeiculoG::getAnoFabricacao));
		System.out.print("\n\nLista de VEÍCULOS cadastrados (por ano de fabricação): " + veiculos);

		// b
		System.out.print("\n\nLista de AUTOMOVEIS cadastrados (por ano de fabricação:) ");
		veiculos.forEach(v -> {
			if (v instanceof AutomovelG) {
				System.out.print(v);
			}
		});

		// c
		System.out.print("\n\nLista de BICICLETAS cadastrados (por ano de fabricação): ");
		veiculos.forEach(v -> {
			if (v instanceof BicicletaG) {
				System.out.print(v);
			}
		});

		// d
		System.out.print("\n\nLista de VEÍCULOS que a placa começa por I ou i: ");
		veiculos.forEach(v -> {
			if (v instanceof AutomovelG) {
				if( ((AutomovelG) v).getPlaca().startsWith("I") || ((AutomovelG) v).getPlaca().startsWith("i") ) {
					System.out.print(v);
				}
			}
		});

	}
}
