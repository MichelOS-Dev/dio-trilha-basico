package desafios_StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio_4 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> valoresImpares = n -> n%2 == 0;
		
		numeros.stream().filter(valoresImpares).toList().forEach(numero -> 	System.out.print(numero +" "));
		//ou
		System.out.printf("\n");
		numeros.stream().filter(n -> n%2 == 0).collect(Collectors.toList()).forEach(numero -> System.out.printf(numero +" "));
	}
}
