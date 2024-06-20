package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Desafio_6 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> numerosAcima10 = n -> n > 10;
		
		boolean possui = numeros.stream().anyMatch(numerosAcima10);

		System.out.println(possui);
	}
}
