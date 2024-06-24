package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso de Java");
		curso.setCargaHoraria(5);
		curso.setDescricao("Curso de aprendizado sobre Java!");
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Javascript");
		curso1.setCargaHoraria(4);
		curso1.setDescricao("Curso de aprendizado sobre Javascript!");
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Mentoria de aprendizado sobre Java!");
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Javascript");
		mentoria1.setData(LocalDate.now());
		mentoria1.setDescricao("Mentoria de aprendizado sobre Javascript!");		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMichel = new Dev();
		devMichel.setNome("Michel");
		devMichel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: "+ devMichel.getConteudosInscritos());
		devMichel.progredir();
		devMichel.progredir();
		devMichel.progredir();
		devMichel.progredir();
		System.out.println("Conteúdos Inscritos: "+ devMichel.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: "+ devMichel.getConteudosConcluidos());
		System.out.println("XP: "+ devMichel.calcularTotalXp());
		
		System.out.println("##############################");
		
		Dev devCamilla = new Dev();
		devCamilla.setNome("Camilla");
		devCamilla.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: "+ devCamilla.getConteudosInscritos());
		devCamilla.progredir();
		System.out.println("Conteúdos Inscritos: "+ devCamilla.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: "+ devCamilla.getConteudosConcluidos());
		devCamilla.progredir();
		System.out.println("XP: "+ devCamilla.calcularTotalXp());

	}
}
