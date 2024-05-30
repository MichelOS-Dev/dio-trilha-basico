package assuntoList.exemplos.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> listaLivros;

	public CatalogoLivros() {
		this.listaLivros = new ArrayList<>();
	}
	
	public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
		listaLivros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisaPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!listaLivros.isEmpty()) {
			for(Livro livro: listaLivros) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
		List<Livro> listaLivrosPorIntervalo = new ArrayList<>();
		
		if(!listaLivros.isEmpty()) {
			for(Livro livros: listaLivros) {
				if((livros.getAnoPublicacao() >= anoInicial) && (livros.getAnoPublicacao() <= anoFinal)) {
					listaLivrosPorIntervalo.add(livros);
				}
			}
		}
		
		return listaLivrosPorIntervalo;
	}
	
	public Livro pesquisarPorTitulo(String titulo){
		Livro livro = null;
		if(!listaLivros.isEmpty()) {
			for(Livro livros: listaLivros) {
				if(livros.getTitulo().equalsIgnoreCase(titulo)){
					livro = livros;
					break;
				}
			}
		}
		return livro;
	}
	
	public static void main(String[] args) {
		CatalogoLivros listLivros = new CatalogoLivros();
		
		System.out.println("Livros pelo autor:"+ listLivros.pesquisaPorAutor("João"));
		System.out.println("Livros por intervalo de anos:"+ listLivros.pesquisarPorIntervaloDeAnos(2019,2021));
		System.out.println("Livro pesquisado pelo titulo:"+ listLivros.pesquisarPorTitulo("A fera"));
		
		listLivros.adicionarLivros("A fera", "João", 2018);
		listLivros.adicionarLivros("Calmo", "Luisa", 2020);
		listLivros.adicionarLivros("Janela Aberta", "Joana", 2019);
		listLivros.adicionarLivros("O teto", "Raphael", 2022);
		listLivros.adicionarLivros("Musical", "Carlos", 2021);
		listLivros.adicionarLivros("Musical", "Júnior", 2023);
		
		System.out.println("Livros pelo autor:"+ listLivros.pesquisaPorAutor("João"));
		System.out.println("Livros pelo autor:"+ listLivros.pesquisaPorAutor("Carlos"));
		System.out.println("Livros por intervalo de anos:"+ listLivros.pesquisarPorIntervaloDeAnos(2019,2021));
		System.out.println("Livros por intervalo de anos:"+ listLivros.pesquisarPorIntervaloDeAnos(2018,2020));
		System.out.println("Livro pesquisado pelo titulo:"+ listLivros.pesquisarPorTitulo("A fera"));
		System.out.println("Livro pesquisado pelo titulo:"+ listLivros.pesquisarPorTitulo("Musical"));
		
	}
}

























