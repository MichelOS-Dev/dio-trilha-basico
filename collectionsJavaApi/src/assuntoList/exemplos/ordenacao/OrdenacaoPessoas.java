package assuntoList.exemplos.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> listaPessoas;
	
	public OrdenacaoPessoas() {
		this.listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoas(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
		
		listaPessoas.adicionarPessoas("João", 20, 1.69);
		listaPessoas.adicionarPessoas("Maria", 18, 1.71);
		listaPessoas.adicionarPessoas("Carlos", 31, 1.74);
		listaPessoas.adicionarPessoas("Raphael", 27, 1.70);
		listaPessoas.adicionarPessoas("Letícia", 17, 1.58);
		listaPessoas.adicionarPessoas("Joana", 28, 1.80);
		listaPessoas.adicionarPessoas("Yasmin", 32, 1.59);
		
		System.out.println(listaPessoas.ordenarPorAltura());
		System.out.println(listaPessoas.ordenarPorIdade());
		
	}
}
