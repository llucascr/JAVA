package ArraysCollections.Collections.Aula133_List;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        Usuario usuario = (Usuario) obj;
        return this.nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
