package ClassesMetodos.Aula129_EqualsHashCode;

public class Usuario {
    String nome;
    String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;

            boolean nomeIgaul = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgaul && emailIgual;

        } else {
            return false;
        }
    }
}
