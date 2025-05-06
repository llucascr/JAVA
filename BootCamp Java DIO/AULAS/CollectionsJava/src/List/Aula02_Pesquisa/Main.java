package List.Aula02_Pesquisa;

public class Main {

    public static void main(String[] args) {
        // 1. Catálogo de Livros
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("A Psicologia Financeira", "Morgan Housel", 2024);

        System.out.println(catalogo.pesquisarPorAutor("Morgan Housel"));

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2025));

        System.out.println(catalogo.pesquisarPorTitulo("Harry Potter"));
    }
}
