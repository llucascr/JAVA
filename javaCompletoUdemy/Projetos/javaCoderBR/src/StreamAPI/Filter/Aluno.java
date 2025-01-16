package StreamAPI.Filter;

public class Aluno {

    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Nota: " + nota;
    }
}
