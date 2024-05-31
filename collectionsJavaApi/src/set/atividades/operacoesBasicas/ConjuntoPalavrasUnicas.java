package set.atividades.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String>  palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
	    this.palavrasUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
	    palavrasUnicas.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if(!palavrasUnicas.isEmpty()) {
			if(palavrasUnicas.contains(palavra)) {
				palavrasUnicas.remove(palavra);
			}else {
				System.out.println("Palavra não existente na lista!");
			}
		}else {
			System.out.println("Não possui palavras na lista!");
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		return palavrasUnicas.contains(palavra);
	}
	
	public void exibirPalavra() {
		if (!palavrasUnicas.isEmpty()) {
			System.out.println(palavrasUnicas);
	    } else {
	    	System.out.println("O conjunto está vazio!");
	    }
	}
	
	 public static void main(String[] args) {
	    
	    ConjuntoPalavrasUnicas frutas = new ConjuntoPalavrasUnicas();

	    frutas.adicionarPalavra("Manga");
	    frutas.adicionarPalavra("Limão");
	    frutas.adicionarPalavra("Laranja");
	    frutas.adicionarPalavra("Pera");
	    frutas.adicionarPalavra("Caju");
	    frutas.adicionarPalavra("Amora");

	    frutas.exibirPalavra();

	    frutas.removerPalavra("Pera");
	    frutas.exibirPalavra();

	    frutas.removerPalavra("Caju");

	    System.out.println("A fruta manga está no conjunto? " + frutas.verificarPalavra("Manga"));
	    System.out.println("A fruta Pera está no conjunto? " + frutas.verificarPalavra("Pera"));

	    frutas.exibirPalavra();
	  }
}
