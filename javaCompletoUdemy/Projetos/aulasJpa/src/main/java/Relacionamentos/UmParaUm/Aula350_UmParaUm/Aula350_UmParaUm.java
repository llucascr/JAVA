package Relacionamentos.UmParaUm.Aula350_UmParaUm;

import DAO.DAO;
import Relacionamentos.UmParaUm.Aula348_UmParaUm.Assento;
import Relacionamentos.UmParaUm.Aula348_UmParaUm.Cliente;

public class Aula350_UmParaUm {

    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println("Assento: " +cliente.getAssento().getNome());
//        System.out.println("Cliente: " + cliente.getAssento().getCliente().getNome());

        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(1L);

        System.out.println("Cliente: " + assento.getCliente().getNome());

        daoAssento.fechar();

    }
}
