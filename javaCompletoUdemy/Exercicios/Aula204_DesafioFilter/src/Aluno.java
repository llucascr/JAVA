public class Aluno {
    public String nome;
    public String ra;
    public String curso;

    public Aluno(String nome, String ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "{nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
