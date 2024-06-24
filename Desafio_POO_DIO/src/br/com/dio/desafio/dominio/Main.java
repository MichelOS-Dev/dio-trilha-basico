package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso de Java");
		curso.setCargaHoraria(12);
		curso.setDescricao("Curso de aprendizado sobre Java!");
		System.out.println(curso);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Javascript");
		curso1.setCargaHoraria(10);
		curso1.setDescricao("Curso de aprendizado sobre Javascript!");
		System.out.println(curso1);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Mentoria de aprendizado sobre Java!");
		System.out.println(mentoria);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Javascript");
		mentoria1.setData(LocalDate.now());
		mentoria1.setDescricao("Mentoria de aprendizado sobre Javascript!");
		System.out.println(mentoria1);
	}
}
