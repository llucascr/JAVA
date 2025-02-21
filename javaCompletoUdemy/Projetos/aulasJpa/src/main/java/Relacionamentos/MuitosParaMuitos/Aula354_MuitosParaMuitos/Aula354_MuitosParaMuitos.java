package Relacionamentos.MuitosParaMuitos.Aula354_MuitosParaMuitos;

import DAO.DAO;

public class Aula354_MuitosParaMuitos {

    public static void main(String[] args) {

        Tio tia1 = new Tio("Joao");
        Tio tia2 = new Tio("Lucia");

        Sobrinho sobrinho1 = new Sobrinho("Davi");
        Sobrinho sobrinho2 = new Sobrinho("Ana");

        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1); // Bidirecional

        tia1.getSobrinhos().add(sobrinho2);
        sobrinho1.getTios().add(tia2);

        tia2.getSobrinhos().add(sobrinho1);
        sobrinho2.getTios().add(tia2);

        tia2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tia2);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .inserir(tia1)
                .inserir(tia2)
                .inserir(sobrinho1)
                .inserir(sobrinho2)
                .fecharTransacao()
                .fechar();

    }
}
