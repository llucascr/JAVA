package Relacionamentos.UmParaUm.Aula348_UmParaUm;

import DAO.DAO;

public class Aula348_UmParaUm {

    public static void main(String[] args) {

        Assento assento = new Assento("17A");
        Cliente cliente = new Cliente("Patricia", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .inserir(assento) // INSERT assento primeiro
                .inserir(cliente) // depois INSERT no cliente
                .fecharTransacao()
                .fechar();
    }
}
