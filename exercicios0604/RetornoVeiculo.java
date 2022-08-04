package exercicios0604;

import java.util.ArrayList;

public class RetornoVeiculo {

	public static void main(String[] args) {

		ArrayList<Veiculos> veiculos = new ArrayList<>();

		Veiculos veiculos0 = new Veiculos("VW", "Gol", "9BW11111119452687");

		Veiculos veiculos1 = new Veiculos("bmw", "Android", "7JKAAXsUagBAA9295");

		Veiculos veiculos2 = new Veiculos("Jeep", "Renegade", " ");

		Veiculos veiculos3 = new Veiculos("hyundai", "i30", "8RcyA41VpAezy6240");

		Veiculos veiculos4 = new Veiculos("GM", "Camaro", " ");

		veiculos.add(veiculos0);
		veiculos.add(veiculos1);
		veiculos.add(veiculos2);
		veiculos.add(veiculos3);
		veiculos.add(veiculos4);

		for (Veiculos v : veiculos) {
			if (v.getChassi() != " ")
				System.out.println(v);
		}
	}
}