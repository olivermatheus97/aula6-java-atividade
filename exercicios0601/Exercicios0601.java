package exercicios0601;

import java.util.Arrays;
import java.util.List;

public class Exercicios0601 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 1, 50, 34, 70, 100, 4, 4, 3, 5, 6, 7, 8, 10);

		numeros.sort((a, b) -> a.compareTo(b));

		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}