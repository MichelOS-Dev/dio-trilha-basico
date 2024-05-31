package set.atividades.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.management.RuntimeErrorException;



public class GerenciadorAlunos {
	private Set<Aluno> conjuntoAlunos;
	
	public GerenciadorAlunos (){
		this.conjuntoAlunos = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		conjuntoAlunos.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAlunoPorMatricula(long matricula) {
		Aluno alunoRemover = null;
		if(!conjuntoAlunos.isEmpty()) {
			for(Aluno al: conjuntoAlunos) {
				if(al.getMatricula().equals(matricula)) {
					alunoRemover = al;
					conjuntoAlunos.remove(alunoRemover);
					break;
				}
			}
		}else {
			System.out.println("Lista Vazia!");
		}
		
		if(alunoRemover == null) {
			System.out.println("Matrícula não encontrada");
		}
	}
	
	public void exibirAlunosPorNome(){
		Set<Aluno> alunoPorNome = new TreeSet<>(conjuntoAlunos);
		
		if(!conjuntoAlunos.isEmpty()) {
			System.out.println(alunoPorNome);
		}else {
			System.out.println("Lista vazia!");
		}
	}
	
	public void exibirAlunosPorNota(){
		Set<Aluno> alunoPorNota = new TreeSet<>(new CompararPorNota());
		
		if(!conjuntoAlunos.isEmpty()) {
			alunoPorNota.addAll(conjuntoAlunos);
			System.out.println(alunoPorNota);
		}else {
			System.out.println("Lista vazia!");
		}
	}
	
	public static void main(String[] args) {

	    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

	    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Lucas", 123456L, 4);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

	    System.out.println("Alunos no gerenciador:");
	    System.out.println(gerenciadorAlunos.conjuntoAlunos);

	    gerenciadorAlunos.removerAlunoPorMatricula(000L);
	    gerenciadorAlunos.removerAlunoPorMatricula(123457L);
	    System.out.println(gerenciadorAlunos.conjuntoAlunos);

	    gerenciadorAlunos.exibirAlunosPorNome();

	    gerenciadorAlunos.exibirAlunosPorNota();
	  }
	
}
