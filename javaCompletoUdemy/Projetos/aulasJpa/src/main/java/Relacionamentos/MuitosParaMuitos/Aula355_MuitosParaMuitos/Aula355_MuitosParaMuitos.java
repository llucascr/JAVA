package Relacionamentos.MuitosParaMuitos.Aula355_MuitosParaMuitos;

import DAO.DAO;

public class Aula355_MuitosParaMuitos {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Harry Potter", 8.7);
        Filme filmeB = new Filme("Beauty and the Beast", 8.0);

        Ator atorA = new Ator("Radcliffe");
        Ator atrizB = new Ator("Emma Watson");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atrizB);

        DAO<Filme> dao = new DAO<>(Filme.class);
        dao.incluirCompleto(filmeA); // vai inserir em cacata o atorA e AtrizB


    }
}
