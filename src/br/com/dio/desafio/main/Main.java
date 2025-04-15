package br.com.dio.desafio.main;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
	
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());

        System.out.println("-------");

        Dev devCaio = new Dev();
        devCaio.setNome("Joao");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Caio:" + devCaio.getConteudosConcluidos());
        System.out.println("XP:" + devCaio.calcularTotalXp());

    }

}
