package assuntoList.atividades.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeros; 
	
	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
		Collections.sort(numerosAscendentes);
		return numerosAscendentes;
	}
	
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
		numerosDescendentes.sort(Collections.reverseOrder());
		return numerosDescendentes;
	}
	
	
	public void mostrarNumeros() {
		System.out.println(numeros);
	}	
	
	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		
	    numeros.adicionarNumero(11);
	    numeros.adicionarNumero(51);
	    numeros.adicionarNumero(24);
	    numeros.adicionarNumero(43);
	    numeros.adicionarNumero(20);
	    
	    System.out.print("Números na lista: ");
	    numeros.mostrarNumeros();
	    
	    System.out.println("Lista de números Ascendente: "+numeros.ordenarAscendente());
	    System.out.println("Lista de números Descendente: "+numeros.ordenarDescendente());

	}
	
}
