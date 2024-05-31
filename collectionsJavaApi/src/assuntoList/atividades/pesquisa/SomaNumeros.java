package assuntoList.atividades.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeroList;
	
	public SomaNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		if(!numeroList.isEmpty()) {
			for(int numero: numeroList) {
				soma += numero;
			}
		}else {
			throw new RuntimeException("Lista Vazia!");
		}
		
		return soma;
	}
	
	public int retornaMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		
		if(!numeroList.isEmpty()) {
			for(Integer numero: numeroList) {
				if(numero > maiorNumero)
					maiorNumero = numero;
			}
			return maiorNumero;
		}else {
			throw new RuntimeException("\n Lista Vazia!");
		}
	}
	
	public int retornaMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		
		if(!numeroList.isEmpty()) {
			for(Integer numero: numeroList) {
				if(numero < menorNumero)
					menorNumero = numero;
			}
			return menorNumero;
		}else {
			throw new RuntimeException("\n Lista Vazia!");
		}
	}
	
	public void exibirNumeros() {
		if(!numeroList.isEmpty()) {
			System.out.println("Números: "+numeroList);
		}else {
			throw new RuntimeException("\n Lista vazia!");
		}
	}

	public static void main(String[] args) {
		SomaNumeros listNumeros = new SomaNumeros();
		
		//listNumeros.exibirNumeros();
		//listNumeros.retornaMaiorNumero();
		//listNumeros.retornaMenorNumero();
		//listNumeros.calcularSoma();
		
		listNumeros.adicionarNumero(9);
		listNumeros.adicionarNumero(21);
		listNumeros.adicionarNumero(12);
		listNumeros.adicionarNumero(11);
		listNumeros.adicionarNumero(3);
		listNumeros.adicionarNumero(56);
		listNumeros.adicionarNumero(50);
		
		listNumeros.exibirNumeros();
		System.out.println("Maior número da lista: " + listNumeros.retornaMaiorNumero());
		System.out.println("Menor número da lista: "+listNumeros.retornaMenorNumero());
		System.out.println("Soma de todos os números presente na lista: "+listNumeros.calcularSoma());
	}
}
