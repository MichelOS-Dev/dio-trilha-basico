package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio_3 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> numerosPositivos = num -> num > 0;
		
		numeros.stream().allMatch(numerosPositivos);
		//ou
		boolean todosPositivos = numeros.stream().allMatch(num -> num > 0);
		
		/*
		 * O método allMatch(numero -> numero > 0) é usado para verificar se todos os
		 * elementos da lista satisfazem a condição numero > 0 (ou seja, se são
		 * positivos). Este método retorna true se todos os elementos satisfazem o
		 * predicado, e false caso contrário.
		 */
		
		System.out.println(todosPositivos);
	}
}
