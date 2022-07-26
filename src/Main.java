import br.com.lginfo.desafio.dominio.BootCamp;
import br.com.lginfo.desafio.dominio.Curso;
import br.com.lginfo.desafio.dominio.Dev;
import br.com.lginfo.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Web");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java - II");
        curso2.setDescricao("Curso Java Web - II");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java Web");
        mentoria1.setDescricao("Aplicação Java Web de ponta a ponta");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);
        //Mentoria mentoria2 = new Mentoria();

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Bootcamp Java Web do básico ao deploy");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo Cordeiro");
        devLeonardo.inscreverBootCamp(bootCamp);
        //devLeonardo.setConteudosInscritos();

        Dev devMariazinha = new Dev();
        devMariazinha.setNome("Mariazinha Sousa");
        devMariazinha.inscreverBootCamp(bootCamp);

        System.out.println("Nome Dev: " + devLeonardo.getNome() + " "   + "Conteúdos inscritos: " + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devLeonardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLeonardo.getConteudosConcluidos());
        System.out.println("XP: " + devLeonardo.calcularTotalXp());

        System.out.println("----*----");

        System.out.println("Nome Dev: " + devMariazinha.getNome() + " " + "Conteúdos inscritos: " + devMariazinha.getConteudosInscritos());
        devMariazinha.progredir();
        devMariazinha.progredir();
        devMariazinha.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devMariazinha.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMariazinha.getConteudosConcluidos());
        System.out.println("XP: " + devMariazinha.calcularTotalXp());

    }

}


