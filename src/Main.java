import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso("Lógica de Programação","Curso de lógica", 30);
    Curso curso2 = new Curso("Curso js","Curso de javascript iniciantea", 30);



        Mentoria mentoria = new Mentoria("mentoria em java","descrição mentoria em java", LocalDate.now());
    System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev jonas = new Dev();
        jonas.setNome("Jonas");
        jonas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + jonas.getConteudosInscritos());
        System.out.println("--------------------------");
        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + camila.getConteudosInscritos());

        System.out.println("--------------------------");
        jonas.progredir();
        System.out.println("Conteudos inscritos:" + jonas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + jonas.getConteudosConcluidos());

        System.out.println("--------------------------");
        System.out.println("jonas XP:" + jonas.calcularTotalXP());
        System.out.println("Camila XP:" + camila.calcularTotalXP());
        System.out.println("--------------------------");
        jonas.progredir();
        camila.progredir();
        System.out.println("jonas XP:" + jonas.calcularTotalXP());
        System.out.println("Camila XP:" + camila.calcularTotalXP());
        System.out.println("--------------------------");
        jonas.progredir();
        camila.progredir();
        System.out.println("jonas XP:" + jonas.calcularTotalXP());
        System.out.println("Camila XP:" + camila.calcularTotalXP());



    }
}