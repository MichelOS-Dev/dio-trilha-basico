package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio_5 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,10);
		
		Predicate<Integer> numerosAcima5 = n -> n > 5;
		
		OptionalDouble media = numeros.stream().filter(numerosAcima5).mapToDouble(Integer::doubleValue).average();

		System.out.println(media);
	}
}
