package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosConcluidos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp/* Ou conteudo -> conteudo.calcularXp()*/).sum();
	}

	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudosInscritos;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudosConcluidos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosInscritos, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(nome, other.nome);
	}

	
}
