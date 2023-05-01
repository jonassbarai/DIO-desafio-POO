import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso = new Curso("Lógica de Programação","Curso de lógica", 30);

        Mentoria mentoria = new Mentoria("mentoria em java","descrição mentoria em java", LocalDate.now());

        System.out.println(mentoria);

    }
}