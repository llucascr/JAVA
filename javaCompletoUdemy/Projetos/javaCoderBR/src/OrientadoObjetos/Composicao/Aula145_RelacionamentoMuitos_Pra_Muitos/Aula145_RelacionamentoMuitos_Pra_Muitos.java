package OrientadoObjetos.Composicao.Aula145_RelacionamentoMuitos_Pra_Muitos;

public class Aula145_RelacionamentoMuitos_Pra_Muitos {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Lucas");
        Aluno aluno2 = new Aluno("Iris");
        Aluno aluno3 = new Aluno("Luiz");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Kotlin");
        Curso curso3 = new Curso("Arquitetura de Software");

        // acrecentando o curso em um aluno
        aluno1.addCurso(curso1);
        aluno1.addCurso(curso2);

        aluno2.addCurso(curso2);
        aluno3.addCurso(curso3);

        // Acrecentando um aluno em um curso
        curso3.addAluno(aluno1);
        curso2.addAluno(aluno3);

        aluno1.mostrarCursos();
        aluno2.mostrarCursos();
        aluno3.mostrarCursos();

        System.out.println("-------------------------------------");
        // Mostrando alunos do Curso
        for (Aluno aluno : curso1.alunos){
            System.out.println(curso1.nome);
            System.out.println("Nome: " + aluno.nome);
        }

        System.out.println("-------------------------------------");

        // Metodo Obter Curso por nome
        Curso cursoEncontrado = aluno2.obterCurso("Kotlin"); // ERRO por que ele retornou um null
        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        } else {
            System.out.println("Curso não encontrado");
        }
    }
}
