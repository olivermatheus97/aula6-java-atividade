package exercicios0602;

import java.util.ArrayList;
import java.util.List;

public class Aula0602 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		nomes.add("#Antonio");
		nomes.add("@Elefantinho");
		nomes.add("#Panqueca");
		nomes.add("#Mabel");
		nomes.add("#Pitty");
		nomes.add("@Vinagrete");

		for (String nome : nomes) {
			if (nome.startsWith("#")) {
				System.out.println(nome);
			}
		}
	}

}