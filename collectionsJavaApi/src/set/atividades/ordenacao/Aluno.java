package set.atividades.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private Long matricula;
	private double nota;
	
	@Override
	public int compareTo(Aluno alu) {
		return nome.compareTo(alu.getNome());
	}
	
	public Aluno(String nome, Long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Long getMatricula() {
		return matricula;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getMatricula());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "{ "+nome+" - "+matricula+" - "+nota+" }";
	}

}

class CompararPorNota implements Comparator<Aluno>{
	@Override
	public int compare(Aluno nota_1, Aluno nota_2) {
		return Double.compare(nota_1.getNota(), nota_2.getNota());
	}
	
}