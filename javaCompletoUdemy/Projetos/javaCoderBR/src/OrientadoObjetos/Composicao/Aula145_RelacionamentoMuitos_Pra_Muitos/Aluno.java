package OrientadoObjetos.Composicao.Aula145_RelacionamentoMuitos_Pra_Muitos;

import java.util.ArrayList;
//import java.util.List;

public class Aluno {

    final String nome;
    ArrayList<Curso> cursos = new ArrayList<>();
//    List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    void mostrarCursos() {
        System.out.println("Cursos Aluno/a " + this.nome);
        for (Curso curso : cursos) {
            System.out.print(curso.nome + ", ");
        }
        System.out.println("\n");
    }

    Curso obterCurso(String nome) {
        for (Curso curso : this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
