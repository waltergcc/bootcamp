import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Um curso de java");
        curso1.setCargaHoraria(16);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Um curso de Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Desbravando o Java");
        mentoria1.setDescricao("Aprenda com profissionais da área");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java Developer");
        bootcamp1.setDescricao("Abstraindo um curso em Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devWalter = new Dev();
        devWalter.setNome("Walter");
        devWalter.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos " + devWalter.getConteudosInscritos());
        devWalter.progredir();
        devWalter.progredir();
        devWalter.progredir();
        System.out.println("Conteúdos Concluídos " + devWalter.getConteudosConcluidos());
        System.out.println("XP: " + devWalter.calcularTotalXp());

        Dev devThalita = new Dev();
        devThalita.setNome("Thalita");
        devThalita.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos " + devThalita.getConteudosInscritos());
        devThalita.progredir();
        System.out.println("Conteúdos Concluídos " + devThalita.getConteudosConcluidos());
        System.out.println("XP: " + devThalita.calcularTotalXp());


    }

}
