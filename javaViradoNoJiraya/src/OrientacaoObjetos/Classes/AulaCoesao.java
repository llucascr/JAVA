package OrientacaoObjetos.Classes;

public class AulaCoesao {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Serjao";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
