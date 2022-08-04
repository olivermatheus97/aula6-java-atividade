package exercicios0603;

import java.util.ArrayList;

public class RetornoMais18 {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		Pessoa pessoa0 = new Pessoa("Matheus", "Pereira", "Goiania", "1997-11-10");

		Pessoa pessoa1 = new Pessoa("Tallis", "Roberto", "Posse", "1996-04-05");

		Pessoa pessoa2 = new Pessoa("Joao", "Antonio", "Manaus", "2006-04-05");

		Pessoa pessoa3 = new Pessoa("Matheus", "Peixoto", "Tocantins", "2000-04-05");

		Pessoa pessoa4 = new Pessoa("Raul", "Osorio", "Goiania", "2010-04-05");

		pessoas.add(pessoa0);
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		for (Pessoa p : pessoas) {
			if (p.getIdade() >= 18) {
				System.out.println(p);
			}
		}
	}
}