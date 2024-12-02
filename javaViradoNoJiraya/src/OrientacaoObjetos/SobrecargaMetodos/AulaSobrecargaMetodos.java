package OrientacaoObjetos.SobrecargaMetodos;

public class AulaSobrecargaMetodos {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();

//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

        anime.init("Akudama Drive", "TV", 12);

        anime.init("Akudama Drive 2", "TV", 12, "Ação");

        anime.imprimir();


    }
}
