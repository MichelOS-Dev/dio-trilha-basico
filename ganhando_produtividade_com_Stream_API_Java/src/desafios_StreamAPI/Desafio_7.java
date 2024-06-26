package desafios_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio_7 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,10);

		Optional<Double> segundoMaiorNumero = numeros.stream().mapToDouble(Integer::doubleValue).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		if(segundoMaiorNumero.isPresent()) {
			System.out.print(segundoMaiorNumero.get());
		}else {
			System.out.print("Não existe o segundo número maior!");
		}
	}
}
