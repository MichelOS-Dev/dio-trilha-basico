package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio_1 {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().sorted().toList().forEach(numero -> System.out.print(numero+" "));

		/*
		 * Explicação da resolução para fins de uso futuros do métodos usados:
		 * 1. sorted(): O método sorted() é usado no fluxo para ordenar os elementos. Por padrão, sorted() ordena os elementos em ordem natural crescente.
		 *  O método collect(Collectors.toList()) é usado para coletar os elementos ordenados de volta em uma lista, logo poderia ser usado, porém posso simplificar para simplesmente toList(), que é usado para coletar os elementos ordenados em uma lista. Este método retorna uma lista não modificável.
		 *  O método forEach(System.out::println) é usado para imprimir cada elemento da lista ordenada, pulando linha. Porém usei uma expressão lambda para mostrar na mesma linha, porém com um espaço depois de cada numero.
		 */
	}

}
