package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio_2 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int somarNumeroPares = numeros.stream().filter(numero -> (numero%2 == 0)).mapToInt(Integer::intValue).sum();
		
		System.out.print(somarNumeroPares);
		
		
		/*
		 * Usando um Function Interface
		 */
		
		Function<Integer,Boolean> numerosPares = numero -> numero%2==0;
		
		 int somaPares = numeros.stream()
                 .filter(numero -> numerosPares.apply(numero)) // Usando a função para filtrar números pares
                 .mapToInt(Integer::intValue)              // Converte Integer para int
                 .sum();                                   // Soma os números

System.out.println("\nA soma dos números pares é: " + somaPares);
	}
}
