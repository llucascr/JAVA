import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas", "24004942", "Engenharia de Software");
        Aluno a2 = new Aluno("Luiz", "24003245", "Engenharia de Software");
        Aluno a3 = new Aluno("Iris", "24002145", "Publicidade");
        Aluno a4 = new Aluno("Joao", "25002235", "Odonto");

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        alunos.stream()
                .filter(a -> a.ra.substring(0, 2).equals("24"))
                .filter(a -> a.curso.equalsIgnoreCase("Engenharia de Software"))
                .forEach(System.out::println);

    }
}