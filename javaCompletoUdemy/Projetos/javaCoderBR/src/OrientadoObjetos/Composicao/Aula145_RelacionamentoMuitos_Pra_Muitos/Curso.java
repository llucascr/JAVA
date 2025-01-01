package OrientadoObjetos.Composicao.Aula145_RelacionamentoMuitos_Pra_Muitos;

import java.util.ArrayList;

public class Curso {

    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();
    //

    Curso(String nome) {
        this.nome = nome;
    }

    void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }



}
