package ArraysCollections.Collections.Aula138_HashCode;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario (String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.length();
//        return Objects.hashCode(nome);
    }
}
