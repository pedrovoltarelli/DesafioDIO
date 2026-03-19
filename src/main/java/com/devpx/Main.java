package com.devpx;

import com.devpx.domain.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        curso1.setTitulo("Java ao alem");
        curso1.setDescricao("Curso completo de Java");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("A pratica do Java");
        mentoria1.setDescricao("Mentoria para praticar o Java");
        mentoria1.setData(java.time.LocalDate.now());

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para se tornar um Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        dev1.setNome("João");
        dev2.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos João: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluídos João: " + dev1.getConteudosConcluidos());
        System.out.println("XP total João: " + dev1.calcularTotalXp());

        System.out.println("Conteúdos inscritos Maria: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos concluídos Maria: " + dev2.getConteudosConcluidos());
        System.out.println("XP total Maria: " + dev2.calcularTotalXp());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}