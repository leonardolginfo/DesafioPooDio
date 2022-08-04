package br.com.lginfo.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Web");
        curso1.setCargaHoraria(40);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java - II");
        curso2.setDescricao("Curso Java Web - II");
        curso2.setCargaHoraria(40);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java Web");
        mentoria1.setDescricao("Aplicação Java Web de ponta a ponta");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
        //Mentoria mentoria2 = new Mentoria();

    }
}
