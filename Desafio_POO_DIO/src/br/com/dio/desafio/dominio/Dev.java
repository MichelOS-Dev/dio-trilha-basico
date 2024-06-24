package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudo = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
	}
	
	public void progredir() {
		
	}
	
	public void calcularTotalXp() {
		
	}

	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudo() {
		return conteudo;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, conteudoConcluidos, nome);
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
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(nome, other.nome);
	}

	
}
