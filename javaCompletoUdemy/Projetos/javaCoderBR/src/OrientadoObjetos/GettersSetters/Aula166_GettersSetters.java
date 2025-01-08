package OrientadoObjetos.GettersSetters;

public class Aula166_GettersSetters {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Lucas", "Campos", 19);
        // alterar (Setters)
//        p1.idade = -30; // ERRADO
//        p1.setIdade(-30); // CERTO


        // ler (Getters)
//        System.out.println(p1.idade); // ERRADO
        System.out.println(p1.getIdade()); // CERTO
        System.out.println(p1.getNome());
        System.out.println(p1); // toString

        System.out.println(p1.getNomeCompleto());
    }
}
