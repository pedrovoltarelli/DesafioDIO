package com.devpx;

import com.devpx.domain.Curso;
import com.devpx.domain.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Java ao alem");
        curso1.setDescricao("Curso completo de Java");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("A pratica do Java");
        mentoria1.setDescricao("Mentoria para praticar o Java");
        mentoria1.setData(java.time.LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}